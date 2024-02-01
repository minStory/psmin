package com.dept.model;

public class DeptDTO {
	
	//외부로부터 직접적인 접근을 막기 위해 변수를 private;로 선언한다 -> 캡슐화
	//다만 값을 참조(값 넣기, 값 가져오기)하려면 메서드를 이용한다. -> getter, setter
	private int deptno;		//부서번호
	private String dname;	//부서이름
	private String loc;		//부서지역
	
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	
	
}
