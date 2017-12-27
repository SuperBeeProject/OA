package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.PerformancesDao;
import cn.bdqn.j25.pojo.Performances;

public class PerformancesDaoImpl extends HibernateDaoSupport implements
		PerformancesDao {

	@Override
	public Performances findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Performances.class, id);
	}

	@Override
	public List<Performances> findByName(String name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Performances where name =?", name);
	}

	@Override
	public List<Performances> findByPage(Performances performances, int first,
			int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(performances, first, max);
	}

	@Override
	public Performances addOrUpdatePerformances(Performances performances) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(performances);
	}

	@Override
	public void delPerformances(Performances performances) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(performances);
	}

}
