package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Warehouse entity. @author MyEclipse Persistence Tools
 */

public class Warehouse implements java.io.Serializable {

	// Fields

	private Integer warehouseid;
	private Types types;
	private String warehousename;
	private String capacity;
	private String district;
	private String shelf;
	private String residual;
	private String remarks;
	private Set outs = new HashSet(0);
	private Set enters = new HashSet(0);

	// Constructors

	/** default constructor */
	public Warehouse() {
	}

	/** full constructor */
	public Warehouse(Types types, String warehousename, String capacity,
			String district, String shelf, String residual, String remarks,
			Set outs, Set enters) {
		this.types = types;
		this.warehousename = warehousename;
		this.capacity = capacity;
		this.district = district;
		this.shelf = shelf;
		this.residual = residual;
		this.remarks = remarks;
		this.outs = outs;
		this.enters = enters;
	}

	// Property accessors

	public Integer getWarehouseid() {
		return this.warehouseid;
	}

	public void setWarehouseid(Integer warehouseid) {
		this.warehouseid = warehouseid;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public String getWarehousename() {
		return this.warehousename;
	}

	public void setWarehousename(String warehousename) {
		this.warehousename = warehousename;
	}

	public String getCapacity() {
		return this.capacity;
	}

	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getShelf() {
		return this.shelf;
	}

	public void setShelf(String shelf) {
		this.shelf = shelf;
	}

	public String getResidual() {
		return this.residual;
	}

	public void setResidual(String residual) {
		this.residual = residual;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

}