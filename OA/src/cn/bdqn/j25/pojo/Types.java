package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Types entity. @author MyEclipse Persistence Tools
 */

public class Types implements java.io.Serializable {

	// Fields

	private Integer typeid;
	private String typename;
	private Set orderses = new HashSet(0);
	private Set materials = new HashSet(0);
	private Set providers = new HashSet(0);
	private Set products = new HashSet(0);
	private Set procurements = new HashSet(0);
	private Set warehouses = new HashSet(0);

	// Constructors

	/** default constructor */
	public Types() {
	}

	/** minimal constructor */
	public Types(String typename) {
		this.typename = typename;
	}

	/** full constructor */
	public Types(String typename, Set orderses, Set materials, Set providers,
			Set products, Set procurements, Set warehouses) {
		this.typename = typename;
		this.orderses = orderses;
		this.materials = materials;
		this.providers = providers;
		this.products = products;
		this.procurements = procurements;
		this.warehouses = warehouses;
	}

	// Property accessors

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getTypename() {
		return this.typename;
	}

	public void setTypename(String typename) {
		this.typename = typename;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

	public Set getMaterials() {
		return this.materials;
	}

	public void setMaterials(Set materials) {
		this.materials = materials;
	}

	public Set getProviders() {
		return this.providers;
	}

	public void setProviders(Set providers) {
		this.providers = providers;
	}

	public Set getProducts() {
		return this.products;
	}

	public void setProducts(Set products) {
		this.products = products;
	}

	public Set getProcurements() {
		return this.procurements;
	}

	public void setProcurements(Set procurements) {
		this.procurements = procurements;
	}

	public Set getWarehouses() {
		return this.warehouses;
	}

	public void setWarehouses(Set warehouses) {
		this.warehouses = warehouses;
	}

}