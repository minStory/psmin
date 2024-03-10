package sbs.model;

//DB의 student 테이블의 컬럼명과 동일하게
//멤버변수를 구성하는게 좋다.
public class StudentDTO {
	
	private String id;	//학번
	private String name;	//이름
	private String major;	//학과
	private String phone;	//연락처
	private String address;	//주소
	private String regdate;	//등록일
	
	//자료를 주고 받을 수 있도록 getter, setter 메서드를 만든다.
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getRegdate() {
		return regdate;
	}
	
	public void setRegdate(String regdate) {
		this.regdate = regdate;
	}
}
