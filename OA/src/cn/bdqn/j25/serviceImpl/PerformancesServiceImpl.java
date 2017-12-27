package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.PerformancesDao;
import cn.bdqn.j25.pojo.Performances;
import cn.bdqn.j25.service.PerformancesService;

public class PerformancesServiceImpl implements PerformancesService {

	private PerformancesDao performancesDao;
	public PerformancesDao getPerformancesDao() {
		return performancesDao;
	}

	public void setPerformancesDao(PerformancesDao performancesDao) {
		this.performancesDao = performancesDao;
	}

	@Override
	public Performances findByid(int id) {
		// TODO Auto-generated method stub
		return performancesDao.findByid(id);
	}

	@Override
	public List<Performances> findByName(String name) {
		// TODO Auto-generated method stub
		return performancesDao.findByName(name);
	}

	@Override
	public List<Performances> findByPage(Performances performances, int first,
			int max) {
		// TODO Auto-generated method stub
		return performancesDao.findByPage(performances, first, max);
	}

	@Override
	public Performances addOrUpdatePerformances(Performances performances) {
		// TODO Auto-generated method stub
		return performancesDao.addOrUpdatePerformances(performances);
	}

	@Override
	public void delPerformances(Performances performances) {
		// TODO Auto-generated method stub
		performancesDao.delPerformances(performances);
	}

}
