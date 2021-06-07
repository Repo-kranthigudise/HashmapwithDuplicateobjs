package org.aline.student;

public class Student {
	private int sId;
	private String name;
	private String branch;
	public Student(int sId, String name, String branch) {
		super();
		this.sId = sId;
		this.name = name;
		this.branch = branch;
	}
	public int getsId() {
		return sId;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", name=" + name + ", branch=" + branch + "]";
	}
	
	
	

}
