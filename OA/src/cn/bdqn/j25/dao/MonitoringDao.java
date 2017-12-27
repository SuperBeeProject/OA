package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Monitoring;


public interface MonitoringDao {
	public Monitoring findByid(int id);//根据ID查询	
	
	public List<Monitoring> findByOrders(String orderno);//根据名称查询
	
	public List<Monitoring> findByPage(Monitoring monitoring,int first,int max);//分页展示全部
	 
	public Monitoring addOrUpdateMonitoring(Monitoring monitoring);//增加或更新信息
	
	public void delMonitoring(Monitoring monitoring); //删除
	
	public void addMonitoring(Monitoring monitoring);//添加生产记录
	
	public List<Monitoring> findByPage(int firstResult,int maxResults);//分页展示全部
}
