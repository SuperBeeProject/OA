package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Material;

public interface MaterialDao {
	public Material findByid(int id);//根据ID查询	
	
	public List<Material> findByName(String name);//根据名称查询
	
	public List<Material> findByPage(Material material,int first,int max);//分页展示全部
	 
	public Material addOrUpdateMaterial(Material material);//增加或更新信息
	
	public void delMaterial(Material material); //删除
	
	public List<Material> findAll();//查找全部原料
}
