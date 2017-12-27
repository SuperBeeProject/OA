package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Warehouse;

public interface WarehouseDao {

	public Warehouse findByid(int id);//根据ID查询	
	
	public List<Warehouse> findByPage(Warehouse warehouse,int first,int max);//分页展示全部
	 
	public Warehouse addOrUpdateWarehouse(Warehouse warehouse);//增加或更新信息
	
	public void delWarehouse(Warehouse warehouse); //删除
	
}
