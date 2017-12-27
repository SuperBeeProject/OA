package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.TemporaryDao;
import cn.bdqn.j25.pojo.Temporary;

public class TemporaryDaoImpl extends HibernateDaoSupport implements TemporaryDao {

	@Override
	public List<Temporary> finaAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Temporary");
	}

	@Override
	public List<Temporary> finaByName(Temporary temporary) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(temporary);
	}

	@Override
	public Temporary addOrUpdetaTemporary(Temporary temporary) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(temporary);
	}

	@Override
	public void delTemporary(Temporary temporary) {
		// TODO Auto-generated method stub
	
		this.getHibernateTemplate().delete(temporary);
		
		}


	@Override
	public Temporary finaMoneyByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}



}
