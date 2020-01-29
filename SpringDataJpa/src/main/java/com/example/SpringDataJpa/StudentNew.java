/**
 * 
 */
package com.example.SpringDataJpa;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author adms.java1
 *
 */
@Entity
@Table(name="NewStudentone")
public class StudentNew {

	@Id
	private int id;
	private String name;

	public StudentNew() {
		super();
		// TODO Auto-generated constructor stub
	}

	public StudentNew(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "StudentNew [id=" + id + ", name=" + name + "]";
	}

}
