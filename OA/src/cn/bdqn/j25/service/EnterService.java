package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Enter;

public interface EnterService {

	public Enter findByid(int id);//根据ID查询	
	
	public List<Enter> findByPage(Enter enter,int first,int max);//分页展示全部
	 
	public Enter addOrUpdateOut(Enter enter);//增加或更新信息
	
	public void delEnter(Enter enter); //删除
	
}
