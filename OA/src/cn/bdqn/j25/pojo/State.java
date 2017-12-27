package cn.bdqn.j25.pojo;

import java.util.HashSet;
import java.util.Set;

/**
 * State entity. @author MyEclipse Persistence Tools
 */

public class State implements java.io.Serializable {

	// Fields

	private Integer stateid;
	private String statename;
	private Set procurements = new HashSet(0);
	private Set orderrootses = new HashSet(0);
	private Set contacts = new HashSet(0);
	private Set announcements = new HashSet(0);
	private Set orderses = new HashSet(0);

	// Constructors

	/** default constructor */
	public State() {
	}

	/** minimal constructor */
	public State(String statename) {
		this.statename = statename;
	}

	/** full constructor */
	public State(String statename, Set procurements, Set orderrootses,
			Set contacts, Set announcements, Set orderses) {
		this.statename = statename;
		this.procurements = procurements;
		this.orderrootses = orderrootses;
		this.contacts = contacts;
		this.announcements = announcements;
		this.orderses = orderses;
	}

	// Property accessors

	public Integer getStateid() {
		return this.stateid;
	}

	public void setStateid(Integer stateid) {
		this.stateid = stateid;
	}

	public String getStatename() {
		return this.statename;
	}

	public void setStatename(String statename) {
		this.statename = statename;
	}

	public Set getProcurements() {
		return this.procurements;
	}

	public void setProcurements(Set procurements) {
		this.procurements = procurements;
	}

	public Set getOrderrootses() {
		return this.orderrootses;
	}

	public void setOrderrootses(Set orderrootses) {
		this.orderrootses = orderrootses;
	}

	public Set getContacts() {
		return this.contacts;
	}

	public void setContacts(Set contacts) {
		this.contacts = contacts;
	}

	public Set getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set announcements) {
		this.announcements = announcements;
	}

	public Set getOrderses() {
		return this.orderses;
	}

	public void setOrderses(Set orderses) {
		this.orderses = orderses;
	}

}