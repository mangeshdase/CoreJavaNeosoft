package com.corejava;

public class Project {
	int pid;
	String pname;
	String plocation;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPlocation() {
		return plocation;
	}
	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}
	public Project(int pid, String pname, String plocation) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	
}
