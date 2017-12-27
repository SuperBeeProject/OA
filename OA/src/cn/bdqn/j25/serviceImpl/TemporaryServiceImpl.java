package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.pojo.Temporary;
import cn.bdqn.j25.service.TemporaryService;

public class TemporaryServiceImpl implements TemporaryService {
	  
	private TemporaryService temporaryDao;

	public TemporaryService getTemporaryDao() {
		return temporaryDao;
	}

	public void setTemporaryDao(TemporaryService temporaryDao) {
		this.temporaryDao = temporaryDao;
	}

	@Override
	public List<Temporary> finaByName(String name) {
		// TODO Auto-generated method stub
		return temporaryDao.finaByName(name);
	}

	@Override
	public List<Temporary> finaAll() {
		// TODO Auto-generated method stub
		return temporaryDao.finaAll();
	}
	
	@Override
	public Temporary addOrUpdetaTemporary(Temporary temporary) {
		// TODO Auto-generated method stub
		return temporaryDao.addOrUpdetaTemporary(temporary);
	}

	@Override
	public void delTemporary(Temporary temporary) {
		// TODO Auto-generated method stub
		temporaryDao.delTemporary(temporary);

	}

	@Override
	public Temporary finaMoneyByName(String name) {
		// TODO Auto-generated method stub
		return temporaryDao.finaMoneyByName(name);
	}

}
