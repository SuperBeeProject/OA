
package cn.bdqn.j25.daoImpl;

import java.sql.SQLException;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.orm.hibernate3.HibernateCallback;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.CustomerDao;
import cn.bdqn.j25.pojo.Customer;

public class CustomerDaoImpl extends HibernateDaoSupport implements CustomerDao {

	@Override
	public Customer findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Customer.class, id);
	}

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("select new Customer(customerid,customername) from Customer");
	}

	@Override
	public List<Customer> findByCustomername(String customername) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Customer where customername =?", customername);
	}

	@Override
	public List<Customer> findByContacts(String contacts) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Customer where contacts =?", contacts);
	}

	@Override
	public List<Customer> findByPage(Customer customer,int first,int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(customer, first, max);
	}

	@Override
	public List<Customer> findByLevel(String level) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Customer where levels =?", level);
	}

	@Override
	public Customer addOrUpdateCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(customer);
	}

	@Override
	public void delCustomer(Customer customer) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(customer);
	}

	@Override
	public List<Customer> findByPage(final int firstResult,final int maxResults) {
		return getHibernateTemplate().executeFind(new HibernateCallback(){   
			 public Object doInHibernate(Session  s)throws HibernateException,SQLException{  
				 Query query = s.createQuery("from  Customer c order by nlssort(c.customername,'NLS_SORT=SCHINESE_PINYIN_M')");  
				 query.setFirstResult((firstResult-1)*maxResults);   
				 query.setMaxResults(maxResults);   
				 List list  = query.list();  
				 return list;     
				 }    
			 });     
	}

	@Override
	public void updateCustomer(Customer customer) {
		 getHibernateTemplate().update(customer);
		
	}

	@Override
	public void addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		getHibernateTemplate().save(customer);
	}

}
