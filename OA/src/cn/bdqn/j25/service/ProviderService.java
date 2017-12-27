package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Provider;

public interface ProviderService {
	public Provider findByid(int id);//根据ID查询	
	
	public List<Provider> findByName(String name);//根据名字查询
	
	public List<Provider> findByPage(Provider provider,int first,int max);//分页展示全部
	 
	public Provider addOrUpdateProvider(Provider provider);//增加或更新信息
	
	public void delProvider(Provider provider); //删除
	
	public List<Provider> findAll();//查找全部供应商
	
	public boolean updateProvider(Provider provider);//更新供应商的信息
	
	public List<Provider> findByPage(int firstResult,int maxResults);//根据供应商名称拼音排序分页展示全部 
}
