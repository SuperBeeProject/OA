package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.WorkshopDao;
import cn.bdqn.j25.pojo.Workshop;

public class WorkshopDaoImpl extends HibernateDaoSupport implements WorkshopDao {

	@Override
	public Workshop findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Workshop.class, id);
	}

	@Override
	public List<Workshop> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Workshop");
	}

	@Override
	public Workshop addOrUpdateWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(workshop);
	}

	@Override
	public void delWorkshop(Workshop workshop) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(workshop);
	}

}
