package day_0601;

public class Test06 {

	public static void main(String[] args) {
		Value v1=new Value(10);
		Value v2=new Value(10);
		
		if(v1.equals(v2)) {
			System.out.println("v1과 v2는 같습니다.");
		}else {
			System.out.println("v1과 v2는 다릅니다.");
		}
		
		Person p1=new Person(808L);
		Person p2=new Person(808L);
		
		if(p1.equals(p2)) {
			System.out.println("p1과 p2는 같은 사람입니다.");
		}else {
			System.out.println("p1과 p2는 다른 사람입니다.");
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