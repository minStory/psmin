package parkseongmin;

public class SumExample {

	public static void main(String[] args) {
		Calculator cal=new Calculator(1,2);
		
		Calculator.Calc c=cal.new Calc();
		
		System.out.println("�հ� : "+c.add());
	}

}

class Calculator{	//�ܺ� ���� : �ܺ� Ŭ����
	private int val1;
	private int val2;	//���׿����� : val1 + val2
	
	Calculator(int a, int b){
		val1=a;
		val2=b;
//		Calc c=new Calc();
//		c.add(a,b);
	}
	
	class Calc{	//���� Ŭ���� : ���ϱ� ��ư : �ϳ��� ���
		public int add() {
			return val1 + val2;
		}
	}
}