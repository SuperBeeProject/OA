package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.hibernate.Hibernate;
import org.hibernate.type.Type;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.EmployeeDao;
import cn.bdqn.j25.pojo.Employee;

public class EmployeeDaoImpl extends HibernateDaoSupport implements EmployeeDao {

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Employee");
	}

	@Override
	public Employee findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Employee.class, id);
	}

	@Override
	public List<Employee> findByWorkidPwd(Employee employee) {
		// TODO Auto-generated method stub
	/*	Object[] obj = new Object[2];
		Type[] types = new Type[] {Hibernate.STRING, Hibernate.STRING};
		obj[0]=employee.getWorkid();
		obj[1]=employee.getPassword();*/
		return this.getHibernateTemplate().findByValueBean("from Employee e where e.workid=:workid and e.password=:password",employee);
	}
	@Override
	public List<Employee> findByDepartment(String Department) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find(
				"from Employee where department=?", Department);

	}

	@Override
	public List<Employee> findByWorkid(String Workid) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Employee where workid=?",
				Workid);
	}

	@Override
	public List<Employee> findByName(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Employee where name=?",
				name);
	}

	@Override
	public Employee addOrUpdateType(Employee employee) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(employee);
	}

	@Override
	public void delType(Employee employee) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(employee);
	}

	@Override
	public List<Employee> findAll(Employee employee) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(employee);
	}

}
