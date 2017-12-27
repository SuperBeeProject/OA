package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Equipment;

public interface EquipmentService {

public Equipment findByid(int id);//根据ID查询	
	
	public List<Equipment> findByEquipmentname(String name);//根据名称查询
	
	public List<Equipment> findByPage(Equipment equipment,int first,int max);//分页展示全部
	 
	public Equipment addOrUpdateEquipment(Equipment equipment);//增加或更新信息
	
	public void delEquipment(Equipment equipment); //删除
}
