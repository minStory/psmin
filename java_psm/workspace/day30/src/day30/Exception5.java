package day30;

class Exception5 {

	public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);		//ticketing�޼��� ȣ��
		}catch(AgeException e) {
			e.printStackTrace();	//������ ����ϴ� �޼���
		}
	}
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("���� �Է��� �߸��Ǿ����ϴ�.");	//������ ȣ�� -> �Ű������� �� ����
		}
	}
}
//����� ���� ���� -> Exception Ŭ������ ��ӹ��� ��
class AgeException extends Exception{
	public AgeException(){	}	//�⺻������ ����
	public AgeException(String message){		//�Ű����������� ����
		super(message);	//���޹��� �Ű������� ���� �θ�Ŭ������ ���� (��Ÿ�� �޼��� ����)
	}
}