package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Department entity. @author MyEclipse Persistence Tools
 */

public class Department implements java.io.Serializable {

	// Fields

	private Integer departmentid;
	private String departmentname;
	private Set orderses = new HashSet(0);
	private Set procurements = new HashSet(0);
	private Set announcements = new HashSet(0);
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Department() {
	}

	/** minimal constructor */
	public Department(String departmentname) {
		this.departmentname = departmentname;
	}

	/** full constructor */
	public Department(String departmentname, Set orderses, Set procurements,
			Set announcements, Set employees) {
		this.departmentname = departmentname;
		this.orderses = orderses;
		this.procurements = procurements;
		this.announcements = announcements;
		this.employees = employees;
	}

	// Property accessors

	public Integer getDepartmentid() {
		return this.departmentid;
	}

	public void setDepartmentid(Integer departmentid) {
		this.departmentid = departmentid;
	}

	public String getDepartmentname() {
		return this.departmentname;
	}

	public void setDepartmentname(String departmentname) {
		this.departmentname = departmentname;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getProcurements() {
		return this.procurements;
	}

	public void setProcurements(Set procurements) {
		this.procurements = procurements;
	}

	public Set getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set announcements) {
		this.announcements = announcements;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}