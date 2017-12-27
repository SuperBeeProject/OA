package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.StateDao;
import cn.bdqn.j25.pojo.State;

public class StateDaoImpl extends HibernateDaoSupport implements StateDao {

	@Override
	public State findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(State.class, id);
	}

	@Override
	public List<State> findByName(String name) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from State where statename =?",name);
	}

	@Override
	public State addOrUpdateState(State state) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(state);
	}

	@Override
	public void delState(State state) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(state);
	}

}
