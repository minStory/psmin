//ù° �ڸ� �ݿø�
//Math.round(a)
//��° �ڸ� �ݿø�
//Math.round(a*10)/10.0)
//��° �ڸ� �ݿø�
//Math.round(a*100)/100.0)

package day_0523;

public class Test01 {

	public static void main(String[] args) {
		School s1=new School("�ڼ���",1,1,100,60,76);
		System.out.println("�̸� : "+s1.name);
		System.out.println("�� : "+s1.ban);
		System.out.println("��ȣ : "+s1.num);
		System.out.println("���� ���� : "+s1.kor);
		System.out.println("���� ���� : "+s1.eng);
		System.out.println("���� ���� : "+s1.math);
		System.out.println(s1.getTotal());
		System.out.println(s1.getAverage());
	}

}
class School{
	String name;
	int ban;
	int num;
	int kor;
	int eng;
	int math;
	int getTotal(){
		return kor+eng+math;
	}
	float getAverage() {
//		return (int)(getTotal()/3f*10+0.5f)/10f;
		return Math.round((float)getTotal()/3*10)/10.0f;
	}
	public School(String name, int ban, int num,int kor, int eng, int math){
		this.name=name;
		this.ban=ban;
		this.num=num;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
}

//Ÿ ��	������	�� ��
//String 	name 	�л��̸�
//int	 ban 	��
//int 	no 	��ȣ
//int	 kor 	��������
//int 	eng 	��������
//int 	math 	��������