package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ProorderDao;
import cn.bdqn.j25.pojo.Proorder;
import cn.bdqn.j25.service.ProorderService;

public class ProorderServiceImpl implements ProorderService {

	private ProorderDao proorderDao;
	
	public ProorderDao getProorderDao() {
		return proorderDao;
	}

	public void setProorderDao(ProorderDao proorderDao) {
		this.proorderDao = proorderDao;
	}

	@Override
	public Proorder findByid(int id) {
		// TODO Auto-generated method stub
		return proorderDao.findByid(id);
	}

	@Override
	public List<Proorder> findByOrderNo(String orderno) {
		// TODO Auto-generated method stub
		return proorderDao.findByOrderNo(orderno);
	}

	@Override
	public List<Proorder> findByPage(Proorder proorder, int first, int max) {
		// TODO Auto-generated method stub
		return proorderDao.findByPage(proorder, first, max);
	}

	@Override
	public Proorder addOrUpdateProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		return proorderDao.addOrUpdateProorder(proorder);
	}

	@Override
	public boolean delProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		try {
			proorderDao.delProorder(proorder);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean addProorder(Proorder proorder) {
		// TODO Auto-generated method stub
		try {
			proorderDao.addProorder(proorder);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		
	}

	@Override
	public List<Proorder> findAllProorder() {
		// TODO Auto-generated method stub
		return proorderDao.findAllProorder();
	}

}
