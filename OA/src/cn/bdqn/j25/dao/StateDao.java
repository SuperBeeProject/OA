package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.State;

public interface StateDao {
	
	public State findByid(int id);//根据ID查询	
	
	public List<State> findByName(String name);//根据名字查询
		 
	public State addOrUpdateState(State state);//增加或更新信息
	
	public void delState(State state); //删除
}
