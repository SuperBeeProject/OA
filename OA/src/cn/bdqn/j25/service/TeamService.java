package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Team;

public interface TeamService {

	public Team findByid(int id);//根据id查找
	
	public List<Team> findAll();//查询全部班组信息
	
	public Team addOrUpdateTeam(Team team);//增加或更新信息
	
	public void delTeam(Team team); //删除
}
