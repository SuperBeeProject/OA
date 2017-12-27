package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ContactDao;
import cn.bdqn.j25.pojo.Contact;
import cn.bdqn.j25.pojo.Employee;
import cn.bdqn.j25.pojo.State;

public class ContactDaoImpl extends HibernateDaoSupport implements ContactDao {

	@Override
	public List<Contact> finaAll() {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CONTACT");
	}

	@Override
	public List<Contact> finaCantactById(String id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CONTACT where contactid=?",id);
	}

	@Override
	public List<Contact> finaCantecByRecipient(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CONTACT  where  employeeByRecipient.name=?",name);
	}

	@Override
	public List<Contact> finaantactBySender(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from CONTACT  where  employeeBySender.name=?",name);
	}

	@Override
	public Contact updateContact(Contact contact) {
		// TODO Auto-generated method stub
		 return this.getHibernateTemplate().merge(contact);
	}

}
