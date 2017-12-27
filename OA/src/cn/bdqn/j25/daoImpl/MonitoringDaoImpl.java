package cn.bdqn.j25.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.sun.istack.internal.FinalArrayList;

import cn.bdqn.j25.dao.MonitoringDao;
import cn.bdqn.j25.pojo.Monitoring;
import cn.bdqn.j25.pojo.Orders;

public class MonitoringDaoImpl extends HibernateDaoSupport implements
		MonitoringDao {

	@Override
	public Monitoring findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Monitoring.class, id);
	}

	@Override
	public List<Monitoring> findByOrders(String orderno) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Monitoring where orders.orderno=?", orderno);
	}

	@Override
	public List<Monitoring> findByPage(Monitoring monitoring, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(monitoring, first, max);
	}

	@Override
	public Monitoring addOrUpdateMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(monitoring);
	}

	@Override
	public void delMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(monitoring);
	}

	@Override
	public void addMonitoring(Monitoring monitoring) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(monitoring);
	}

	@Override
	public List<Monitoring> findByPage(final int firstResult,final int maxResults) {
		// TODO Auto-generated method stub
		 return getHibernateTemplate().executeFind(new HibernateCallback(){   
			 public Object doInHibernate(Session  s)throws HibernateException,SQLException{  
				 Query query = s.createQuery("from Monitoring m order by m.starttime desc");  
				 query.setFirstResult((firstResult-1)*maxResults);   
				 query.setMaxResults(maxResults);   
				 List list  = query.list();  
				 return list;     
				 }    
			 });     
	}

}
