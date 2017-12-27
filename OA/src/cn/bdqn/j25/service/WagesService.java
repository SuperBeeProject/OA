package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Wages;

public interface WagesService {
	public Wages findByid(int id);//根据ID查询
	
	public List<Wages> findAll(Wages wages);//根据取值查询信息
	
	public List<Wages> findByPage(Wages wages,int first,int max);//分页展示全部
	
	public Wages addOrUpdateWages(Wages wages);//增加或更新信息
	
	public void delWages(Wages wages);//删除
}
