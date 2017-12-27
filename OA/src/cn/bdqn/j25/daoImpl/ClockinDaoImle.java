package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ClockinDao;
import cn.bdqn.j25.pojo.Clockin;

public class ClockinDaoImle extends HibernateDaoSupport implements ClockinDao {

	@Override
	public Clockin findByID(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Clockin.class, id);
	}

	@Override
	public List<Clockin> findAll(Clockin clockin) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(clockin);
	}

	@Override
	public List<Clockin> findByPage(Clockin clockin, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(clockin, first, max);
	}

	@Override
	public Clockin addOrUpdateClockin(Clockin clockin) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(clockin);
	}

	@Override
	public void delClockin(Clockin clockin) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(clockin);
	}

}
