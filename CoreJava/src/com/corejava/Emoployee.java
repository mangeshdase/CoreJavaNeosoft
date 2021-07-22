package com.corejava;


class Emoployee extends Project {
	
	public Emoployee(int pid, String pname, String plocation) {
		super(pid, pname, plocation);
		// TODO Auto-generated constructor stub
	}

	int eid;
	String ename;
	int esal;
	public Emoployee(int pid, String pname, String plocation, int eid, String ename, int esal) {
		super(pid, pname, plocation);
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getEsal() {
		return esal;
	}

	public void setEsal(int esal) {
		this.esal = esal;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
