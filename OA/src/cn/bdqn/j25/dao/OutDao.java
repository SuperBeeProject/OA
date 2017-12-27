package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Out;

public interface OutDao {

	public Out findByid(int id);//根据ID查询	
	
	public List<Out> findByPage(Out out,int first,int max);//分页展示全部
	 
	public Out addOrUpdateOut(Out out);//增加或更新信息
	
	public void delOut(Out out); //删除
	
}
