package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Wages entity. @author MyEclipse Persistence Tools
 */

public class Wages implements java.io.Serializable {

	// Fields

	private Integer wagesid;
	private Employee employee;
	private BigDecimal wages;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Wages() {
	}

	/** full constructor */
	public Wages(Employee employee, BigDecimal wages, Timestamp time) {
		this.employee = employee;
		this.wages = wages;
		this.time = time;
	}

	// Property accessors

	public Integer getWagesid() {
		return this.wagesid;
	}

	public void setWagesid(Integer wagesid) {
		this.wagesid = wagesid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BigDecimal getWages() {
		return this.wages;
	}

	public void setWages(BigDecimal wages) {
		this.wages = wages;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}