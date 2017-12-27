package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Proorder;

public interface ProorderDao {
	public Proorder findByid(int id);//根据ID查询	
	
	public List<Proorder> findByOrderNo(String orderno);//根据订单编号查询
	
	public List<Proorder> findByPage(Proorder proorder,int first,int max);//分页展示全部
	 
	public Proorder addOrUpdateProorder(Proorder proorder);//增加或更新信息
	
	public void delProorder(Proorder proorder); //删除
	
	public void addProorder(Proorder proorder);//添加
	
	public List<Proorder> findAllProorder();//查询全部生产订单
}
