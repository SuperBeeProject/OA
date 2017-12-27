package cn.bdqn.j25.pojo;

/**
 * Equipment entity. @author MyEclipse Persistence Tools
 */

public class Equipment implements java.io.Serializable {

	// Fields

	private Integer equipmentid;
	private Provider provider;
	private Workshop workshop;
	private String equipmentname;
	private String equipmentno;
	private String equipmentsituation;
	private Integer servicelife;
	private Integer usedlife;
	private String remarks;

	// Constructors

	/** default constructor */
	public Equipment() {
	}

	/** full constructor */
	public Equipment(Provider provider, Workshop workshop,
			String equipmentname, String equipmentno,
			String equipmentsituation, Integer servicelife, Integer usedlife,
			String remarks) {
		this.provider = provider;
		this.workshop = workshop;
		this.equipmentname = equipmentname;
		this.equipmentno = equipmentno;
		this.equipmentsituation = equipmentsituation;
		this.servicelife = servicelife;
		this.usedlife = usedlife;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getEquipmentid() {
		return this.equipmentid;
	}

	public void setEquipmentid(Integer equipmentid) {
		this.equipmentid = equipmentid;
	}

	public Provider getProvider() {
		return this.provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public String getEquipmentname() {
		return this.equipmentname;
	}

	public void setEquipmentname(String equipmentname) {
		this.equipmentname = equipmentname;
	}

	public String getEquipmentno() {
		return this.equipmentno;
	}

	public void setEquipmentno(String equipmentno) {
		this.equipmentno = equipmentno;
	}

	public String getEquipmentsituation() {
		return this.equipmentsituation;
	}

	public void setEquipmentsituation(String equipmentsituation) {
		this.equipmentsituation = equipmentsituation;
	}

	public Integer getServicelife() {
		return this.servicelife;
	}

	public void setServicelife(Integer servicelife) {
		this.servicelife = servicelife;
	}

	public Integer getUsedlife() {
		return this.usedlife;
	}

	public void setUsedlife(Integer usedlife) {
		this.usedlife = usedlife;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}