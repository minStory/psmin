package parkseongmin;

public class Test01 {

	public static void main(String[] args) {
		String str[]=new String[3];
		str[0]="good";
		str[1]="goood";
		str[2]="gooood";
		if(str[0].length()<str[1].length()||str[0].charAt(4)=='\0') {
			System.out.println("yes");
		}
		else {
			System.out.println("no");
		}
	}

}
