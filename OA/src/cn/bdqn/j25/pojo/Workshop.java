package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * Workshop entity. @author MyEclipse Persistence Tools
 */

public class Workshop implements java.io.Serializable {

	// Fields

	private Integer workshopid;
	private String workshopname;
	private Set equipments = new HashSet(0);
	private Set employees = new HashSet(0);

	// Constructors

	/** default constructor */
	public Workshop() {
	}

	/** full constructor */
	public Workshop(String workshopname, Set equipments, Set employees) {
		this.workshopname = workshopname;
		this.equipments = equipments;
		this.employees = employees;
	}

	// Property accessors

	public Integer getWorkshopid() {
		return this.workshopid;
	}

	public void setWorkshopid(Integer workshopid) {
		this.workshopid = workshopid;
	}

	public String getWorkshopname() {
		return this.workshopname;
	}

	public void setWorkshopname(String workshopname) {
		this.workshopname = workshopname;
	}

	public Set getEquipments() {
		return this.equipments;
	}

	public void setEquipments(Set equipments) {
		this.equipments = equipments;
	}

	public Set getEmployees() {
		return this.employees;
	}

	public void setEmployees(Set employees) {
		this.employees = employees;
	}

}