package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.OrderrootsDao;
import cn.bdqn.j25.pojo.Orderroots;

public class OrderrootsDaoImpl extends HibernateDaoSupport implements
		OrderrootsDao {

	@Override
	public Orderroots findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Orderroots.class, id);
	}

	@Override
	public List<Orderroots> findAll(Orderroots orderroots) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(orderroots);
	}

	@Override
	public List<Orderroots> findByPage(Orderroots orderroots, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(orderroots, first, max);
	}

	@Override
	public Orderroots addOrUpdateOrderroots(Orderroots orderroots) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(orderroots);
	}

	@Override
	public void delOrderroots(Orderroots orderroots) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(orderroots);
	}

}
