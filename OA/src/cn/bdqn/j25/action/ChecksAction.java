package cn.bdqn.j25.action;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import cn.bdqn.j25.pojo.Checks;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Proorder;
import cn.bdqn.j25.service.ChecksService;
import cn.bdqn.j25.service.EmployeeService;
import cn.bdqn.j25.service.ProorderService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ChecksAction extends ActionSupport {

	private ChecksService checksService;
	private EmployeeService employeeService;
	private ProorderService proorderService;
	private String checkId;
	private String employeeId;
	private String proorderId;
	private String name;
	private int quantity;
	private String qualifiedrate;
	private String reasons;
	private String remarks;
	private Map<String, Object> request = (Map) ActionContext.getContext().get("request");

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getQualifiedrate() {
		return qualifiedrate;
	}

	public void setQualifiedrate(String qualifiedrate) {
		this.qualifiedrate = qualifiedrate;
	}

	public String getReasons() {
		return reasons;
	}

	public void setReasons(String reasons) {
		this.reasons = reasons;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getProorderId() {
		return proorderId;
	}

	public void setProorderId(String proorderId) {
		this.proorderId = proorderId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public String getCheckId() {
		return checkId;
	}

	public void setCheckId(String checkId) {
		this.checkId = checkId;
	}

	public ChecksService getChecksService() {
		return checksService;
	}

	public void setChecksService(ChecksService checksService) {
		this.checksService = checksService;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public ProorderService getProorderService() {
		return proorderService;
	}

	public void setProorderService(ProorderService proorderService) {
		this.proorderService = proorderService;
	}

	public String findAll(){
		List<Checks> checkList = checksService.findAll();
		request.put("checkList", checkList);
		return SUCCESS;
	}
	public String findChecksById(){
		List<Checks> checkList = checksService.findChecksById(Integer.parseInt(checkId));
		request.put("checkList", checkList);
		return SUCCESS;
	}
	public String findChecksByEmployeeId(){
		List<Object[]> checkList = checksService.findChecksByEmployeeId(Integer.parseInt(employeeId));
		/*for(Object[] a : checkList){
			System.out.println(((Employee)a[1]).getName());
		}*/
		request.put("checkList", checkList);
		return SUCCESS;
	}
	public String findChecksByProorderId(){
		List<Object[]> checkList = checksService.findChecksByProorderId(Integer.parseInt(proorderId));
		request.put("checkList", checkList);
		return SUCCESS;
	}
	public String addChecks(){
		Employee employee = employeeService.findByid(Integer.parseInt(employeeId));
		Proorder proorder = proorderService.findByid(Integer.parseInt(proorderId));
		Checks checks = new Checks(employee, proorder, name, quantity, qualifiedrate, new java.sql.Timestamp(new java.util.Date().getTime()), reasons, remarks);
		checksService.mergeChecks(checks);
		request.put("qualifiedrate", qualifiedrate);
		request.put("quantity", quantity);
		request.put("reasons", reasons);
		return "showCheck";
		
		/*Checks checks=new Checks();		
		checks.setName("2");
		checksService.mergeChecks(checks);
		return "showCheck";*/
	}
}
