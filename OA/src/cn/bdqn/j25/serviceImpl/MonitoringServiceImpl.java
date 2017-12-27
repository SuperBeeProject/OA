package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.MonitoringDao;
import cn.bdqn.j25.pojo.Monitoring;
import cn.bdqn.j25.service.MonitoringService;

public class MonitoringServiceImpl implements MonitoringService {

	private MonitoringDao monitoringDao;
	
	public MonitoringDao getMonitoringDao() {
		return monitoringDao;
	}

	public void setMonitoringDao(MonitoringDao monitoringDao) {
		this.monitoringDao = monitoringDao;
	}

	@Override
	public Monitoring findByid(int id) {
		// TODO Auto-generated method stub
		return monitoringDao.findByid(id);
	}

	@Override
	public List<Monitoring> findByOrders(String orderno) {
		// TODO Auto-generated method stub
		return monitoringDao.findByOrders(orderno);
	}

	@Override
	public List<Monitoring> findByPage(Monitoring monitoring, int first, int max) {
		// TODO Auto-generated method stub
		return monitoringDao.findByPage(monitoring, first, max);
	}

	@Override
	public Monitoring addOrUpdateMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		return monitoringDao.addOrUpdateMonitoring(monitoring);
	}

	@Override
	public void delMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		monitoringDao.delMonitoring(monitoring);
	}

	@Override
	public boolean addMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		try {
			monitoringDao.addMonitoring(monitoring);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Monitoring> findByPage(int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return monitoringDao.findByPage(firstResult, maxResults);
	}

}
