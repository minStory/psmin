package day_0523;

public class Test02 {

	public static void main(String[] args) {
		double p=3.1415926535897;
		
		double p1=Math.round(p);		//ù°�ڸ� �ݿø�
		double p2=Math.round(p*10)/10.0;		//��°�ڸ� �ݿø�
		double p3=Math.round(p*100)/100.0;		//��°�ڸ� �ݿø�
		double p4=Math.round(p*1000)/1000.0;		//��°�ڸ� �ݿø�
		double p5=Math.round(p*10000)/10000.0;		//�ټ�°�ڸ� �ݿø�
		
//		String a = String.format("%.4f",p);
//		System.out.println(a);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);
	}

}