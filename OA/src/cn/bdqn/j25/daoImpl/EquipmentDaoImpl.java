package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.EquipmentDao;
import cn.bdqn.j25.pojo.Equipment;

public class EquipmentDaoImpl extends HibernateDaoSupport implements
		EquipmentDao {

	@Override
	public Equipment findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Equipment.class, id);
	}

	@Override
	public List<Equipment> findByEquipmentname(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Equipment where equipmentname =?", name);
	}

	@Override
	public List<Equipment> findByPage(Equipment equipment,int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(equipment, first, max);
	}

	@Override
	public Equipment addOrUpdateEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(equipment);
	}

	@Override
	public void delEquipment(Equipment equipment) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(equipment);
	}

}
