package cn.bdqn.j25.action;

import java.util.List;
import java.util.Map;

import cn.bdqn.j25.pojo.Contact;
import cn.bdqn.j25.pojo.Department;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.ContactService;
import cn.bdqn.j25.service.EmployeeService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class ContactAction extends ActionSupport{
	private EmployeeService employeeService;
	private Employee employeeBySender;//发
	private Employee employeeByRecipient;//收
	private Contact contact;
	private Department  department;
	private ContactService contactService;
	



	public Department getDepartment() {
		return department;
	}



	public void setDepartment(Department department) {
		this.department = department;
	}



	public EmployeeService getEmployeeService() {
		return employeeService;
	}



	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}



	public Employee getEmployeeBySender() {
		return employeeBySender;
	}



	public void setEmployeeBySender(Employee employeeBySender) {
		this.employeeBySender = employeeBySender;
	}



	public Employee getEmployeeByRecipient() {
		return employeeByRecipient;
	}



	public void setEmployeeByRecipient(Employee employeeByRecipient) {
		this.employeeByRecipient = employeeByRecipient;
	}



	public Contact getContact() {
		return contact;
	}



	public void setContact(Contact contact) {
		this.contact = contact;
	}
	
	
	
	public String getEmps(){
		List<Employee> listemp=employeeService.findByDepartmentName(department.getDepartmentname());
		employeeBySender=(Employee) ActionContext.getContext().getSession().get("employee");
		Map<String, Object> request = (Map) ActionContext.getContext().get("request");
		request.put("listemps",listemp);
		return SUCCESS;
	}
   public String addContact(){
	   System.out.println("....aaaaa...................");
		employeeBySender=(Employee) ActionContext.getContext().getSession().get("employee");
		System.out.println(employeeBySender.getName());
		System.out.println(employeeByRecipient.getName());
       contact.setEmployeeByRecipient(employeeByRecipient);
        contact.setEmployeeBySender(employeeBySender);
		System.out.println(contact.getEmployeeByRecipient().getName());
		contactService.addContact(contact);
        System.out.println("...............................");
	return SUCCESS;
	}



public ContactService getContactService() {
	return contactService;
}



public void setContactService(ContactService contactService) {
	this.contactService = contactService;
}
   
}
