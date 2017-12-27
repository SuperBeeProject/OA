package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.EnterDao;
import cn.bdqn.j25.pojo.Enter;
import cn.bdqn.j25.pojo.Out;

public class EnterDaoImpl extends HibernateDaoSupport implements EnterDao {

	@Override
	public Enter findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Enter.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Enter> findByPage(Enter enter, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(enter, first, max);
	}

	@Override
	public Enter addOrUpdateOut(Enter enter) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(enter);
	}

	@Override
	public void delEnter(Enter enter) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(enter);
	}

}
