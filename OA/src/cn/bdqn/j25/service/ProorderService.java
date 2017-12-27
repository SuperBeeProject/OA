package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Proorder;

public interface ProorderService {
	public Proorder findByid(int id);//根据ID查询	
	
	public List<Proorder> findByOrderNo(String orderno);//根据订单编号查询
	
	public List<Proorder> findByPage(Proorder proorder,int first,int max);//分页展示全部
	 
	public Proorder addOrUpdateProorder(Proorder proorder);//增加或更新信息
	
	public boolean delProorder(Proorder proorder); //删除
	
	public boolean addProorder(Proorder proorder);//添加
	
	public List<Proorder> findAllProorder();//查询全部生产订单
}
