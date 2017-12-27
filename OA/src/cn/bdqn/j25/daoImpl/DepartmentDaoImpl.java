package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.DepartmentDao;
import cn.bdqn.j25.pojo.Department;

public class DepartmentDaoImpl extends HibernateDaoSupport implements DepartmentDao {

	@Override
	public Department findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Department.class, id);
	}

	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Department");
		
	}

	@Override
	public Department addOrUpdateDepartment(Department department) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(department);
	}

	@Override
	public void delDepartment(Department department) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().delete(department);
	}

}
