package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Customer entity. @author MyEclipse Persistence Tools
 */

public class Customer implements java.io.Serializable {

	// Fields

	private Integer customerid;
	private String customername;
	private String address;
	private String levels;
	private String phone;
	private String contacts;
	private String remarks;
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Customer() {
	}

	/** full constructor */
	public Customer(String customername, String address, String levels,
			String phone, String contacts, String remarks, Set orderses) {
		this.customername = customername;
		this.address = address;
		this.levels = levels;
		this.phone = phone;
		this.contacts = contacts;
		this.remarks = remarks;
		this.orderses = orderses;
	}

	// Property accessors

	public Customer(Integer customerid, String customername) {
		super();
		this.customerid = customerid;
		this.customername = customername;
	}

	public Integer getCustomerid() {
		return this.customerid;
	}

	public void setCustomerid(Integer customerid) {
		this.customerid = customerid;
	}

	public String getCustomername() {
		return this.customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getLevels() {
		return this.levels;
	}

	public void setLevels(String levels) {
		this.levels = levels;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getContacts() {
		return this.contacts;
	}

	public void setContacts(String contacts) {
		this.contacts = contacts;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}