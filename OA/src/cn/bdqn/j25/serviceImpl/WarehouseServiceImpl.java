package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.WarehouseDao;
import cn.bdqn.j25.pojo.Warehouse;
import cn.bdqn.j25.service.WarehouseService;

public class WarehouseServiceImpl implements WarehouseService {

	private WarehouseDao warehouseDao;
	
	public WarehouseDao getWarehouseDao() {
		return warehouseDao;
	}

	public void setWarehouseDao(WarehouseDao warehouseDao) {
		this.warehouseDao = warehouseDao;
	}

	@Override
	public Warehouse findByid(int id) {
		// TODO Auto-generated method stub
		return warehouseDao.findByid(id);
	}

	@Override
	public List<Warehouse> findByPage(Warehouse warehouse, int first, int max) {
		// TODO Auto-generated method stub
		return warehouseDao.findByPage(warehouse, first, max);
	}

	@Override
	public Warehouse addOrUpdateWarehouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		return warehouseDao.addOrUpdateWarehouse(warehouse);
	}

	@Override
	public void delWarehouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
			warehouseDao.delWarehouse(warehouse);
	
	}

}
