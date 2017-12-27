package cn.bdqn.j25.pojo;

import java.sql.Timestamp;

/**
 * Announcement entity. @author MyEclipse Persistence Tools
 */

public class Announcement implements java.io.Serializable {

	// Fields

	private Integer announcementid;
	private State state;
	private Employee employee;
	private Department department;
	private String title;
	private Timestamp time;
	private Integer typeid;
	private String image;
	private String remarks;
	private String context;

	// Constructors

	/** default constructor */
	public Announcement() {
	}

	/** full constructor */
	public Announcement(State state, Employee employee, Department department,
			String title, Timestamp time, Integer typeid, String image,
			String remarks, String context) {
		this.state = state;
		this.employee = employee;
		this.department = department;
		this.title = title;
		this.time = time;
		this.typeid = typeid;
		this.image = image;
		this.remarks = remarks;
		this.context = context;
	}

	// Property accessors

	public Integer getAnnouncementid() {
		return this.announcementid;
	}

	public void setAnnouncementid(Integer announcementid) {
		this.announcementid = announcementid;
	}

	public State getState() {
		return this.state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public Integer getTypeid() {
		return this.typeid;
	}

	public void setTypeid(Integer typeid) {
		this.typeid = typeid;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getContext() {
		return this.context;
	}

	public void setContext(String context) {
		this.context = context;
	}

}