package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Enter entity. @author MyEclipse Persistence Tools
 */

public class Enter implements java.io.Serializable {

	// Fields

	private Integer enterid;
	private Employee employee;
	private Warehouse warehouse;
	private Orders orders;
	private String name;
	private Timestamp time;
	private Integer quantity;
	private String remark;

	// Constructors

	/** default constructor */
	public Enter() {
	}

	/** full constructor */
	public Enter(Employee employee, Warehouse warehouse, Orders orders,
			String name, Timestamp time, Integer quantity, String remark) {
		this.employee = employee;
		this.warehouse = warehouse;
		this.orders = orders;
		this.name = name;
		this.time = time;
		this.quantity = quantity;
		this.remark = remark;
	}

	// Property accessors

	public Integer getEnterid() {
		return this.enterid;
	}

	public void setEnterid(Integer enterid) {
		this.enterid = enterid;
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

	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}