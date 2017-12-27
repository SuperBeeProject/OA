package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Performances entity. @author MyEclipse Persistence Tools
 */

public class Performances implements java.io.Serializable {

	// Fields

	private Integer performanceid;
	private Employee employee;
	private BigDecimal performancebonus;
	private Timestamp time;
	private String levels;

	// Constructors

	/** default constructor */
	public Performances() {
	}

	/** full constructor */
	public Performances(Employee employee, BigDecimal performancebonus,
			Timestamp time, String levels) {
		this.employee = employee;
		this.performancebonus = performancebonus;
		this.time = time;
		this.levels = levels;
	}

	// Property accessors

	public Integer getPerformanceid() {
		return this.performanceid;
	}

	public void setPerformanceid(Integer performanceid) {
		this.performanceid = performanceid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public BigDecimal getPerformancebonus() {
		return this.performancebonus;
	}

	public void setPerformancebonus(BigDecimal performancebonus) {
		this.performancebonus = performancebonus;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

}