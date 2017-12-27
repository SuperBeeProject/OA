package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ProcurementDao;
import cn.bdqn.j25.pojo.Procurement;
import cn.bdqn.j25.service.ProcurementService;

public class ProcurementServiceImpl implements ProcurementService {

	private ProcurementDao procurementDao;
	
	public ProcurementDao getProcurementDao() {
		return procurementDao;
	}

	public void setProcurementDao(ProcurementDao procurementDao) {
		this.procurementDao = procurementDao;
	}

	@Override
	public Procurement findByid(int id) {
		// TODO Auto-generated method stub
		return procurementDao.findByid(id);
	}

	@Override
	public List<Procurement> findByNo(String no) {
		// TODO Auto-generated method stub
		return procurementDao.findByNo(no);
	}	

	@Override
	public Procurement addOrUpdateProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		return procurementDao.addOrUpdateProcurement(procurement);
	}

	@Override
	public void delProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		procurementDao.delProcurement(procurement);
	}

	@Override
	public boolean addProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		try {
			procurementDao.addProcurement(procurement);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Procurement> findByPage(int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return procurementDao.findByPage(firstResult, maxResults);
	}

	@Override
	public List<Procurement> findAllByPage(int pageNo, int max) {
		// TODO Auto-generated method stub
		return procurementDao.findAllByPage(pageNo, max);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return procurementDao.countAll();
	}

}
