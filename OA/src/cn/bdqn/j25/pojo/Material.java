package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

/**
 * Material entity. @author MyEclipse Persistence Tools
 */

public class Material implements java.io.Serializable {

	// Fields

	private Integer materialid;
	private Types types;
	private Provider provider;
	private String materialname;
	private String materialno;
	private BigDecimal materialprice;
	private Integer shelflife;
	private String materialmodel;
	private BigDecimal truckage;
	private String materialremarks;
	private String unit;
	private Set procurements = new HashSet(0);

	// Constructors

	/** default constructor */
	public Material() {
	}

	/** full constructor */
	public Material(Types types, Provider provider, String materialname,
			String materialno, BigDecimal materialprice, Integer shelflife,
			String materialmodel, BigDecimal truckage, String materialremarks,
			String unit, Set procurements) {
		this.types = types;
		this.provider = provider;
		this.materialname = materialname;
		this.materialno = materialno;
		this.materialprice = materialprice;
		this.shelflife = shelflife;
		this.materialmodel = materialmodel;
		this.truckage = truckage;
		this.materialremarks = materialremarks;
		this.unit = unit;
		this.procurements = procurements;
	}
	
	public Material(Integer materialid, String materialname) {
		super();
		this.materialid = materialid;
		this.materialname = materialname;
	}

	// Property accessors

	public Integer getMaterialid() {
		return this.materialid;
	}

	public void setMaterialid(Integer materialid) {
		this.materialid = materialid;
	}

	public Types getTypes() {
		return this.types;
	}

	public void setTypes(Types types) {
		this.types = types;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public String getMaterialname() {
		return this.materialname;
	}

	public void setMaterialname(String materialname) {
		this.materialname = materialname;
	}

	public String getMaterialno() {
		return this.materialno;
	}

	public void setMaterialno(String materialno) {
		this.materialno = materialno;
	}

	public BigDecimal getMaterialprice() {
		return this.materialprice;
	}

	public void setMaterialprice(BigDecimal materialprice) {
		this.materialprice = materialprice;
	}

	public Integer getShelflife() {
		return this.shelflife;
	}

	public void setShelflife(Integer shelflife) {
		this.shelflife = shelflife;
	}

	public String getMaterialmodel() {
		return this.materialmodel;
	}

	public void setMaterialmodel(String materialmodel) {
		this.materialmodel = materialmodel;
	}

	public BigDecimal getTruckage() {
		return this.truckage;
	}

	public void setTruckage(BigDecimal truckage) {
		this.truckage = truckage;
	}

	public String getMaterialremarks() {
		return this.materialremarks;
	}

	public void setMaterialremarks(String materialremarks) {
		this.materialremarks = materialremarks;
	}

	public String getUnit() {
		return this.unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public Set getProcurements() {
		return this.procurements;
	}

	public void setProcurements(Set procurements) {
		this.procurements = procurements;
	}

}