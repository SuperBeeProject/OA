package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Product;

public interface ProductService {
	public Product findByid(int id);//根据ID查询	
	
	public List<Product> findByProductname(String productname);//根据名字查询
	
	public List<Product> findByPage(Product product,int first,int max);//分页展示全部
	 
	public Product addOrUpdateProduct(Product product);//增加或更新信息
	
	public void delProduct(Product product); //删除
	
	public List<Product> findAll();
	
	public List<Product> findById(int id);
}
