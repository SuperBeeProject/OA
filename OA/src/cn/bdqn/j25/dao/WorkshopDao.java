package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Workshop;

public interface WorkshopDao {
	
	public Workshop findByid(int id);//根据ID查询
	
	public List<Workshop> findAll();//查询全部车间信息
	
	public Workshop addOrUpdateWorkshop(Workshop workshop);//增加或更新车间信息
	
	public void delWorkshop(Workshop workshop);//删除
}
