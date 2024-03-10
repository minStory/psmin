package day_0413;

public class Test04 {
	public static void main(String[] args) {
		int i = 5, j = 0;

		j = i++;
		System.out.println("j=i++; 실행 후, i = " + i + ", j = " + j); // 전위형
		
		i = 5;
		j = 0;
		j = ++i;
		System.out.println("j=++i; 실행 후, i = " + i + ", j = " + j); // 후위형

	}
}
