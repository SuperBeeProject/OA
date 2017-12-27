package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.RestDao;
import cn.bdqn.j25.pojo.Rest;
import cn.bdqn.j25.service.RestService;

public class RestServiceImpl implements RestService {
	
	private RestDao restDao;
	
	public RestDao getRestDao() {
		return restDao;
	}

	public void setRestDao(RestDao restDao) {
		this.restDao = restDao;
	}

	@Override
	public Rest findByid(int id) {
		// TODO Auto-generated method stub
		return restDao.findByid(id);
	}

	@Override
	public List<Rest> findAll(Rest rest) {
		// TODO Auto-generated method stub
		return restDao.findAll(rest);
	}

	@Override
	public List<Rest> findByPage(Rest rest, int first, int max) {
		// TODO Auto-generated method stub
		return restDao.findByPage(rest, first, max);
	}

	@Override
	public Rest addOrUpdateRest(Rest rest) {
		// TODO Auto-generated method stub
		return restDao.addOrUpdateRest(rest);
	}

	@Override
	public void delRest(Rest rest) {
		// TODO Auto-generated method stub
		restDao.delRest(rest);
	}

}
