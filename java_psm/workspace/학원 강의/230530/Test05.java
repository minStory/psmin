//�߻�޼��� �����
//�̿ϼ�
//� ����� ������ �������� �ۼ��ߴ��� ����
//abstract class Player{
//		abstract void play(int pos);	//�߻�޼���
//		abstract void stop();	//�߻�޼���
//}
//�߻� : ������ ��ü�� ǥ���̳� ���信�� ����� ������ 

package day_0530;

public class Test05 {

	public static void main(String[] args) {
		//��ĳ���� �� �ڼ�Ŭ���� ��� ��� �Ұ�
		Unit m=new Marine();
		Unit t=new Tank();
		Unit d=new Dropship();
		m.move(2,4);
		m.stop();
		t.move(3,5);
		t.stop();
		d.move(10,20);
		d.stop();
		
		Marine m1=new Marine();
		m1.stimPack();
		System.out.println(m1.x+" "+m1.y);
		Tank t1=new Tank();
		t1.changeMode();
		Dropship d1=new Dropship();
		d1.load();
		d1.unload();
		
		ComandCenter c=new ComandCenter();
		c.callName(m);
		c.callName(t);
		c.callName(d);
		
		Unit m2=new Marine(100,200);
		System.out.println(m2.x+" "+m2.y);
		
	}

}
abstract class Unit{
	int x=5;
	int y=10;
	abstract void move(int x,int y);
	abstract void stop();
}
class Marine extends Unit{
	public String toString() {
		return "����";
	}
	void stimPack() {
		System.out.println("���� ���ĺ���");
	}
	@Override
	void move(int x, int y) {
		System.out.println("���� x�� "+x+"��ŭ y�� "+y+ "��ŭ �����");
	}
	@Override
	void stop() {
		System.out.println("���� ����");
	}
	Marine(){
		
	}
	Marine(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Tank extends Unit{
	public String toString() {
		return "������ũ";
	}
	void changeMode() {
		System.out.println("������� ����");
	}
	@Override
	void move(int x, int y) {
		System.out.println("������ũ x�� "+x+"��ŭ y�� "+y+ "��ŭ �����");
	}
	@Override
	void stop() {
		System.out.println("������ũ ����");
	}
}
class Dropship extends Unit{
	public String toString() {
		return "�����";
	}
	void load() {
		System.out.println("����� �¿�");
	}
	void unload() {
		System.out.println("����� ����");
	}
	@Override
	void move(int x, int y) {
		System.out.println("����� x�� "+x+"��ŭ y�� "+y+ "��ŭ �����");
	}
	@Override
	void stop() {
		System.out.println("����� ����");
	}
}
class ComandCenter{
	void callName(Unit u) {
		System.out.println("�� �̸��� "+u+"�̴�!!");
	}
}