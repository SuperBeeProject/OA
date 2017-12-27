package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.EquipmentDao;
import cn.bdqn.j25.pojo.Equipment;
import cn.bdqn.j25.service.EquipmentService;

public class EquipmentServiceImpl implements EquipmentService{

	private EquipmentDao equipmentDao;
	
	public EquipmentDao getEquipmentDao() {
		return equipmentDao;
	}

	public void setEquipmentDao(EquipmentDao equipmentDao) {
		this.equipmentDao = equipmentDao;
	}

	@Override
	public Equipment findByid(int id) {
		// TODO Auto-generated method stub
		return equipmentDao.findByid(id);
	}

	@Override
	public List<Equipment> findByEquipmentname(String name) {
		// TODO Auto-generated method stub
		return equipmentDao.findByEquipmentname(name);
	}

	@Override
	public List<Equipment> findByPage(Equipment equipment, int first, int max) {
		// TODO Auto-generated method stub
		return equipmentDao.findByPage(equipment, first, max);
	}

	@Override
	public Equipment addOrUpdateEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		return equipmentDao.addOrUpdateEquipment(equipment);
	}

	@Override
	public void delEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		equipmentDao.delEquipment(equipment);
	}

}
