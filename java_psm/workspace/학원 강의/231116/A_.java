package parkseongmin;

public class A_ {

	public static void main(String[] args) {
		//�ܺ� ��ü ����
		A1 a=new A1();
		a.field=10;
		a.methodA();
		
		
		//���� ��ü ����
		A1.B b=a.new B();
		
		//A��ü�� �������� �ʾƵ� B��ü ���� ����
		A3.B3 b2=new A3.B3();
		b2.methodB();	//�������̶� ���� ��ü�� �����ϰ� �޼��带 ȣ���� �� �ִ�.
		
		//PrintOut �ܺ�Ŭ�������� Out ����Ŭ������ ���������� ȣ���Ѵ�.
		PrintOut.Out o=new PrintOut.Out();
		String str="���� ����Ŭ���� �׽�Ʈ";
		o.println(str);
		
		A4 a2=new A4();	//A4��� �ܺ�Ŭ������ �ν��Ͻ� ����
		a2.useB(10);
		
		//����Ŭ����-> private ���� ���� �����
		PermitExample pe=new PermitExample();
		pe.getInClass().print();
		
		//��ø ����Ŭ������ Ȱ���� �������̽� ��ü ���� ���
		
		//Button�� ��ü�� �����Ѵ�.
		Button btnOk=new Button();
		
		class OkListener implements Button.ClickListener{
			public void onClick() {
				System.out.println("OK ��ư�� Ŭ���߽��ϴ�.");
			}
		}
		
		btnOk.setClickListener(new OkListener()); //OK ��ư�� Ŭ���ϴ� ��ü�� �����ؼ� �����.
		btnOk.click();	//�޼��带 ȣ���ؼ� Ȯ���Ѵ�.
	}
}

//2. ��� Ŭ���� ���� ������(private)
//���� Ŭ���� private �ܺ�Ŭ���� �޼��带 ���ؼ� Ŭ���� ������ �� �ְ� �����.
class PermitExample{	//�ܺ�Ŭ����
//	private
	class InClass{	//private : ����Ŭ������ ���ؼ� ���� ���� 
		public void print() {
			System.out.println("������ private�� �����մϴ�.");
		}
	}
	//�ܺ�Ŭ������ public method�� ���� inClass.print()�޼��忡 �����Ѵ�.
	public InClass getInClass() {
		InClass ic=new InClass();
		return ic;
	}
}

class PrintOut{	//�ܺ�Ŭ����

	//���� ���� Ŭ���� ����
	static class Out{
		//�޼��带 Ȱ���ؼ� �����.
		void println(String str) {	//str�Ű������� �޾Ƽ� ����Ѵ�.
			System.out.println(str);
		}
	}
}

