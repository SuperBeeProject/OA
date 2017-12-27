package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.TeamDao;
import cn.bdqn.j25.pojo.Team;

public class TeamDaoImpl extends HibernateDaoSupport implements TeamDao {

	@Override
	public Team findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Team.class, id);
	}

	@Override
	public List<Team> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Team");
	}

	@Override
	public Team addOrUpdateTeam(Team team) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(team);
	}

	@Override
	public void delTeam(Team team) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(team);
	}

}
