//File-Program 입출력 시 자주 사용
//filnally를 통해 프로그램 종료는 항상 해주어야 하기 때문

package day29;

public class Finally {

	public static void main(String[] args) {
		//외부로 접근
		int a=0;
		int b=2;
		try {
			System.out.println("외부로 접속");
			int c=b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("오류가 발생하였습니다.");
		}
		finally {
			System.out.println("무조건 연결 해제");
		}
	}

}
