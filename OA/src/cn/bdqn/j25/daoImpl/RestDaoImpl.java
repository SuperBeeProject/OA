package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.RestDao;
import cn.bdqn.j25.pojo.Rest;

public class RestDaoImpl extends HibernateDaoSupport implements RestDao {

	@Override
	public Rest findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Rest.class, id);
	}

	@Override
	public List<Rest> findAll(Rest rest) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(rest);
	}

	@Override
	public List<Rest> findByPage(Rest rest, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(rest, first, max);
	}

	@Override
	public Rest addOrUpdateRest(Rest rest) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(rest);
	}

	@Override
	public void delRest(Rest rest) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(rest);
	}

}
