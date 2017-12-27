package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Procurement entity. @author MyEclipse Persistence Tools
 */

public class Procurement implements java.io.Serializable {

	// Fields

	private Integer procurementid;
	private State state;
	private Employee employeeByOperator;
	private Department department;
	private Types types;
	private Employee employeeByOriginator;
	private Material material;
	private Provider provider;
	private String ordernumber;
	private Timestamp datetime;
	private BigDecimal quantity;
	private BigDecimal price;
	private String orderremarks;

	// Constructors

	/** default constructor */
	public Procurement() {
	}

	/** full constructor */
	public Procurement(State state, Employee employeeByOperator,
			Department department, Types types, Employee employeeByOriginator,
			Material material, Provider provider, String ordernumber,
			Timestamp datetime, BigDecimal quantity, BigDecimal price,
			String orderremarks) {
		this.state = state;
		this.employeeByOperator = employeeByOperator;
		this.department = department;
		this.types = types;
		this.employeeByOriginator = employeeByOriginator;
		this.material = material;
		this.provider = provider;
		this.ordernumber = ordernumber;
		this.datetime = datetime;
		this.quantity = quantity;
		this.price = price;
		this.orderremarks = orderremarks;
	}

	// Property accessors

	public Integer getProcurementid() {
		return this.procurementid;
	}

	public void setProcurementid(Integer procurementid) {
		this.procurementid = procurementid;
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

	public Material getMaterial() {
		return this.material;
	}

	public void setMaterial(Material material) {
		this.material = material;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
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

}