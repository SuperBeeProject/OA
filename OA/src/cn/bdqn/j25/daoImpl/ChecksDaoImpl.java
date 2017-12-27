package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ChecksDao;
import cn.bdqn.j25.pojo.Checks;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.Proorder;
import cn.bdqn.j25.pojo.Types;

public class ChecksDaoImpl extends HibernateDaoSupport implements ChecksDao {

	@Override
	public List<Checks> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Checks");
	}

	@Override
	public Checks mergeChecks(Checks checks) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(checks);
	}

	@Override
	public List<Checks> findChecksById(int checkId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Checks where checkid=?", checkId);
	}

	@Override
	public List<Checks> findChecksByEmployeeId(int employeeId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Checks c,Employee e where c.employee = e and employeeId = ?",employeeId);
	}

	@Override
	public List<Checks> findChecksByProorderId(int proorderId) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Checks c,Proorder p where c.proorder = p and proorderId = ?",proorderId);
	}
}
