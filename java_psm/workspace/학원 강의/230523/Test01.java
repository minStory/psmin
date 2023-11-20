//첫째 자리 반올림
//Math.round(a)
//둘째 자리 반올림
//Math.round(a*10)/10.0)
//셋째 자리 반올림
//Math.round(a*100)/100.0)

package day_0523;

public class Test01 {

	public static void main(String[] args) {
		School s1=new School("박성민",1,1,100,60,76);
		System.out.println("이름 : "+s1.name);
		System.out.println("반 : "+s1.ban);
		System.out.println("번호 : "+s1.num);
		System.out.println("국어 점수 : "+s1.kor);
		System.out.println("영어 점수 : "+s1.eng);
		System.out.println("수학 점수 : "+s1.math);
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

//타 입	변수명	설 명
//String 	name 	학생이름
//int	 ban 	반
//int 	no 	번호
//int	 kor 	국어점수
//int 	eng 	영어점수
//int 	math 	수학점수