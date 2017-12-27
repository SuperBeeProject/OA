package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Monitoring entity. @author MyEclipse Persistence Tools
 */

public class Monitoring implements java.io.Serializable {

	// Fields

	private Integer monitoringid;
	private Employee employeeByProorderpeople;
	private Employee employeeByProducter;
	private Orders orders;
	private Timestamp starttime;
	private Timestamp endtiem;
	private String situation;
	private BigDecimal quantity;
	private String productno;

	// Constructors

	/** default constructor */
	public Monitoring() {
	}

	/** full constructor */
	public Monitoring(Employee employeeByProorderpeople,
			Employee employeeByProducter, Orders orders, Timestamp starttime,
			Timestamp endtiem, String situation, BigDecimal quantity,
			String productno) {
		this.employeeByProorderpeople = employeeByProorderpeople;
		this.employeeByProducter = employeeByProducter;
		this.orders = orders;
		this.starttime = starttime;
		this.endtiem = endtiem;
		this.situation = situation;
		this.quantity = quantity;
		this.productno = productno;
	}

	// Property accessors

	public Integer getMonitoringid() {
		return this.monitoringid;
	}

	public void setMonitoringid(Integer monitoringid) {
		this.monitoringid = monitoringid;
	}

	public Employee getEmployeeByProorderpeople() {
		return this.employeeByProorderpeople;
	}

	public void setEmployeeByProorderpeople(Employee employeeByProorderpeople) {
		this.employeeByProorderpeople = employeeByProorderpeople;
	}

	public Employee getEmployeeByProducter() {
		return this.employeeByProducter;
	}

	public void setEmployeeByProducter(Employee employeeByProducter) {
		this.employeeByProducter = employeeByProducter;
	}

	public Orders getOrders() {
		return this.orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Timestamp getStarttime() {
		return this.starttime;
	}

	public void setStarttime(Timestamp starttime) {
		this.starttime = starttime;
	}

	public Timestamp getEndtiem() {
		return this.endtiem;
	}

	public void setEndtiem(Timestamp endtiem) {
		this.endtiem = endtiem;
	}

	public String getSituation() {
		return this.situation;
	}

	public void setSituation(String situation) {
		this.situation = situation;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public String getProductno() {
		return this.productno;
	}

	public void setProductno(String productno) {
		this.productno = productno;
	}

}