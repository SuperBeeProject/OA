package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class EmployeeAction extends ActionSupport {

	private EmployeeService employeeService;
	private String name;
	private Employee employee;

	@SuppressWarnings("unchecked")
	private Map<String, Object> request = (Map) ActionContext.getContext().get(
			"request");

	public String findAllEmployee() {
		List<Employee> list = employeeService.findAll();
		request.put("employee", list);
		return SUCCESS;
	}

	public String findEmployeeByName() {
		List<Employee> list = employeeService.findByWorkidPwd(employee);
		request.put("employee", list);
		return SUCCESS;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}
