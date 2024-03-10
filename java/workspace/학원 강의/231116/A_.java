package parkseongmin;

public class A_ {

	public static void main(String[] args) {
		//외부 객체 생성
		A1 a=new A1();
		a.field=10;
		a.methodA();
		
		
		//내부 객체 생성
		A1.B b=a.new B();
		
		//A객체를 생성하지 않아도 B객체 생성 가능
		A3.B3 b2=new A3.B3();
		b2.methodB();	//독립적이라서 직접 객체를 생성하고 메서드를 호출할 수 있다.
		
		//PrintOut 외부클래스안의 Out 내부클래스를 직접적으로 호출한다.
		PrintOut.Out o=new PrintOut.Out();
		String str="정적 내부클래스 테스트";
		o.println(str);
		
		A4 a2=new A4();	//A4라는 외부클래스의 인스턴스 생성
		a2.useB(10);
		
		//내부클래스-> private 접근 제한 사용중
		PermitExample pe=new PermitExample();
		pe.getInClass().print();
		
		//중첩 내부클래스를 활용한 인터페이스 객체 주입 방법
		
		//Button의 객체를 생성한다.
		Button btnOk=new Button();
		
		class OkListener implements Button.ClickListener{
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}
		
		btnOk.setClickListener(new OkListener()); //OK 버튼을 클릭하는 객체를 주입해서 만든다.
		btnOk.click();	//메서드를 호출해서 확인한다.
	}
}

//2. 멤버 클래스 접근 제한자(private)
//내부 클래스 private 외부클래스 메서드를 통해서 클래스 접근할 수 있게 만든다.
class PermitExample{	//외부클래스
//	private
	class InClass{	//private : 내부클래스를 통해서 접근 가능 
		public void print() {
			System.out.println("접근을 private로 제한합니다.");
		}
	}
	//외부클래스에 public method를 만들어서 inClass.print()메서드에 접근한다.
	public InClass getInClass() {
		InClass ic=new InClass();
		return ic;
	}
}

class PrintOut{	//외부클래스

	//정적 내부 클래스 선언
	static class Out{
		//메서드를 활용해서 만든다.
		void println(String str) {	//str매개변수를 받아서 출력한다.
			System.out.println(str);
		}
	}
}

