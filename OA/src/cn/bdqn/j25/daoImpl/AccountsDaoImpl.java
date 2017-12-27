package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.AccountsDao;
import cn.bdqn.j25.pojo.Accounts;

public class AccountsDaoImpl extends HibernateDaoSupport implements AccountsDao {

	@Override
	public Accounts findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Accounts.class, id);
	}

	@Override
	public List<Accounts> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Accounts");
	}
	
	@Override
	public Accounts addOrUpdateAccounts(Accounts accounts) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(accounts);
	}

	@Override
	public void delAccounts(Accounts accounts) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(accounts);
	}

	@Override
	public List<Accounts> findByPageTime(int first, int end) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Accounts order by time desc").subList(first, end);
	}

	

	@Override
	public List<Accounts> findByTime(String[] time,int first,int end) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Accounts where time between ? and ?", time).subList(first, end);
	}

	@Override
	public List<Accounts> findByPeopleName(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Accounts where employee.employeeid =?", name);
	}

	@Override
	public List<Accounts> findByOutOrIn(String out) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Accounts where output =?", out);
	}

	
}
