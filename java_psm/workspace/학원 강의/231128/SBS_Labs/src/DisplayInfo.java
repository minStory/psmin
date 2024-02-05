import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class DisplayInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strFilename = "twograde.csv"; //csv 파일을 읽는 경로주소 변수명을 지정한다.
		//상대 경로: src 경로
		//절대경로:  C:\\ 파일의 경로를 지정한다.


		try { //일반예외처리 try-catch 강제적 명시

			//BufferedReader 이용하여 2학년.csv 불러온다.
			Reader reader = new InputStreamReader(new FileInputStream(strFilename),"euc-kr");
			BufferedReader br = new BufferedReader(reader);

			try {
				//파일 전체적으로 읽어 데이터의 개수가 몇 개인지 파악한다.
				String strTemp;
				int nLine = 0;
				while((strTemp = br.readLine())!=null) {
					nLine++;
				}
				br.close();
				reader.close();

				int nStudent = nLine-1; //학생수
				//GIS 배열 [] 객체를 학생수 만큼 생성한다.
				GIS[] oneStudent = new GIS[nStudent];

				//Scanner 클래스를 이용하여 2학년.csv 파일을 다시 읽습니다.
				FileInputStream fin = new FileInputStream(strFilename);
				Scanner scanner = new Scanner(fin);
				strTemp = scanner.nextLine(); //제목 부분을 그냥 읽고 지나가게 수정한다.

				//구분자를 콤마(.)로 지정하고 한 줄 읽고 그 값을 저장할 배열을 선언합니다.
				String csvSplitBy = ",";
				String[] strLineArray;

				//파일을 다시 읽어 GIS [] 배열 객체 요소에 학과, 학년, 학번, 성명, 거주지역, 이메일을 할당한다.

				for(int i=0; i<nStudent; i++) {

					if(scanner.hasNextLine())
					{
						//학과 학년 학번 성명 거주지역 이메일
						strTemp = scanner.nextLine();
						strLineArray = strTemp.split(csvSplitBy);

						String strDepartment = strLineArray[0];
						String nGrade = strLineArray[1];
						String strId = strLineArray[2];
						String strName = strLineArray[3];
						String strAddress = strLineArray[4];
						String strEmail = strLineArray[5];

						//객체배열에 담기
						oneStudent[i] = new GIS(nGrade,strId,strName,strAddress,strEmail);
						oneStudent[i].SetDepartment(strDepartment);

					}

				}

				//스트림을 닫는다.
				scanner.close();
				fin.close();

				System.out.format("%s\t\t %s\t %s\t\t %s\t %s\t\t %s\n","학과","학년","학번","이름","거주지역","이메일");
				System.out.format("------------------------------------------------------------------------------------------------");
				System.out.println(); //첫번째줄이 다음줄에 나올수 있도록 코드 수정
				//for-each 문을 이용하여 정보를 출력해보자.
				for(GIS obj : oneStudent) {
					obj.Display();
				}

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (UnsupportedEncodingException | FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//GIS[] 배열 객체에 들어있는 for-each문장과 display 멤버함수를 이용하여 출력한다.

	}

}
