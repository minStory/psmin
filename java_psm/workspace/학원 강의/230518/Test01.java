package day_0518;

public class Test01 {

	public static void main(String[] args) {
		Check.cm_Imember();
		Check.cm_Cmember();
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.im_Imember();
	}

}

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm

	static int cv = 5;
	int iv = 4;

	static void cm() {
	}

	static void im() {
	}

	static void cm_Imember() {
		// Ŭ���� �޼��尡 �ν��Ͻ� ����� ���� -> ���� : Ŭ�����޼��� ���������� �ν��Ͻ� ��� ������������ ����
		// System.out.println(iv);
		// im();
	}

	void im_Cmember() {
		// �ν��Ͻ� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}

	static void cm_Cmember() {
		// Ŭ���� �޼��尡 Ŭ���� ����� ����
		System.out.println(cv);
		cm();
	}

	void im_Imember() {
		//�ν��Ͻ� �޼��尡 �ν��Ͻ� ����� ����
		System.out.println(iv);
		im();
	}
}