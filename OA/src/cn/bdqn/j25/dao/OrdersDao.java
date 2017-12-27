package cn.bdqn.j25.dao;


import java.util.List;

import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.State;

public interface OrdersDao {
	public Orders findByid(int id);//根据ID查询	
	
	public List<Orders> findByOrderno(String orderno);//根据编号查询
	
	public List<Orders> findByPage(int firstResult,int maxResults);//根据时间降序分页展示全部
	 	
	public void delOrders(Orders orders); //删除
	
	public int countByTime(String date);//根据传入的时间统计订单量
	
	public void addOrders(Orders orders);//添加
	
	public void UpdateOrders(Orders orders);//更新信息
	
	public List<Orders> findAllOrderByBusiness();//查询所有业务审核过的订单

	public List<Orders> findAllByPage(int pageNo,int max);//分页展示全部
	
	public int countAll();//统计所有订单数量

	public List<Orders> findAllOrderByProduct();//查询所有生产审核的订单
	
	public List<Orders> findAllOrderByFinance();//查询财务审核的订单
	
	public List<Orders> findAllOrderByState(State state);//根据订单状态查询
}
