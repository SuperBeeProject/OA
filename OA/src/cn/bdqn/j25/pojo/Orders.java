package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Orders entity. @author MyEclipse Persistence Tools
 */

public class Orders implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Product product;
	private State state;
	private Employee employeeByOperator;
	private Department department;
	private Customer customer;
	private Types types;
	private Employee employeeByOriginator;
	private String ordernumber;
	private Timestamp datetime;
	private BigDecimal quantity;
	private BigDecimal price;
	private String orderremarks;
	private Set outs = new HashSet(0);
	private Set enters = new HashSet(0);
	private Set monitorings = new HashSet(0);
	private Set proorders = new HashSet(0);
	private Set orderrootses = new HashSet(0);
	

	// Constructors

	/** default constructor */
	public Orders() {
	}

	/** full constructor */
	public Orders(Product product, State state, Employee employeeByOperator,
			Department department, Customer customer, Types types,
			Employee employeeByOriginator, String ordernumber,
			Timestamp datetime, BigDecimal quantity, BigDecimal price,
			String orderremarks, Set outs, Set enters, Set monitorings,
			Set proorders, Set orderrootses) {
		this.product = product;
		this.state = state;
		this.employeeByOperator = employeeByOperator;
		this.department = department;
		this.customer = customer;
		this.types = types;
		this.employeeByOriginator = employeeByOriginator;
		this.ordernumber = ordernumber;
		this.datetime = datetime;
		this.quantity = quantity;
		this.price = price;
		this.orderremarks = orderremarks;
		this.outs = outs;
		this.enters = enters;
		this.monitorings = monitorings;
		this.proorders = proorders;
		this.orderrootses = orderrootses;
	}

	// Property accessors

	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Employee getEmployeeByOperator() {
		return this.employeeByOperator;
	}

	public void setEmployeeByOperator(Employee employeeByOperator) {
		this.employeeByOperator = employeeByOperator;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public Employee getEmployeeByOriginator() {
		return this.employeeByOriginator;
	}

	public void setEmployeeByOriginator(Employee employeeByOriginator) {
		this.employeeByOriginator = employeeByOriginator;
	}

	public String getOrdernumber() {
		return this.ordernumber;
	}

	public void setOrdernumber(String ordernumber) {
		this.ordernumber = ordernumber;
	}

	public Timestamp getDatetime() {
		return this.datetime;
	}

	public void setDatetime(Timestamp datetime) {
		this.datetime = datetime;
	}

	public BigDecimal getQuantity() {
		return this.quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return this.price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getOrderremarks() {
		return this.orderremarks;
	}

	public void setOrderremarks(String orderremarks) {
		this.orderremarks = orderremarks;
	}

	public Set getOuts() {
		return this.outs;
	}

	public void setOuts(Set outs) {
		this.outs = outs;
	}

	public Set getEnters() {
		return this.enters;
	}

	public void setEnters(Set enters) {
		this.enters = enters;
	}

	public Set getMonitorings() {
		return this.monitorings;
	}

	public void setMonitorings(Set monitorings) {
		this.monitorings = monitorings;
	}

	public Set getProorders() {
		return this.proorders;
	}

	public void setProorders(Set proorders) {
		this.proorders = proorders;
	}

	public Set getOrderrootses() {
		return this.orderrootses;
	}

	public void setOrderrootses(Set orderrootses) {
		this.orderrootses = orderrootses;
	}

}