package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Accounts;

public interface AccountsDao {

	public Accounts findByid(int id);//根据ID查询账目
	
	public List<Accounts> findAll();//查询全部
	
	public List<Accounts> findByPeopleName(String name);//根据出入对象的名字查询
	
	public List<Accounts> findByOutOrIn(String out);//根据出或入来查询
	
	public List<Accounts> findByTime(String[] time,int first,int end);//根据时间范围查询分页
	
	public List<Accounts> findByPageTime(int first,int end);//根据时间降序分页展示全部
	 
	public Accounts addOrUpdateAccounts(Accounts accounts);//增加或更新账目信息
	
	public void delAccounts(Accounts accounts); //删除
}
