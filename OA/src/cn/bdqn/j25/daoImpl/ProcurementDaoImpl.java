package cn.bdqn.j25.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ProcurementDao;
import cn.bdqn.j25.pojo.Orders;
import cn.bdqn.j25.pojo.Procurement;

public class ProcurementDaoImpl extends HibernateDaoSupport implements
		ProcurementDao {

	@Override
	public Procurement findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Procurement.class, id);
	}

	@Override
	public List<Procurement> findByNo(String no) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Procurement where ", no);
	}

	@Override
	public List<Procurement> findByPage(final int firstResult,final int maxResults){
		 return getHibernateTemplate().executeFind(new HibernateCallback(){   
			 public Object doInHibernate(Session  s)throws HibernateException,SQLException{  
				 Query query = s.createQuery("from Procurement order by datetime desc");  
				 query.setFirstResult((firstResult-1)*maxResults);   
				 query.setMaxResults(maxResults);   
				 List list  = query.list();  
				 return list;     
				 }    
			 });     
	}

	@Override
	public Procurement addOrUpdateProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(procurement);
	}

	@Override
	public void delProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(procurement);
	}

	@Override
	public void addProcurement(Procurement procurement) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(procurement);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Procurement> findAllByPage(final int pageNo, final int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().execute(new HibernateCallback(){
			public Object doInHibernate(Session session) throws HibernateException, SQLException {				
			Query query = session.createQuery("from Procurement p where p.state.statename='待审核'");
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
			Query query = session.createQuery("select count(*) from Procurement");
			return Integer.parseInt(query.uniqueResult().toString());
			}
		});
	}
}
