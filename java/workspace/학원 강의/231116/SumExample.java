package parkseongmin;

public class SumExample {

	public static void main(String[] args) {
		Calculator cal=new Calculator(1,2);
		
		Calculator.Calc c=cal.new Calc();
		
		System.out.println("합계 : "+c.add());
	}

}

class Calculator{	//외부 계산기 : 외부 클래스
	private int val1;
	private int val2;	//이항연산자 : val1 + val2
	
	Calculator(int a, int b){
		val1=a;
		val2=b;
//		Calc c=new Calc();
//		c.add(a,b);
	}
	
	class Calc{	//내부 클래스 : 더하기 버튼 : 하나의 기능
		public int add() {
			return val1 + val2;
		}
	}
}