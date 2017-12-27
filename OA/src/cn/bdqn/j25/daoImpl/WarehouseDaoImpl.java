package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.WarehouseDao;
import cn.bdqn.j25.pojo.Out;
import cn.bdqn.j25.pojo.Warehouse;

public class WarehouseDaoImpl extends HibernateDaoSupport implements WarehouseDao {

	@Override
	public Warehouse findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Warehouse.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Warehouse> findByPage(Warehouse warehouse, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(warehouse, first, max);
	}

	@Override
	public Warehouse addOrUpdateWarehouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(warehouse);
	}

	@Override
	public void delWarehouse(Warehouse warehouse) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(warehouse);
	}

}
