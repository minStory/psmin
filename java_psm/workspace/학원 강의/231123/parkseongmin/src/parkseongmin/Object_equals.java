package parkseongmin;

public class Object_equals {

	public static void main(String[] args) {
		// String 
		String str1 = "hello";
		String str2 = "hello";
		//String 
		String str3 = new String("hello");
		
		//
		System.out.println("str1 vs str2 (==) : "+(str1==str2));
		System.out.println("str1 vs str2 (equals) : "+str1.equals(str2));
		System.out.println("str1 vs str3 (==) : "+(str1==str3));
		System.out.println("str1 vs str3 (equals) : "+str1.equals(str3));
		System.out.println("str2 vs str3 (==) : "+(str2==str3));
		System.out.println("str3 vs str3 (equals) : "+str2.equals(str3));
		
		//
		System.out.println("str1 hashCode() : "+str1.hashCode());
		System.out.println("str2 hashCode() : "+str2.hashCode());
		System.out.println("str3 hashCode() : "+str3.hashCode());
		
		System.out.println("str1 identityHashCode : "+System.identityHashCode(str1));
		System.out.println("str2 identityHashCode : "+System.identityHashCode(str2));
		System.out.println("str3 identityHashCode : "+System.identityHashCode(str3));
		
		String str4 = new String("abc");
		String str5 = new String("abc");
		
		//비교
		System.out.println("str4 vs str5 (==) : "+(str4==str5));
		System.out.println("str4 vs str5 (equals) : "+(str4.equals(str5)));
		
		//HashCode -> String객체의 오버라이딩 전 해쉬코드
		System.out.println("str4 hashCode : "+str4.hashCode());
		System.out.println("str5 hashCode : "+str5.hashCode());
		
		//System.identityHashCode() -> String객체의 오버라이딩 후 해쉬코드
		System.out.println("str4 identityHashCode : "+System.identityHashCode(str4));
		System.out.println("str5 identityHashCode : "+System.identityHashCode(str5));
		
		
		Car_string car = new Car_string("Sonata","HYUNDAI");
		 
		System.out.println(car);
		System.out.println(car.toString());
		
	}

}















