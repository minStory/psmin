package day05;

public class Xor_practice {

	public static void main(String[] args) {
			int a=15;
			int b=5;
			//비트 논리연산자
			System.out.println(a&b);	//0101(2) = 5
			System.out.println(a|b);		//1111(2) = 15
			System.out.println(a^b);	//1010(2) = 10
			System.out.println(~b);		//1010(2) = 10 = 10ㅌ -> -6 (~a=-a-1)
			//비트 쉬프트 연산자
			System.out.println(a>>2);	//>>한칸마다 /2
			System.out.println(b<<4);	//<<한칸마다 *2
	}

}
