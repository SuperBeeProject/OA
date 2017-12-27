package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Employee;

public interface EmployeeService {

	public List<Employee> findAll(); // 查询全部员工信息

	public Employee findByid(int id);// 根据id查询

	public List<Employee> findByWorkidPwd(Employee employee);// 根据名字密码查询(登录)

	public List<Employee> findByDepartment(String Department);// 根据部门信息查询

	public List<Employee> findByWorkid(String Workid);// 根据职工号查询

	public List<Employee> findByName(String name);// 根据名字查询

	public Employee addOrUpdateEmployee(Employee employee); // 增加或更新类型

	public void delEmployee(Employee employee); // 增加类型

	public List<Employee> findAll(Employee employee);
}
