package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Orderroots;

public interface OrderrootsService {
	public Orderroots findByid(int id);//根据ID查询
	
	public List<Orderroots> findAll(Orderroots orderroots);//根据取值查询信息
	
	public List<Orderroots> findByPage(Orderroots orderroots,int first,int max);//分页展示全部
	
	public Orderroots addOrUpdateOrderroots(Orderroots orderroots);//增加或更新信息
	
	public void delOrderroots(Orderroots orderroots);//删除
}
