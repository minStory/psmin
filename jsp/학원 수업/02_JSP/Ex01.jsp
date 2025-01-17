<%@page import="java.util.Calendar"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- 
    지시어(디렉티브) : JSP 페이지에 대한 설정 정보를 지정하는 공간.
    1. <% page %>
       - JSP 페이지에 대한 정보를 지정하는 공간.
       - 어떻게 처리해야 하는지, 전달하기 위한 내용도
         담고 있는 공간.
       - 클라이언트 요청에 JSP 페이지가 실행될 때
         필요한 정보를 JSP 컨테이너(톰캣)에게 알려주는
         역할을 함.
         
    2. <% include %>
       - 현재 페이지에 다른 문서(JSP, HTML)를 가져와서
         내용을 컴파일 할 때 사용되는 디렉티브.
         형식) <% include file="포함할 파일의 url 경로" %>
       - include 지시어를 사용한 JSP 페이지가 컴파일
         되는 과정에서 include 되는 JSP 페이지의 소스
         내용을 그대로 포함해서 컴파일을 함.
       - 즉, 복사 & 붙여넣기 방식으로 두 개의 파일이 
          하나의 파일로 구성이 된 후 같이 컴파일이 됨.
         
    3. <% taglib %>
       - 사용할 태그 라이브러리를 지정하는 디렉티브.
       - EL / JSTL 언어 사용 시 적용되는 디렉티브.
         (추후 수업 진행 예정)  

 ==========================================
 1. 페이지 지시어(디렉티브)
    <%@ page language="java" contentType="text/html; 
             charset=UTF-8" pageEncoding="UTF-8"%>
       
     - language="java" : 해당 JSP 에서 사용되는 언어(java).
                           스크립트릿이나 표현식, 선언부를 작성할 때 
                           사용할 프로그래밍 언어를 지정함.
                           즉, JSP 페이지에 삽입되는 코드의 스크립팅 언어를 
                           지정.
    - contentType : 출력할 데이터의 MIME 타입과 문자 집합을 지정.
                    ==> JSP 페이지의 내용을 어떤 형태로 
                        출력할지를 웹 브라우저에게 알려주는 역할.
    - charset : 문자(한글) 설정(UTF-8, EUC-KR)
                ==> 설정하지 않으면 ISO-8859-1 을 사용함.
    - import : 다른 패키지에 있는 클래스를 가져다가 사용할 때 지정.
    - session : HttpSession 속성의 사용 여부를 지정.
                형식) <%@ page Session="true" %>
    - isErrorPage : 에러 페이지인지의 여부를 지정.
    - errorPage : 에러가 발생했을 때 보여줄 에러페이지를 지정.
    - pageEncoding="UTF-8" : 현재 페이지의 문자(한글) 설정.
                             출력할 데이터의 문자 집합을 지정함.         
 --%>
 
 <%--
 	 ★★★★★★★★★★★★★★★★★★★★
     JSP 페이지의 구성 요소
     1. 스크립트릿
        - 가장 일반적으로 JSP 페이지에서 많이 쓰이는
          스크립트 요소.
        - 주로 프로그래밍의 로직을 기술할 때 많이 사용이 됨.
        - JSP 페이지에서 자바 코드가 작성되는 공간.
        - 페이지 아무곳이나 입력가능하다.
           형식)
           		<%
                  자바 코드;
          		%>
     2. 표현식
        - 일반적으로 JSP 페이지에서 자바의 
          System.out.println() 과 유사하게 사용이 됨.
        - 데이터를 출력할 때 사용이 됨.
          형식)  <%=값 또는 변수명 또는 수식 %>
                    
     3. 선언부
        - 일반적으로 JSP 페이지에서 자바의 멤버변수 또는
          멤버 메서드를 선언할 때 사용이 됨.
          형식)
           		<%!
                  변수 선언 또는 메서드 선언;
          		%>
  --%>
  	
  <%
  	//자바 코드가 들어가는 공간
  	int su = 10;
  	
    //콘솔 창에 출력이 됨.
	System.out.println("su >> " + su);
    
    Calendar cal = Calendar.getInstance();
    
    /* int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONDAY)+1;
    int day = cal.get(Calendar.DAY_OF_MONTH);
    
    System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
    */
	
  %>
  
  <%--JSP 표현식 : 웹 브라우저에 결과값을 출력할 수 있음. --%>
  
  <p>su 변수의 값 : <%=su %></p>
  <%-- <p>오늘 날짜는 <%=year %>년 <%=month %>월 <%=day %>일 입니다.</p> --%>
  <p>오늘 날짜는 <%=cal.get(Calendar.YEAR) %>년 <%=cal.get(Calendar.MONDAY)+1 %>월 <%=cal.get(Calendar.DAY_OF_MONTH) %>일 입니다.</p>
  
  <hr>
  
  <h2>1 ~ 100까지의 합을 구해 보자.</h2>
  
  <%
  	int sum = 0;
  
  	for(int i=1; i<=100; i++){
  		sum += i;
  	}
  	
  %>
  
  <h3>1 ~ 100 까지의 합 >>> <%=sum %></h3>
  
  
  <hr>
  
  <%!
  	//메서드를 선언하는 공간
  	public int plus(int su1, int su2){
	  return su1+su2;
  }
  %>
  
  
  <h3>76 + 15 >>> <%=plus(76, 15) %></h3>
  
  
  
  
  
  
</body>
</html>