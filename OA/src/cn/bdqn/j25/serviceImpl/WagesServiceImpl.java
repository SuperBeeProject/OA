package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.WagesDao;
import cn.bdqn.j25.pojo.Wages;
import cn.bdqn.j25.service.WagesService;

public class WagesServiceImpl implements WagesService {

	private WagesDao wagesDao;
	
	public WagesDao getWagesDao() {
		return wagesDao;
	}

	public void setWagesDao(WagesDao wagesDao) {
		this.wagesDao = wagesDao;
	}

	@Override
	public Wages findByid(int id) {
		// TODO Auto-generated method stub
		return wagesDao.findByid(id);
	}

	@Override
	public List<Wages> findAll(Wages wages) {
		// TODO Auto-generated method stub
		return wagesDao.findAll(wages);
	}

	@Override
	public List<Wages> findByPage(Wages wages, int first, int max) {
		// TODO Auto-generated method stub
		return wagesDao.findByPage(wages, first, max);
	}

	@Override
	public Wages addOrUpdateWages(Wages wages) {
		// TODO Auto-generated method stub
		return wagesDao.addOrUpdateWages(wages);
	}

	@Override
	public void delWages(Wages wages) {
		// TODO Auto-generated method stub
		wagesDao.delWages(wages);
	}

}
