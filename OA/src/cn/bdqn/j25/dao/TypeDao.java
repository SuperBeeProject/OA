package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Types;

public interface TypeDao {

	public Types findByid(int id);//根据id查询
	
	public List<Types> findAll(); //查询全部Types类信息
	
	public  Types addOrUpdateType(Types types); //增加或更新类型
	
	public void delType(Types types); //增加类型
	
}
