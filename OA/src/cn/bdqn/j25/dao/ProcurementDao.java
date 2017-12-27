package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Procurement;

public interface ProcurementDao {
	public Procurement findByid(int id);//根据ID查询	
	
	public List<Procurement> findByNo(String no);//根据名称查询
	
	public List<Procurement> findByPage(int firstResult,int maxResults);//根据时间降序分页展示全部
	 
	public Procurement addOrUpdateProcurement(Procurement procurement);//增加或更新信息
	
	public void delProcurement(Procurement procurement); //删除
	
	public void addProcurement(Procurement procurement);//添加

	int countAll();//统计数量

	List<Procurement> findAllByPage(int pageNo, int max);//分页查询所有
}
