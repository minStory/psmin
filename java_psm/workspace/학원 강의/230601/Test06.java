package day_0601;

public class Test06 {

	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� �����ϴ�.");
		}else {
			System.out.println("v1�� v2�� �ٸ��ϴ�.");
		}
		
		Person p1=new Person(808L);
		Person p2=new Person(808L);
		
		if(p1.equals(p2)) {
			System.out.println("p1�� p2�� ���� ����Դϴ�.");
		}else {
			System.out.println("p1�� p2�� �ٸ� ����Դϴ�.");
		}
		
	}

}
class Value{
	int value;
	Value(int value){
		this.value=value;
	}
}
class Person{
	long id;
	
	public boolean equals(Object obj) {
		if(obj instanceof Person)
			return id==((Person) obj).id;
		else
			return false;
	}
	Person(long id){
		this.id=id;
	}
}