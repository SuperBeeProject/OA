package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Out entity. @author MyEclipse Persistence Tools
 */

public class Out implements java.io.Serializable {

	// Fields

	private Integer outid;
	private Employee employee;
	private Warehouse warehouse;
	private Orders orders;
	private String name;
	private Timestamp time;
	private BigDecimal quantity;
	private String remark;

	// Constructors

	/** default constructor */
	public Out() {
	}

	/** full constructor */
	public Out(Employee employee, Warehouse warehouse, Orders orders,
			String name, Timestamp time, BigDecimal quantity, String remark) {
		this.employee = employee;
		this.warehouse = warehouse;
		this.orders = orders;
		this.name = name;
		this.time = time;
		this.quantity = quantity;
		this.remark = remark;
	}

	// Property accessors

	public Integer getOutid() {
		return this.outid;
	}

	public void setOutid(Integer outid) {
		this.outid = outid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Warehouse getWarehouse() {
		return this.warehouse;
	}

	public void setWarehouse(Warehouse warehouse) {
		this.warehouse = warehouse;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}