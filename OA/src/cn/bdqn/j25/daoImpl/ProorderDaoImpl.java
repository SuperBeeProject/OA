package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ProorderDao;
import cn.bdqn.j25.pojo.Proorder;

public class ProorderDaoImpl extends HibernateDaoSupport implements ProorderDao {

	@Override
	public Proorder findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Proorder.class, id);
	}

	@Override
	public List<Proorder> findByOrderNo(String orderno) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Proorder where orders.orderno =?", orderno);
	}

	@Override
	public List<Proorder> findByPage(Proorder proorder, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(proorder, first, max);
	}

	@Override
	public Proorder addOrUpdateProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(proorder);
	}

	@Override
	public void delProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(proorder);
	}

	@Override
	public void addProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(proorder);
	}

	@Override
	public List<Proorder> findAllProorder() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Proorder");
	}

}
