package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.OrderrootsDao;
import cn.bdqn.j25.pojo.Orderroots;
import cn.bdqn.j25.service.OrderrootsService;

public class OrderrootsServiceImpl implements OrderrootsService {

	private OrderrootsDao orderrootsDao;
	
	public OrderrootsDao getOrderrootsDao() {
		return orderrootsDao;
	}

	public void setOrderrootsDao(OrderrootsDao orderrootsDao) {
		this.orderrootsDao = orderrootsDao;
	}

	@Override
	public Orderroots findByid(int id) {
		// TODO Auto-generated method stub
		return orderrootsDao.findByid(id);
	}

	@Override
	public List<Orderroots> findAll(Orderroots orderroots) {
		// TODO Auto-generated method stub
		return orderrootsDao.findAll(orderroots);
	}

	@Override
	public List<Orderroots> findByPage(Orderroots orderroots, int first, int max) {
		// TODO Auto-generated method stub
		return orderrootsDao.findByPage(orderroots, first, max);
	}

	@Override
	public Orderroots addOrUpdateOrderroots(Orderroots orderroots) {
		// TODO Auto-generated method stub
		return orderrootsDao.addOrUpdateOrderroots(orderroots);
	}

	@Override
	public void delOrderroots(Orderroots orderroots) {
		// TODO Auto-generated method stub
		orderrootsDao.delOrderroots(orderroots);
	}

}
