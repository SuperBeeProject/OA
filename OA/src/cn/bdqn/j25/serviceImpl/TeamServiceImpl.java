package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.TeamDao;
import cn.bdqn.j25.pojo.Team;
import cn.bdqn.j25.service.TeamService;

public class TeamServiceImpl implements TeamService {

	private TeamDao teamDao;

	public TeamDao getTeamDao() {
		return teamDao;
	}

	public void setTeamDao(TeamDao teamDao) {
		this.teamDao = teamDao;
	}

	@Override
	public Team findByid(int id) {
		// TODO Auto-generated method stub
		return teamDao.findByid(id);
	}

	@Override
	public List<Team> findAll() {
		// TODO Auto-generated method stub
		return teamDao.findAll();
	}

	@Override
	public Team addOrUpdateTeam(Team team) {
		// TODO Auto-generated method stub
		return teamDao.addOrUpdateTeam(team);
	}

	@Override
	public void delTeam(Team team) {
		// TODO Auto-generated method stub	
			teamDao.delTeam(team);
		
	}

}
