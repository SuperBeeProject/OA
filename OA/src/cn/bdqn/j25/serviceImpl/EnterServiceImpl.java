package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.EnterDao;
import cn.bdqn.j25.pojo.Enter;
import cn.bdqn.j25.service.EnterService;

public class EnterServiceImpl implements EnterService {

	private EnterDao enterDao;
	
	public EnterDao getEnterDao() {
		return enterDao;
	}

	public void setEnterDao(EnterDao enterDao) {
		this.enterDao = enterDao;
	}

	@Override
	public Enter findByid(int id) {
		// TODO Auto-generated method stub
		return enterDao.findByid(id);
	}

	@Override
	public List<Enter> findByPage(Enter enter, int first, int max) {
		// TODO Auto-generated method stub
		return enterDao.findByPage(enter, first, max);
	}

	@Override
	public Enter addOrUpdateOut(Enter enter) {
		// TODO Auto-generated method stub
		return enterDao.addOrUpdateOut(enter);
	}

	@Override
	public void delEnter(Enter enter) {
		// TODO Auto-generated method stub
		enterDao.delEnter(enter);
	}

}
