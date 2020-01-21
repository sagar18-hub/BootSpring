/**
 * 
 */
package com.dependency.DependencyDemo;

/**
 * @author adms.java1
 *
 */
public class Technologies {

	private int techid;
	private String techname;

	public Technologies() {
		super();

	}

	public Technologies(int techid, String techname) {
		super();
		this.techid = techid;
		this.techname = techname;
	}

	public int getTechid() {
		return techid;
	}

	public void setTechid(int techid) {
		this.techid = techid;
	}

	public String getTechname() {
		return techname;
	}

	public void setTechname(String techname) {
		this.techname = techname;
	}

	public void tech() {
		System.out.println("completed");
	}
}
