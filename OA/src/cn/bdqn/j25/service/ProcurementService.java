package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Procurement;

public interface ProcurementService {
	public Procurement findByid(int id);//根据ID查询	
	
	public List<Procurement> findByNo(String no);//根据名称查询
		 
	public Procurement addOrUpdateProcurement(Procurement procurement);//增加或更新信息
	
	public void delProcurement(Procurement procurement); //删除
	
	public boolean addProcurement(Procurement procurement);//添加
	
	public List<Procurement> findByPage(int firstResult,int maxResults);//根据时间降序分页展示全部
	
	public int countAll();//统计所有订单数量
	
	public List<Procurement> findAllByPage(int pageNo,int max);//分页展示全部
}
