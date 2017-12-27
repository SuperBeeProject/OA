package cn.bdqn.j25.dao;

import java.util.List;
import cn.bdqn.j25.pojo.Department;

public interface DepartmentDao {

	public Department findByid(int id);//根据id查询部门信息
	
	public List<Department> findAll();//查询全部
	
	public Department addOrUpdateDepartment(Department department); //增加或更新部门信息
	
	public void delDepartment(Department department); //删除
}
