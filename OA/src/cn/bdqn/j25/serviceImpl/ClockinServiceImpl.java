package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ClockinDao;
import cn.bdqn.j25.pojo.Clockin;
import cn.bdqn.j25.service.ClockinService;

public class ClockinServiceImpl implements ClockinService {
 
   private	ClockinDao clockinDao;
	@Override
	public Clockin findByid(int id) {
		// TODO Auto-generated method stub
		return clockinDao.findByID(id);
	}

	public ClockinDao getClockinDao() {
		return clockinDao;
	}

	public void setClockinDao(ClockinDao clockinDao) {
		this.clockinDao = clockinDao;
	}

	@Override
	public List<Clockin> findAll(Clockin clockin) {
		// TODO Auto-generated method stub
		return clockinDao.findAll(clockin);
	}

	@Override
	public List<Clockin> findByPage(Clockin clockin, int first, int max) {
		// TODO Auto-generated method stub
		return clockinDao.findByPage(clockin, first, max);
	}

	@Override
	public Clockin addOrUpdateWages(Clockin clockin) {
		// TODO Auto-generated method stub
		return clockinDao.addOrUpdateClockin(clockin);
	}

	@Override
	public void delWages(Clockin clockin) {
		// TODO Auto-generated method stub
		clockinDao.delClockin(clockin);

	}

}
