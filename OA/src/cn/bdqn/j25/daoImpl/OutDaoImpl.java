package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.OutDao;
import cn.bdqn.j25.pojo.Out;

public class OutDaoImpl extends HibernateDaoSupport implements OutDao {

	@Override
	public Out findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Out.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Out> findByPage(Out out, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(out, first, max);
	}

	@Override
	public Out addOrUpdateOut(Out out) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(out);
	}

	@Override
	public void delOut(Out out) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(out);
	}

}
