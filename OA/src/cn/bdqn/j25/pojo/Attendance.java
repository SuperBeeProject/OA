package cn.bdqn.j25.pojo;

/**
 * Attendance entity. @author MyEclipse Persistence Tools
 */

public class Attendance implements java.io.Serializable {

	// Fields

	private Integer attendanceid;
	private Employee employee;
	private Integer leave;
	private Integer absenteeism;
	private String remarks;

	// Constructors

	/** default constructor */
	public Attendance() {
	}

	/** full constructor */
	public Attendance(Employee employee, Integer leave, Integer absenteeism,
			String remarks) {
		this.employee = employee;
		this.leave = leave;
		this.absenteeism = absenteeism;
		this.remarks = remarks;
	}

	// Property accessors

	public Integer getAttendanceid() {
		return this.attendanceid;
	}

	public void setAttendanceid(Integer attendanceid) {
		this.attendanceid = attendanceid;
	}

	public Employee getEmployee() {
		return this.employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Integer getLeave() {
		return this.leave;
	}

	public void setLeave(Integer leave) {
		this.leave = leave;
	}

	public Integer getAbsenteeism() {
		return this.absenteeism;
	}

	public void setAbsenteeism(Integer absenteeism) {
		this.absenteeism = absenteeism;
	}

	public String getRemarks() {
		return this.remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}