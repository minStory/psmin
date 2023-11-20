package day_0601;

public class Test02 {

	public static void main(String[] args) {
		TourGuide guide=new TourGuide();	//TourGuideŸ���� ��ü ����
		guide.leisureSports();	//TourGuide�� Ŭ������ ���� �������̽� Providable�� �޼��� ȣ��
		guide.sightseeing();
		guide.food();
	}

}
interface Providable{	//�������̽� Providable ����
	void leisureSports();	//�߻�޼��� ����
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{	//�������̽� Providable�� ������ Ŭ���� KoreaTour ����
	public void leisureSports() {	//�߻�޼����� ���� �ۼ�
		System.out.println("�Ѱ����� ����Ű ����");
	}
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	public void food() {
		System.out.println("���� ����� ����");
	}
}
class JapanTour implements Providable{
	public void leisureSports() {
		System.out.println("����Ÿ�� �������� ����");
	}
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}
	public void food() {
		System.out.println("�ʹ� ����");
	}
}
class TourGuide{
	private Providable tour=new KoreaTour();	//KoreaTourŸ���� ProvidableŸ������ ����ȯ�Ͽ� ��ü ����
	private Providable tour1=new JapanTour();	//JapanTourŸ���� ProvidableŸ������ ����ȯ�Ͽ� ��ü ����
	public void leisureSports() {	//�������̽��� �����Ͽ� KoreaTour�� �޼��� ȣ��
//		tour.leisureSports();
		tour1.leisureSports();
	}
	public void sightseeing() {
//		tour.sightseeing();
		tour1.sightseeing();
	}
	public void food() {
//		tour.food();
		tour1.food();
	}
}