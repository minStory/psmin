package day_0516;

public class Test04 {

	public static void main(String[] args) {
		Order orderA = new Order();
		orderA.orderNum = "201907210001";
		orderA.id = "abc123";
		orderA.date = "2019�� 7�� 21��";
		orderA.name = "ȫ�浿";
		orderA.productNum = "PD-345-12";
		orderA.adress = "����� �������� ���ǵ��� 20����";
		orderA.orderPrint();
	}

}

class Order {
	String orderNum;
	String id;
	String date;
	String name;
	String productNum;
	String adress;

	void orderPrint() { // ��¸޼���
		System.out.println("�ֹ� ��ȣ : " + orderNum);
		System.out.println("�ֹ��� ID : " + id);
		System.out.println("�ֹ� ��¥ : " + date);
		System.out.println("�ֹ��� �̸� : " + name);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + productNum);
		System.out.println("��� �ּ� : " + adress);
	}
}

//Q2j.�Ʒ� ������ Ŭ������ �����ϼ���
//
//���θ��� �ֹ��� ���Խ��ϴ�. �ֹ� ������ ������ �����ϴ�.
//
//�ֹ���ȣ : 201907210001
//�ֹ��� ���̵� : abc123
//�ֹ� ��¥ : 2019�� 7�� 21��
//�ֹ��� �̸� : ȫ���
//�ֹ� ��ǰ ��ȣ : PD-345-12
//��� �ּ� : ����� �������� ���ǵ��� 20����
//
//�� �ֹ� ������ ������ �� �ִ� Ŭ������ ����� �ν��Ͻ��� ������ �� ���� ���� �������� ����غ�����.