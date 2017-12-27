package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * Temporary entity. @author MyEclipse Persistence Tools
 */

public class Temporary implements java.io.Serializable {

	// Fields

	private Integer temporaryid;
	private String name;
	private String phone;
	private Timestamp time;
	private BigDecimal money;

	// Constructors

	/** default constructor */
	public Temporary() {
	}

	/** full constructor */
	public Temporary(String name, String phone, Timestamp time, BigDecimal money) {
		this.name = name;
		this.phone = phone;
		this.time = time;
		this.money = money;
	}

	// Property accessors

	public Integer getTemporaryid() {
		return this.temporaryid;
	}

	public void setTemporaryid(Integer temporaryid) {
		this.temporaryid = temporaryid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Timestamp getTime() {
		return this.time;
	}

	public void setTime(Timestamp time) {
		this.time = time;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

}