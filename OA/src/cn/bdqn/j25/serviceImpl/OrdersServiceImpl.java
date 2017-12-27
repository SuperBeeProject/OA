package cn.bdqn.j25.serviceImpl;

import java.util.Date;
import java.util.List;

import cn.bdqn.j25.dao.OrdersDao;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.State;
import cn.bdqn.j25.service.OrdersService;

public class OrdersServiceImpl implements OrdersService {

	private OrdersDao ordersDao;
	public OrdersDao getOrdersDao() {
		return ordersDao;
	}

	public void setOrdersDao(OrdersDao ordersDao) {
		this.ordersDao = ordersDao;
	}

	@Override
	public Orders findByid(int id) {
		// TODO Auto-generated method stub
		return ordersDao.findByid(id);
	}

	@Override
	public List<Orders> findByOrderno(String orderno) {
		// TODO Auto-generated method stub
		return ordersDao.findByOrderno(orderno);
	}

	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		ordersDao.delOrders(orders);
	}

	@Override
	public int countByTime(String date) {
		// TODO Auto-generated method stub	
		
		return ordersDao.countByTime(date);
	}

	@Override
	public boolean addOrders(Orders orders) {
		// TODO Auto-generated method stub
		try {
			ordersDao.addOrders(orders);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Orders> findByPage(int firstResult, int maxResults) {
		// TODO Auto-generated method stub
		return ordersDao.findByPage(firstResult, maxResults);
	}

	@Override
	public boolean UpdateOrders(Orders orders){
		// TODO Auto-generated method stub
		try {
			ordersDao.UpdateOrders(orders);
			return true;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public List<Orders> findAllOrderByBusiness() {
		// TODO Auto-generated method stub
		return ordersDao.findAllOrderByBusiness();
	}
	
	public List<Orders> findAllByPage(int pageNo, int max) {
		// TODO Auto-generated method stub
		return ordersDao.findAllByPage(pageNo, max);
	}

	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return ordersDao.countAll();

	}

	@Override
	public List<Orders> findAllOrderByProduct() {
		// TODO Auto-generated method stub
		return ordersDao.findAllOrderByProduct();
	}

	@Override
	public List<Orders> findAllOrderByFinance() {
		// TODO Auto-generated method stub
		return ordersDao.findAllOrderByFinance();
	}

	@Override
	public List<Orders> findAllOrderByState(State state) {
		// TODO Auto-generated method stub
		return ordersDao.findAllOrderByState(state);
	}

	

}
