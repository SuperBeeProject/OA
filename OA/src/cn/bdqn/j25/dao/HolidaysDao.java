package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Holidays;

public interface HolidaysDao {
	public Holidays findByid(int id);//根据ID查询	
	
	public List<Holidays> findByPage(Holidays holidays,int first,int max);//分页展示全部
	 
	public Holidays addOrUpdateHolidays(Holidays holidays);//增加或更新信息
	
	public void delHolidays(Holidays holidays); //删除
}
