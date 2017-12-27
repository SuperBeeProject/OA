package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ContactDao;
import cn.bdqn.j25.pojo.Contact;
import cn.bdqn.j25.service.ContactService;

public class ContactServiceImpl implements ContactService {

	private ContactDao contactDao;
	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public List<Contact> finaAll() {
		// TODO Auto-generated method stub
		return contactDao.finaAll();
	}

	@Override
	public List<Contact> finaCantactById(String id) {
		// TODO Auto-generated method stub
		return contactDao.finaCantactById(id);
	}

	@Override
	public List<Contact> finaCantecByRecipient(String name) {
		// TODO Auto-generated method stub
		return contactDao.finaCantecByRecipient(name);
	}

	@Override
	public List<Contact> finaantactBySender(String name) {
		// TODO Auto-generated method stub
		return contactDao.finaantactBySender(name);
	}

	@Override
	public Contact updateContact(Contact contact) {
		return contactDao.updateContact(contact);
		// TODO Auto-generated method stub

	}

	@Override
	public Contact addContact(Contact contact) {
		return contactDao.updateContact(contact);
		// TODO Auto-generated method stub

	}

}
