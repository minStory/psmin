//abstract -> �߻���, �̿ϼ���
//Ŭ���� : Ŭ���� ���� �߻� �޼��尡 ����Ǿ� ������ �ǹ�
//�޼��� : ����θ� �ۼ�, �����δ� �ۼ� ���� ���� �߻�޼��带 �ǹ�

package day_0530;

public class Test01 {

	public static void main(String[] args) {
		Time t=new Time();
		t.setH(23);
		System.out.println(t.getH());
		t.setM(59);
		System.out.println(t.getM());
		t.setS(1);
		System.out.println(t.getS());
	}
}

//�ڼ�Ŭ�������� ���� �Ұ� (get, set)
//get(����) -> �ܼ��� ������� ���� ��ȯ
//set(����) -> �Ű������� ������ ���� �˻��ϰ� ���ǿ� �´� ���� �� ��������� ���� ����
class Time{
	private int h;
	private int m;
	private int s;
	
	int getH() {
		return h;
	}
	void setH(int h) {
		if(h<0||h>23) {return;}
		else { this.h=h;}
	}
	int getM() {
		return m;
	}
	void setM(int m) {
		if(m<0||m>59) {return;}
		else {this.m=m;}
	}
	int getS() {
		return s;
	}
	void setS(int s) {
		if(s<0||s>59) {return;}
		else {this.s=s;}
	}
}