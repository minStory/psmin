package day28;

public class InnerClass1 {

	public static void main(String[] args) {

	}
}
class A{
	static class StaticInner{}
	class InstanceInner{}
	
	StaticInner st1=new StaticInner();
	InstanceInner ii1=new InstanceInner();
	
	static void StaticMethod() {
		StaticInner st2=new StaticInner();
//		InstanceInner ii2=new InstanceInnner();	-> 스태틱메서드는 인스턴스 멤버에 접근 불가능 (스태틱이 생성시기 빠름)
	}
	void InstanceMethod() {
		StaticInner st3=new StaticInner();
		InstanceInner ii3=new InstanceInner();
	}
}
