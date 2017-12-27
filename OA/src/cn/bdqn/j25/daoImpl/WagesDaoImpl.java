package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.WagesDao;
import cn.bdqn.j25.pojo.Wages;

public class WagesDaoImpl extends HibernateDaoSupport implements WagesDao{

	@Override
	public Wages findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Wages.class, id);
	}

	@Override
	public List<Wages> findAll(Wages wages) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(wages);
	}

	@Override
	public List<Wages> findByPage(Wages wages, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(wages, first, max);
	}

	@Override
	public Wages addOrUpdateWages(Wages wages) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(wages);
	}

	@Override
	public void delWages(Wages wages) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(wages);
	}

}
