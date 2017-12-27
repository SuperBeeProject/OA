package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.AttendanceDao;
import cn.bdqn.j25.pojo.Attendance;
import cn.bdqn.j25.service.AttendanceService;

public class AttendanceServiceImpl implements AttendanceService{
	
	 private AttendanceDao attendanDao;

	 
	public AttendanceDao getAttendanDao() {
		return attendanDao;
	}

	public void setAttendanDao(AttendanceDao attendanDao) {
		this.attendanDao = attendanDao;
	}

	@Override
	public Attendance findByID(int id) {
		// TODO Auto-generated method stub
		return attendanDao.findByID(id);
	}

	@Override
	public List<Attendance> findAll(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanDao.findAll(attendance);
	}

	@Override
	public List<Attendance> findByPage(Attendance attendance, int first, int max) {
		// TODO Auto-generated method stub
		return attendanDao.findByPage(attendance, first, max);
	}

	@Override
	public Attendance addOrUpdateClockin(Attendance attendance) {
		// TODO Auto-generated method stub
		return attendanDao.addOrUpdateAttendance(attendance);
	}

	@Override
	public void delAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		attendanDao.delAttendance(attendance);
	}
	
	

}
