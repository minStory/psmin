package com.reply.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.action.Action;
import com.reply.action.ActionForward;

public class FrontController extends HttpServlet{
	
	private static final long serialVersionUID = 1L;
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 처리 작업 진행
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// 확인 목적 코드 -> 면접: URL과 URI의 차이점
		// getRequestURI() : "/프로젝트명/파일명(*.go)"
		//						문자열을 반환해주는 메서드
		
		String uri = request.getRequestURI();
		System.out.println("URI >>> " + uri);
		
		// getContextPath(): 현재 프로젝트 명을 문자열로 반환해주는 메서드
		String path = request.getContextPath();
		System.out.println("Path >>> " + path);
		
		String command = uri.substring(path.length() + 1);
		System.out.println("Command >>> " + command);
		
		Action action = null;
		
		ActionForward forward = null;
		
		Properties prop = new Properties();
		/*
		 * Properties 클래스
		 *  - java.util 패키지에 존재하는 클래스
		 *  - Properties 클래스는 HashTable의 하위 클래스이다.
		 *  - 보통은 환경변수 및 속성 값을 Properties 파일에
		 *  	저장하여 쉽게 접근할 수 있는 장점이 있다.
		 *  - Properties 파일은 일련의 키(key) - 값(value)의
		 *  	한 쌍으로 이루어져 있다.
		 *  - 보통은 파일에 저장을 하여 사용을 한다.
		 *  	파일 이름을 *.properties 라는 이름으로 끝나게 한다.
		 *  - FileInputStream 클래스에 properties 파일을
		 *  	일자로 넣어서 그 스트림으로부터 파일을 가져올 때
		 *  	많이 사용한다. 인자로 들어온 properties 파일을 읽게 된다.
		 *  - 읽어 들일 때 사용하는 메서드는 load() 라는 메서드를
		 *  	이용하여 파일을 읽어 들이게 된다.
		*/
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\JSP\\14_Board_Reply\\src\\main\\java\\com\\reply\\controller\\mapping.properties");
		
		prop.load(fis);
		
		String value = prop.getProperty(command);
		
		System.out.println("Value >>> " + value);
		
		if(value.substring(0, 7).equals("execute")){
			StringTokenizer st = new StringTokenizer(value,"|");
			
			String url_1 = st.nextToken(); // "execute"
			String url_2 = st.nextToken(); // "패키지명.클래스명"
			
			try {
				Class<?> url = Class.forName(url_2);
				
				// url.newInstance(); // 실행 중에 동적으로 객체를 생성하는 메서드(디플리케이트 -> 권장X(사용해도 문제는 없다.))
				
				/*
				 * 동적 객체 생성: newInstance()
				 *  - Class 객체를 이용하면 new 연산자의 사용 없이 동적으로
				 * 		객체 생성이 가능하다.
				 *  - 코드 작성시에 클래스의 이름을 결정할 수 없고, 런타임(실행)시에
				 *  	클래스의 이름이 결정되는 경우 유용하게 사용이 된다.
				 *  
				 *  - newInstance() 메서드는 기본생성자를 통해서 객체를 생성하기 때문에
				 *  	반드시 클래스에 기본 생성자가 존재해야 한다.
				 *  	예외가 발생할 수 있는데 해당 클래스가 추상클래스이거나 인터페이스일 경우 발생하고,
				 *  	또 하나의 예외는 클래스의 생성자가 접근제한자로 인해
				 *  	접근할 수 없는 경우에 발생을 한다.
				 *  	따라서, 예외 처리를 해주어야 한다.
				 *  
				 *  - 반환 타입은 Object 타입이므로 맞게 형변환을 해 주면 되지만,
				 *  	클래스의 타입을 모르는 상태이므로 형변환을 해줄 수가 없다.
				 *  	이러한 문제를 해결하기 위해서 인터페이스를 사용하는 것
				 *  
				 *  - Class.forName(class 이름)은 파라미터로 받은 class 이름에
				 *  	해당하는 클래스를 로딩한 후에 그 클래스에 해당하는 인스턴스를
				 *  	리턴을 해준다.
				 *  	newInstance() 메서드는 로딩한 클래스의 객체를 생성하는 메서드이고,
				 *  	이렇게 생성한 객체를 동적 객체 생성이라고 한다.
				*/
				
				// 동적으로 로딩된 클래스(객체)의 생성자(기본생성자)를 가져오는 메서드
				Constructor<?> constructor = url.getConstructor();
				
				// 가져온 생성자를 이용하여 newInstance() 메서드를 호출하여
				// 객체(인스턴스)를 생성하는 메서드
				action = (Action) constructor.newInstance();
				
				// 비즈니스 로직 메서드 호출
				forward = action.execute(request, response);
				
				} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else { // value에 들어온 값이 "execute|..."이 아닌 경우
			forward = new ActionForward();
			
			forward.setRedirect(false);
			
			forward.setPath(value);
			
		}
		
		if(forward != null) {
			if(forward.isRedirect()) { // true인 경우
				response.sendRedirect(forward.getPath());
			}else { // false인 경우
				// viewPage로 이동
				RequestDispatcher rd = request.getRequestDispatcher(forward.getPath()); // "bbs/bbs_write.jsp"
				
				rd.forward(request, response);
			}
		}
		
	}

}












