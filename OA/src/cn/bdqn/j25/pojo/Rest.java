package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Rest entity. @author MyEclipse Persistence Tools
 */

public class Rest implements java.io.Serializable {

	// Fields

	private Integer restid;
	private Employee employeeByRester;
	private Employee employeeByApprover;
	private String reasons;
	private Timestamp starttime;
	private BigDecimal days;

	// Constructors

	/** default constructor */
	public Rest() {
	}

	/** full constructor */
	public Rest(Employee employeeByRester, Employee employeeByApprover,
			String reasons, Timestamp starttime, BigDecimal days) {
		this.employeeByRester = employeeByRester;
		this.employeeByApprover = employeeByApprover;
		this.reasons = reasons;
		this.starttime = starttime;
		this.days = days;
	}

	// Property accessors

	public Integer getRestid() {
		return this.restid;
	}

	public void setRestid(Integer restid) {
		this.restid = restid;
	}

	public Employee getEmployeeByRester() {
		return this.employeeByRester;
	}

	public void setEmployeeByRester(Employee employeeByRester) {
		this.employeeByRester = employeeByRester;
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

	public BigDecimal getDays() {
		return this.days;
	}

	public void setDays(BigDecimal days) {
		this.days = days;
	}

}