package day25;

class Polymorphism {

	public static void main(String[] args) {
		A obj=new B();	//�θ� ���� = �ڽ� �� : ��ĳ����
		obj.methodA();
//		obj.methodB();	//�����߻�
	}

}
class A{
	void methodA() {
		System.out.println("methodA");
	}
}
class B extends A{
	void methodB() {
		System.out.println("methodB");
	}
}