/**
 * 
 */
package com.example.SubmissionForm;

/**
 * @author HP
 *
 */
public class Customers {
	private int cid;
	private String cname;
	private String cemail;
	public Customers() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customers(int cid, String cname, String cemail) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cemail = cemail;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCemail() {
		return cemail;
	}
	public void setCemail(String cemail) {
		this.cemail = cemail;
	}
	@Override
	public String toString() {
		return "Customers [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + "]";
	}
	

}
