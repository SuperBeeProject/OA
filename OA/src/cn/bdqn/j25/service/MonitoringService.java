package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Monitoring;

public interface MonitoringService {
	public Monitoring findByid(int id);//根据ID查询	
	
	public List<Monitoring> findByOrders(String orderno);//根据名称查询
	
	public List<Monitoring> findByPage(Monitoring monitoring,int first,int max);//分页展示全部
	 
	public Monitoring addOrUpdateMonitoring(Monitoring monitoring);//增加或更新信息
	
	public void delMonitoring(Monitoring monitoring); //删除
	
	public boolean addMonitoring(Monitoring monitoring);//添加生产记录
	
	public List<Monitoring> findByPage(int firstResult,int maxResults);
}
