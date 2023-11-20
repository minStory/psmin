package day27;

public class Interface2 {

	public static void main(String[] args) {
			//�߰� Ŭ������ �����ϴ� Ŭ������ ������ ���� Ŭ�������� ��ü ����
			TourGuide guide=new TourGuide();
			guide.leisureSports();
			guide.sightseeing();
			guide.food();
	}
}
//�⺻ �������̽� (����)
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
}
//�⺻ �������̽��� ������ KoreaTour Ŭ����
class KoreaTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("�Ѱ����� ����Ű ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("�溹�� ���� ����");
	}
	@Override
	public void food() {
		System.out.println("���� ����� ����");
	}	
}
//�⺻ �������̽��� ������ JapanTour Ŭ����
class JapanTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("����Ÿ�� �������� ����");
	}
	@Override
	public void sightseeing() {
		System.out.println("����ī ���� ����");
	}
	@Override
	public void food() {
		System.out.println("�ʹ� ����");
	}
}
//Ŭ�������� ���踦 �����ϰ� �ϱ����� �߰� Ŭ����
class TourGuide{
	//KoreaTour�� ������ ��ü
	private Providable tour1=new KoreaTour();
	//JapanTour�� ������ ��ü
	private Providable tour2=new JapanTour();
	//�������̽��� Ÿ�� ���� -> ��ĳ����
	//�������̽� ���������� ���� Ŭ���������� ���踦 �����ϰ� �ϱ����� ��ĳ���� (�ý����� ���濡 ����)
	public void leisureSports() {
		tour1.leisureSports();
		tour2.leisureSports();
	}
	public void sightseeing() {
		tour1.sightseeing();
		tour2.sightseeing();
	}
	public void food() {
		tour1.food();
		tour2.food();
	}
}






