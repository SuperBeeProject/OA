package cn.bdqn.j25.daoImpl;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.OrdersDao;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.State;

public class OrdersDaoImpl extends HibernateDaoSupport implements OrdersDao {

	@Override
	public Orders findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Orders.class, id);
	}

	@Override
	public List<Orders> findByOrderno(String orderno) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Orders where orderno =?", orderno);
	}

	@Override
	public void delOrders(Orders orders) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(orders);
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countByTime(final String date) {
		// TODO Auto-generated method stub
		
		String hql ="select count(*) from orders t where t.datetime = to_date('?','yyyy-mm-dd')";
		return this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {				
			Query query = session.createQuery("select count(1) from orders where datetime = to_date('?','yyyy-mm-dd')");
			return Integer.parseInt(query.setString(1, date).uniqueResult().toString());
			}
		});
	}

	@Override
	public void addOrders(Orders orders) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(orders);
	}

	@Override
	public List<Orders> findByPage(final int firstResult,final int maxResults){
		 return getHibernateTemplate().executeFind(new HibernateCallback(){   
			 public Object doInHibernate(Session  s)throws HibernateException,SQLException{  
				 Query query = s.createQuery("from Orders order by datetime desc");  
				 query.setFirstResult((firstResult-1)*maxResults);   
				 query.setMaxResults(maxResults);   
				 List list  = query.list();  
				 return list;     
				 }    
			 });     
	}

	@Override
	public void UpdateOrders(Orders orders) {
		// TODO Auto-generated method stub
		 getHibernateTemplate().update(orders);
	}


	@Override
	public List<Orders> findAllOrderByBusiness() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Orders o where o.state=2");
	}
	
	@Override
	public List<Orders> findAllOrderByProduct() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Orders o where o.state=3");
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Orders> findAllByPage(final int pageNo,final int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {				
			Query query = session.createQuery("from Orders");
			return query.setFirstResult(pageNo).setMaxResults(max).list();
			}
		});
	}

	@SuppressWarnings("unchecked")
	@Override
	public int countAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {				
			Query query = session.createQuery("select count(*) from Orders");
			return Integer.parseInt(query.uniqueResult().toString());
			}
		});

	}

	@Override
	public List<Orders> findAllOrderByFinance() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Orders o where o.state=4");
	}

	@Override
	public List<Orders> findAllOrderByState(State state) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Orders o where o.state=?",state);
	}

}
