package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Performances;

public interface PerformancesDao {

	public Performances findByid(int id);//根据ID查询	
	
	public List<Performances> findByName(String name);//根据名字查询
	
	public List<Performances> findByPage(Performances performances,int first,int max);//分页展示全部
	 
	public Performances addOrUpdatePerformances(Performances performances);//增加或更新信息
	
	public void delPerformances(Performances performances); //删除
}
