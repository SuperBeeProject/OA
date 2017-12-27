package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class LoginAndOutAction extends ActionSupport{
	private EmployeeService employeeService;
	private Employee employee;
	private String message;

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public EmployeeService getEmployeeService() {
		return employeeService;
	}

	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	
	
	
	public String login(){
		/*Employee employee1=employeeService.findByWorkidPwd(employee).get(0);*/
		Map<String, Object> session = (Map) ActionContext.getContext().getSession();
		if(employee.getWorkid()==null||employee.getWorkid().equals("")){
			System.out.println("AAAAAAAAAAAAAAAA");
			this.setMessage("登入失败，请检查用户名或密码");
			return SUCCESS;
		}
		if(employee.getPassword()==null||employee.getPassword().equals("")){
			this.setMessage("登入失败，请检查用户名或密码");
			System.out.println("BBBBBBBBBBBBBBBBBBBBBBB");
			return SUCCESS;
		}
		else{
			List<Employee> employee1=(List<Employee>) employeeService.findByWorkidPwd(employee);
			if(employee1.size()!=0){
				Employee employee2 = employee1.get(0);
				session.put("employee", employee2);
				System.out.println("DDDDDDDDDDDDDDDDDDDDDDDDDDD");
			}
		    this.setMessage("账号密码错误请重新输入");
			/*Employee employee1=employeeService.findByWorkidPwd(employee).get(0);*/
			System.out.println("fffffffffffffffffffff");
			return SUCCESS;
		}
		
		
	}
	
	public String findEmployee(){
		Employee findemp=new Employee();
		Map<String, Object> session = (Map) ActionContext.getContext().getSession();
		if(employee != null){
			if(employee.getName()!=null&&!employee.getName().equals("")){
				findemp.setName(employee.getName());
			}
			if(employee.getWorkid()!=null&&!employee.getWorkid().equals("")){
				findemp.setWorkid(employee.getWorkid());
			}
		}
		List<Employee> emplist=employeeService.findAll(findemp);
		System.out.println("id<<<<<<<<<<<<<<<<<<<<"+employee.getWorkid());
		System.out.println("name<<<<<<<<<<<<<<<<<<<<"+employee.getName());
		
		session.put("emplist",emplist);
		for(Employee e:emplist){
			System.out.println(e.getName());
			System.out.println("post>>>>>>>>>>>>>>>>>>"+e.getPost().getPostname());
		}
		return SUCCESS;
	}

}
