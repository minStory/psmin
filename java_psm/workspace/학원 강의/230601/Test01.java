//�������̽� : ��ü�� ������� ���̵���� �ϴ� ��
//������ ���� �Ͽ� ������ ����� �����ϰԲ� �����ϴ� ���� �ٷ� �������̽�. �������� ����
//�������� �ش�ȭ�Ͽ� �ڵ� ���� ���̰� ���α׷� �������� ���̱� ���ؼ� ���
 
//Ư¡
//���� ��� ����
//�߻�޼���, ����� ���
//������ ��� X
//�޼��� �������̵� �ʼ�!!!

//class2 extends class1
//interface extends interface
//class implements interface

//���������� ������
//�θ� pp = new �θ� O
//�ڽ� cc = new �ڽ� O
//�θ� pc = new �ڽ� O -> ����ȯ
//�ڽ� cp = new �θ� X

//Fightable f = (Fightable) new Fighter();
//Fightable f = new Fighter();

//Fighter f = new Fighter();
//return f;

//return new Fighter();
//���� 2�� ����

//����Ÿ���� �������̽���� ���� �޼��尡 �ش� �������̽��� ������ Ŭ������ �ν��Ͻ��� ��ȯ�Ѵٴ� ���� �ǹ�

package day_0601;

public class Test01 {
	public static void main(String[] args) {
		
	}
}
interface PlayingCard{
	public static final int SPADE=4;	//����� �Ϲ������� ��ü �빮�� ���
	final int DIAMOND=3;
	static int HEART=2;
	int CLOVER=1;			//public static final ���� ����
}
interface Movable{
	//������ ��ġ(x,y)�� �̵��ϴ� ����� �޼���
	void move(int x,int y);
}
interface Attackable{
	//������ ���(u)�� �����ϴ� ����� �޼���
//	void attack(Unit u);
}
interface Fightable extends Movable,Attackable{}	//���߻�� ����
