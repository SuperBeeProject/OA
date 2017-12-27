package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Accounts entity. @author MyEclipse Persistence Tools
 */

public class Accounts implements java.io.Serializable {

	// Fields

	private Integer accountsid;
	private Employee employee;
	private String output;
	private Timestamp time;
	private String content;
	private BigDecimal money;
	private String remarks;

	// Constructors

	/** default constructor */
	public Accounts() {
	}

	/** full constructor */
	public Accounts(Employee employee, String output, Timestamp time,
			String content, BigDecimal money, String remarks) {
		this.employee = employee;
		this.output = output;
		this.time = time;
		this.content = content;
		this.money = money;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getAccountsid() {
		return this.accountsid;
	}

	public void setAccountsid(Integer accountsid) {
		this.accountsid = accountsid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getOutput() {
		return this.output;
	}

	public void setOutput(String output) {
		this.output = output;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}