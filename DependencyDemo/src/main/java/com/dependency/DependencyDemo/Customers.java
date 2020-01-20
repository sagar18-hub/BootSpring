package com.dependency.DependencyDemo;

public class Customers {
	private String custid;
	private String custname;
	private String coursename;
	private Technologies technologies;

	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Customers(String custid, String custname, String coursename) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.coursename = coursename;
	}

	public String getCustid() {
		return custid;
	}

	public void setCustid(String custid) {
		this.custid = custid;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

}
