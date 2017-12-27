package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Clockin;


public interface ClockinService {
	public Clockin findByid(int id);//根据ID查询
	
	public List<Clockin> findAll(Clockin clockin);//根据取值查询信息
	
	public List<Clockin> findByPage(Clockin clockin,int first,int max);//分页展示全部
	
	public Clockin addOrUpdateWages(Clockin clockin);//增加或更新信息
	
	public void delWages(Clockin clockin);//删除
}
