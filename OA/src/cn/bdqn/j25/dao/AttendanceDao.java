package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Attendance;
import cn.bdqn.j25.pojo.Clockin;

public interface AttendanceDao {
	public Attendance findByID(int id);// 根据ID查询

	public List<Attendance> findAll(Attendance attendance);// 根据取值查询信息

	public List<Attendance> findByPage(Attendance attendance, int first, int max);// 分页展示全部

	public Attendance addOrUpdateAttendance(Attendance attendance);// 增加或更新信息

	public void delAttendance(Attendance attendance);// 删除
}
