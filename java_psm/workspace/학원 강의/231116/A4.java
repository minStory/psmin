package parkseongmin;

public class A4 {
	//����Ŭ���� : ������ �Ǵ� �޼��� �ȿ��� ���� Ŭ���� ����
	A4(){
		class B{
			B(){
				System.out.println("������-������ ����");
			}
			void method1() {
				System.out.println("������-method1() ����");
			}
		}
		B b=new B();
		b.method1();
	}
	void useB(int arg) { //�޼��� ���� Ŭ���� �ۼ��ؼ� ȣ���ϴ� ���
		int val=2;
		
		class B{	//����Ŭ����
			B(){	//������ ���� ����
				System.out.println("useB()-������ ����");
			}
			void method1() {
				System.out.println("useB()-method1() ����");
				System.out.println(val);
				System.out.println(arg);
				
				//val=3;
				//arg=3;
			}
		}
		//�ܺ�Ŭ���� �޼��� �ȿ��� B��� ����Ŭ������ �����ϰ� ȣ���Ѵ�.
		B b=new B();
		b.method1();
	}
	
	{
		System.out.println("��(�ֿ켱 ���)");
	}
}
