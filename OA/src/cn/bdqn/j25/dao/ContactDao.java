package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Contact;


public interface ContactDao {
	public List<Contact> finaAll();// 查询所有联络单

	public List<Contact> finaCantactById(String id);// 根据查询联络单

	public List<Contact> finaCantecByRecipient(String name);// 根据收件人联络单

	public List<Contact> finaantactBySender(String name);// 根据发件人联络单;

	public Contact updateContact(Contact contact);// 添加或更改联络单状态
}
