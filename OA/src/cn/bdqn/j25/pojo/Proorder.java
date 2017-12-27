package cn.bdqn.j25.pojo;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Proorder entity. @author MyEclipse Persistence Tools
 */

public class Proorder implements java.io.Serializable {

	// Fields

	private Integer proorderid;
	private Employee employee;
	private Orders orders;
	private String productno;
	private Timestamp time;
	private String packing;
	private String remarks;
	private Set checkses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Proorder() {
	}

	/** full constructor */
	public Proorder(Employee employee, Orders orders, String productno,
			Timestamp time, String packing, String remarks, Set checkses) {
		this.employee = employee;
		this.orders = orders;
		this.productno = productno;
		this.time = time;
		this.packing = packing;
		this.remarks = remarks;
		this.checkses = checkses;
	}

	// Property accessors

	public Integer getProorderid() {
		return this.proorderid;
	}

	public void setProorderid(Integer proorderid) {
		this.proorderid = proorderid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public String getProductno() {
		return this.productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public String getPacking() {
		return this.packing;
	}

	public void setPacking(String packing) {
		this.packing = packing;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getCheckses() {
		return this.checkses;
	}

	public void setCheckses(Set checkses) {
		this.checkses = checkses;
	}

}