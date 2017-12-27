package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.OutDao;
import cn.bdqn.j25.pojo.Out;
import cn.bdqn.j25.service.OutService;

public class OutServiceImpl implements OutService {

	private OutDao outDao;
	
	public OutDao getOutDao() {
		return outDao;
	}

	public void setOutDao(OutDao outDao) {
		this.outDao = outDao;
	}

	@Override
	public Out findByid(int id) {
		// TODO Auto-generated method stub
		return outDao.findByid(id);
	}

	@Override
	public List<Out> findByPage(Out out, int first, int max) {
		// TODO Auto-generated method stub
		return outDao.findByPage(out, first, max);
	}

	@Override
	public Out addOrUpdateOut(Out out) {
		// TODO Auto-generated method stub
		return outDao.addOrUpdateOut(out);
	}

	@Override
	public void delOut(Out out) {
		// TODO Auto-generated method stub
		outDao.delOut(out);
	}

}
