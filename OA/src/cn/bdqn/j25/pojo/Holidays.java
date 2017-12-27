package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Holidays entity. @author MyEclipse Persistence Tools
 */

public class Holidays implements java.io.Serializable {

	// Fields

	private Integer holidayid;
	private Employee employeeByLeaver;
	private Employee employeeByApprover;
	private String reasons;
	private Timestamp starttime;
	private Integer days;

	// Constructors

	/** default constructor */
	public Holidays() {
	}

	/** full constructor */
	public Holidays(Employee employeeByLeaver, Employee employeeByApprover,
			String reasons, Timestamp starttime, Integer days) {
		this.employeeByLeaver = employeeByLeaver;
		this.employeeByApprover = employeeByApprover;
		this.reasons = reasons;
		this.starttime = starttime;
		this.days = days;
	}

	// Property accessors

	public Integer getHolidayid() {
		return this.holidayid;
	}

	public void setHolidayid(Integer holidayid) {
		this.holidayid = holidayid;
	}

	public Employee getEmployeeByLeaver() {
		return this.employeeByLeaver;
	}

	public void setEmployeeByLeaver(Employee employeeByLeaver) {
		this.employeeByLeaver = employeeByLeaver;
	}

	public Employee getEmployeeByApprover() {
		return this.employeeByApprover;
	}

	public void setEmployeeByApprover(Employee employeeByApprover) {
		this.employeeByApprover = employeeByApprover;
	}

	public String getReasons() {
		return this.reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Integer getDays() {
		return this.days;
	}

	public void setDays(Integer days) {
		this.days = days;
	}

}