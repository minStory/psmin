package parkseongmin;

public class Car_string {
	//�ڵ��� �̸�
	private String carName;
	//�ڵ��� ȸ��
	private String company;
	
	public Car_string(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	public String toString() {
		return "carName : "+this.carName+", Company : "+this.company;
	}
	
	//toString() �������̵� Ŭ����.toString() -> �����̸� �̸� : �ҳ�Ÿ, ������ : ����
}
