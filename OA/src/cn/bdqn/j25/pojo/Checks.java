package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Checks entity. @author MyEclipse Persistence Tools
 */

public class Checks implements java.io.Serializable {

	// Fields

	private Integer checkid;
	private Employee employee;
	private Proorder proorder;
	private String name;
	private Integer quantity;
	private String qualifiedrate;
	private Timestamp time;
	private String reasons;
	private String remarks;

	// Constructors

	/** default constructor */
	public Checks() {
	}

	/** full constructor */
	public Checks(Employee employee, Proorder proorder, String name,
			Integer quantity, String qualifiedrate, Timestamp time,
			String reasons, String remarks) {
		this.employee = employee;
		this.proorder = proorder;
		this.name = name;
		this.quantity = quantity;
		this.qualifiedrate = qualifiedrate;
		this.time = time;
		this.reasons = reasons;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getCheckid() {
		return this.checkid;
	}

	public void setCheckid(Integer checkid) {
		this.checkid = checkid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Proorder getProorder() {
		return this.proorder;
	}

	public void setProorder(Proorder proorder) {
		this.proorder = proorder;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getQualifiedrate() {
		return this.qualifiedrate;
	}

	public void setQualifiedrate(String qualifiedrate) {
		this.qualifiedrate = qualifiedrate;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getReasons() {
		return this.reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}