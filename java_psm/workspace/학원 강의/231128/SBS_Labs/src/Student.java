
public class Student {
	protected String department;
	String grade;
	String id;
	String name;
	String address;
	
	public Student(String nGrade, String strId, String strName, String strAddress) {
		// TODO Auto-generated constructor stub
		this.grade = nGrade;
		this.id = strId;
		this.name = strName;
		this.address = strAddress;
	}

	public void SetDepartment(String strDepartment) {
		//이부분에 학과명을 넣는 코드를 완성한다.
		this.department = strDepartment;
	}
}
