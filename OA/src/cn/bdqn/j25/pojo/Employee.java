package cn.bdqn.j25.pojo;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;

/**
 * Employee entity. @author MyEclipse Persistence Tools
 */

public class Employee implements java.io.Serializable {

	// Fields

	private Integer employeeid;
	private Team team;
	private Department department;
	private Workshop workshop;
	private Post post;
	private String workid;
	private String name;
	private String sex;
	private String nation;
	private Timestamp birthday;
	private Timestamp entrytime;
	private String education;
	private String phone;
	private String address;
	private BigDecimal money;
	private String password;
	private Integer resttime;
	private Set outs = new HashSet(0);
	private Set wageses = new HashSet(0);
	private Set accountses = new HashSet(0);
	private Set checkses = new HashSet(0);
	private Set contactsForSender = new HashSet(0);
	private Set attendances = new HashSet(0);
	private Set ordersesForOriginator = new HashSet(0);
	private Set orderrootses = new HashSet(0);
	private Set contactsForRecipient = new HashSet(0);
	private Set restsForRester = new HashSet(0);
	private Set ordersesForOperator = new HashSet(0);
	private Set enters = new HashSet(0);
	private Set holidaysesForApprover = new HashSet(0);
	private Set holidaysesForLeaver = new HashSet(0);
	private Set monitoringsForProorderpeople = new HashSet(0);
	private Set proorders = new HashSet(0);
	private Set performanceses = new HashSet(0);
	private Set procurementsForOperator = new HashSet(0);
	private Set procurementsForOriginator = new HashSet(0);
	private Set monitoringsForProducter = new HashSet(0);
	private Set clockins = new HashSet(0);
	private Set restsForApprover = new HashSet(0);
	private Set announcements = new HashSet(0);

	// Constructors

	/** default constructor */
	public Employee() {
	}

	/** full constructor */
	public Employee(Team team, Department department, Workshop workshop,
			Post post, String workid, String name, String sex, String nation,
			Timestamp birthday, Timestamp entrytime, String education,
			String phone, String address, BigDecimal money, String password,
			Integer resttime, Set outs, Set wageses, Set accountses,
			Set checkses, Set contactsForSender, Set attendances,
			Set ordersesForOriginator, Set orderrootses,
			Set contactsForRecipient, Set restsForRester,
			Set ordersesForOperator, Set enters, Set holidaysesForApprover,
			Set holidaysesForLeaver, Set monitoringsForProorderpeople,
			Set proorders, Set performanceses, Set procurementsForOperator,
			Set procurementsForOriginator, Set monitoringsForProducter,
			Set clockins, Set restsForApprover, Set announcements) {
		this.team = team;
		this.department = department;
		this.workshop = workshop;
		this.post = post;
		this.workid = workid;
		this.name = name;
		this.sex = sex;
		this.nation = nation;
		this.birthday = birthday;
		this.entrytime = entrytime;
		this.education = education;
		this.phone = phone;
		this.address = address;
		this.money = money;
		this.password = password;
		this.resttime = resttime;
		this.outs = outs;
		this.wageses = wageses;
		this.accountses = accountses;
		this.checkses = checkses;
		this.contactsForSender = contactsForSender;
		this.attendances = attendances;
		this.ordersesForOriginator = ordersesForOriginator;
		this.orderrootses = orderrootses;
		this.contactsForRecipient = contactsForRecipient;
		this.restsForRester = restsForRester;
		this.ordersesForOperator = ordersesForOperator;
		this.enters = enters;
		this.holidaysesForApprover = holidaysesForApprover;
		this.holidaysesForLeaver = holidaysesForLeaver;
		this.monitoringsForProorderpeople = monitoringsForProorderpeople;
		this.proorders = proorders;
		this.performanceses = performanceses;
		this.procurementsForOperator = procurementsForOperator;
		this.procurementsForOriginator = procurementsForOriginator;
		this.monitoringsForProducter = monitoringsForProducter;
		this.clockins = clockins;
		this.restsForApprover = restsForApprover;
		this.announcements = announcements;
	}

	// Property accessors

	public Integer getEmployeeid() {
		return this.employeeid;
	}

	public void setEmployeeid(Integer employeeid) {
		this.employeeid = employeeid;
	}

