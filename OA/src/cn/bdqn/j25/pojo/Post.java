package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Post entity. @author MyEclipse Persistence Tools
 */

public class Post implements java.io.Serializable {

	// Fields

	private Integer postid;
	private String postname;
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Post() {
	}

	/** full constructor */
	public Post(String postname, Set employees) {
		this.postname = postname;
		this.employees = employees;
	}

	// Property accessors

	public Integer getPostid() {
		return this.postid;
	}

	public void setPostid(Integer postid) {
		this.postid = postid;
	}

	public String getPostname() {
		return this.postname;
	}

	public void setPostname(String postname) {
		this.postname = postname;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}