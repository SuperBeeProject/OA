package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.EmployeeDao;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return employeeDao.findAll();
	}

	@Override
	public Employee findByid(int id) {
		// TODO Auto-generated method stub
		return employeeDao.findByid(id);
	}

	@Override
	public List<Employee> findByWorkidPwd(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.findByWorkidPwd(employee);
	}

	@Override
	public List<Employee> findByDepartment(String Department) {
		// TODO Auto-generated method stub
		return employeeDao.findByDepartment(Department);
	}

	@Override
	public List<Employee> findByWorkid(String Workid) {
		// TODO Auto-generated method stub
		return employeeDao.findByWorkid(Workid);
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		
		return employeeDao.findByName(name);
	}

	@Override
	public Employee addOrUpdateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		
		return employeeDao.addOrUpdateType(employee);
	}

	@Override
	public void delEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeDao.delType(employee);
	}

	@Override
	public List<Employee> findAll(Employee employee) {
		// TODO Auto-generated method stub
		return employeeDao.findAll(employee);
	}

}
