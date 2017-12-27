package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Clockin entity. @author MyEclipse Persistence Tools
 */

public class Clockin implements java.io.Serializable {

	// Fields

	private Integer clockinid;
	private Employee employee;
	private Timestamp clocktime;

	// Constructors

	/** default constructor */
	public Clockin() {
	}

	/** full constructor */
	public Clockin(Employee employee, Timestamp clocktime) {
		this.employee = employee;
		this.clocktime = clocktime;
	}

	// Property accessors

	public Integer getClockinid() {
		return this.clockinid;
	}

	public void setClockinid(Integer clockinid) {
		this.clockinid = clockinid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Timestamp getClocktime() {
		return this.clocktime;
	}

	public void setClocktime(Timestamp clocktime) {
		this.clocktime = clocktime;
	}

}