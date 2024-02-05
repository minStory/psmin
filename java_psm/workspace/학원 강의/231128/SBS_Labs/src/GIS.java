
public class GIS extends Student {
	
	String email;
	
	public GIS(String nGrade, String strId, String strName, String strAddress, String strEmail) {
		// TODO Auto-generated constructor stub
		super(nGrade,strId,strName,strAddress);
		this.email = strEmail;
	}

	void Display(){
		//System.out.format 문을 이용하여 학생 한 명의 학과 학년 학번
		//성명 거주지역 이메일을 출력하도록 코드를 완성해야 한다.
		System.out.format("%s\t %s\t %s\t %s\t %s\t\t %s\n",this.department,this.grade,this.id,this.name,this.address,this.email);
	}
}
