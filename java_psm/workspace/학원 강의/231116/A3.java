package parkseongmin;

//�ܺ�Ŭ���� static �޼��� �ȿ��� ����Ŭ���� ��ü ����
public class A3 {
	//���� ��� Ŭ����
	private int val;
	private static int cnt=1;
	
	
	static class B3{
//		int val2=val;
		int cnt2=cnt;
		
		void methodB() {
			System.out.println("methodB() ����");
		}
	}
	B3 field=new B3();
	static B3 field2 =new B3();
	
	A3(){
		B3 field =new B3();
	}
	
	void method1() {
		B3 field=new B3();
	}
	static void method2() {
		B3 field=new B3();
	}
	

}
