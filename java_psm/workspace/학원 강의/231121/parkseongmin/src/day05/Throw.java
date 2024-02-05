package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {
//		try {
//		Exception e=new Exception("���� �߻�");
//		throw e;
//		}catch(Exception e) {
//			System.out.println("���� �޽��� : "+e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("���α׷��� ����Ǿ����ϴ�.");
		
		//scanner�� ������ �ְ� � ������� ��ȣ�� �����ϰ� �Ѵ�.
		Scanner sc=new Scanner(System.in);
		
		//���� �����˻縦 �����մϴ� ��� ��Ʈ�� �ְ� �����Ѵ�.
		System.out.println("���� �����˻縦 �����մϴ�.");
		//static �޼��带 Ȱ���ؼ� ������ ���� ������ �˻��ϴ� �޼��带 �����.
		try {
			Throw.checkYourSelf(sc); //scan�� ������ static �޼��忡 ���� �� �ְ� �Ű������� ������ش�.
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}
	//static method
	public static void checkYourSelf(Scanner sc) throws InputMismatchException {
		System.out.println("1. ����� ��︮�� ���� ����.\n2. ȥ�� �ִ� ���� ����.\n���� >>>");
		int check=sc.nextInt();
		if(check==1) {
			System.out.println("����� ENFP �Դϴ�.");
		}else if(check==2) {
			System.out.println("����� ISFP �Դϴ�.");
		}
	}
}
