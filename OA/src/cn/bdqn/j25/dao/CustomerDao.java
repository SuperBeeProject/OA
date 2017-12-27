package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Customer;

public interface CustomerDao {

	public Customer findByid(int id);//根据id查询
	
	public List<Customer> findAll();//查询全部
	
	public List<Customer> findByCustomername(String customername);//根据客户名字查询
	
	public List<Customer> findByContacts(String contacts);//根据联系人查询
	
	public List<Customer> findByPage(Customer customer,int first,int max);//分页展示全部
	
	public List<Customer> findByLevel(String level);//根据级别查询
	
	public Customer addOrUpdateCustomer(Customer customer);//增加或更新客户信息
	
	public void delCustomer(Customer customer); //删除
	
	public List<Customer> findByPage(int firstResult,int maxResults);//根据客户名称拼音排序分页展示全部 
	
	public void updateCustomer(Customer customer);//更新客户的信息
	
	public void addCustomer(Customer customer); //添加
}