	public Team getTeam() {
		return this.team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Department getDepartment() {
		return this.department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Workshop getWorkshop() {
		return this.workshop;
	}

	public void setWorkshop(Workshop workshop) {
		this.workshop = workshop;
	}

	public Post getPost() {
		return this.post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public String getWorkid() {
		return this.workid;
	}

	public void setWorkid(String workid) {
		this.workid = workid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getNation() {
		return this.nation;
	}

	public void setNation(String nation) {
		this.nation = nation;
	}

	public Timestamp getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Timestamp birthday) {
		this.birthday = birthday;
	}

	public Timestamp getEntrytime() {
		return this.entrytime;
	}

	public void setEntrytime(Timestamp entrytime) {
		this.entrytime = entrytime;
	}

	public String getEducation() {
		return this.education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getMoney() {
		return this.money;
	}

	public void setMoney(BigDecimal money) {
		this.money = money;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getResttime() {
		return this.resttime;
	}

	public void setResttime(Integer resttime) {
		this.resttime = resttime;
	}

	public Set getOuts() {
		return this.outs;
	}

	public void setOuts(Set outs) {
		this.outs = outs;
	}

	public Set getWageses() {
		return this.wageses;
	}

	public void setWageses(Set wageses) {
		this.wageses = wageses;
	}

	public Set getAccountses() {
		return this.accountses;
	}

	public void setAccountses(Set accountses) {
		this.accountses = accountses;
	}

	public Set getCheckses() {
		return this.checkses;
	}

	public void setCheckses(Set checkses) {
		this.checkses = checkses;
	}

	public Set getContactsForSender() {
		return this.contactsForSender;
	}

	public void setContactsForSender(Set contactsForSender) {
		this.contactsForSender = contactsForSender;
	}

	public Set getAttendances() {
		return this.attendances;
	}

	public void setAttendances(Set attendances) {
		this.attendances = attendances;
	}

	public Set getOrdersesForOriginator() {
		return this.ordersesForOriginator;
	}

	public void setOrdersesForOriginator(Set ordersesForOriginator) {
		this.ordersesForOriginator = ordersesForOriginator;
	}

	public Set getOrderrootses() {
		return this.orderrootses;
	}

	public void setOrderrootses(Set orderrootses) {
		this.orderrootses = orderrootses;
	}

	public Set getContactsForRecipient() {
		return this.contactsForRecipient;
	}

	public void setContactsForRecipient(Set contactsForRecipient) {
		this.contactsForRecipient = contactsForRecipient;
	}

	public Set getRestsForRester() {
		return this.restsForRester;
	}

	public void setRestsForRester(Set restsForRester) {
		this.restsForRester = restsForRester;
	}

	public Set getOrdersesForOperator() {
		return this.ordersesForOperator;
	}

	public void setOrdersesForOperator(Set ordersesForOperator) {
		this.ordersesForOperator = ordersesForOperator;
	}

	public Set getEnters() {
		return this.enters;
	}

	public void setEnters(Set enters) {
		this.enters = enters;
	}

	public Set getHolidaysesForApprover() {
		return this.holidaysesForApprover;
	}

	public void setHolidaysesForApprover(Set holidaysesForApprover) {
		this.holidaysesForApprover = holidaysesForApprover;
	}

	public Set getHolidaysesForLeaver() {
		return this.holidaysesForLeaver;
	}

	public void setHolidaysesForLeaver(Set holidaysesForLeaver) {
		this.holidaysesForLeaver = holidaysesForLeaver;
	}

	public Set getMonitoringsForProorderpeople() {
		return this.monitoringsForProorderpeople;
	}

	public void setMonitoringsForProorderpeople(Set monitoringsForProorderpeople) {
		this.monitoringsForProorderpeople = monitoringsForProorderpeople;
	}

	public Set getProorders() {
		return this.proorders;
	}

	public void setProorders(Set proorders) {
		this.proorders = proorders;
	}

	public Set getPerformanceses() {
		return this.performanceses;
	}

	public void setPerformanceses(Set performanceses) {
		this.performanceses = performanceses;
	}

	public Set getProcurementsForOperator() {
		return this.procurementsForOperator;
	}

	public void setProcurementsForOperator(Set procurementsForOperator) {
		this.procurementsForOperator = procurementsForOperator;
	}

	public Set getProcurementsForOriginator() {
		return this.procurementsForOriginator;
	}

	public void setProcurementsForOriginator(Set procurementsForOriginator) {
		this.procurementsForOriginator = procurementsForOriginator;
	}

	public Set getMonitoringsForProducter() {
		return this.monitoringsForProducter;
	}

	public void setMonitoringsForProducter(Set monitoringsForProducter) {
		this.monitoringsForProducter = monitoringsForProducter;
	}

	public Set getClockins() {
		return this.clockins;
	}

	public void setClockins(Set clockins) {
		this.clockins = clockins;
	}

	public Set getRestsForApprover() {
		return this.restsForApprover;
	}

	public void setRestsForApprover(Set restsForApprover) {
		this.restsForApprover = restsForApprover;
	}

	public Set getAnnouncements() {
		return this.announcements;
	}

	public void setAnnouncements(Set announcements) {
		this.announcements = announcements;
	}

}