
package day28;

public class Inner4 {

	public static void main(String[] args) {
		//OuterClass ��ü ���� �� ����� ����
		//�ν��Ͻ���� ���� : �ν��Ͻ���.������;
		//static��� ���� : Ŭ������.������;
		System.out.println("===outer Ŭ���� �����ϱ�===");
		OuterClass oc=new OuterClass();
		System.out.println("OuterClass�� a�� �� : "+oc.a);
		System.out.println("OuterClass�� b�� �� : "+OuterClass.b);	//��ü �������� �ʾƵ� ��� ����
		
		//�ν��Ͻ� ���� Ŭ���� ����
		//�ܺ� Ŭ���� ��ü ����
		//		OuterClass oc2 =  new OuterClass();
		//�ܺ� Ŭ���� ��ü�� ���� Ŭ���� ��ü ����
		//		OuterClass.Inner i = oc2.new Inner();
		//���� Ŭ���� ��ü�� �޼��� ȣ��
		//		i.InnerMethod();
		System.out.println("===Inner Ŭ���� �����ϱ�===");
		OuterClass oc2=new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		
		System.out.println("Inner�� c�� �� : "+i.c);
		i.innerMethod();
		
		//����ƽ ���� Ŭ���� ����
		//����ƽ Ŭ���� ��ü ����
		//		OuterClass.StaticInner si= new OuterClass.StaticInner();
		//����ƽ Ŭ������ ����ƽ �޼��� ȣ��
		//		si.staticMethod();
		System.out.println("===StaticInner Ŭ���� �����ϱ�===");
		OuterClass.StaticInner si=new OuterClass.StaticInner();
		System.out.println("StaticInner�� d�� �� : "+si.d);
		
//		si.staticMethod();		-> staticŬ������ ��ü�� ������� �ʰ� Ŭ�������� ����ؼ� ȣ��
		OuterClass.StaticInner.staticMethod();
	}
}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}
