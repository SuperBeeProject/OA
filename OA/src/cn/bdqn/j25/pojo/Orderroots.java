package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Orderroots entity. @author MyEclipse Persistence Tools
 */

public class Orderroots implements java.io.Serializable {

	// Fields

	private Integer orderrootsid;
	private Employee employee;
	private State state;
	private Orders orders;
	private Timestamp time;

	// Constructors

	/** default constructor */
	public Orderroots() {
	}

	/** full constructor */
	public Orderroots(Employee employee, State state, Orders orders,
			Timestamp time) {
		this.employee = employee;
		this.state = state;
		this.orders = orders;
		this.time = time;
	}

	// Property accessors

	public Integer getOrderrootsid() {
		return this.orderrootsid;
	}

	public void setOrderrootsid(Integer orderrootsid) {
		this.orderrootsid = orderrootsid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

}