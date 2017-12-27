package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Rest;

public interface RestService {
	public Rest findByid(int id);//根据ID查询
	
	public List<Rest> findAll(Rest rest);//根据取值查询信息
	
	public List<Rest> findByPage(Rest rest,int first,int max);//分页展示全部
	
	public Rest addOrUpdateRest(Rest rest);//增加或更新信息
	
	public void delRest(Rest rest);//删除
}	
