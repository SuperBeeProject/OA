package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.AttendanceDao;
import cn.bdqn.j25.pojo.Attendance;
import cn.bdqn.j25.pojo.Clockin;

public class AttendanceDaoImpl extends HibernateDaoSupport implements AttendanceDao {

	@Override
	public Attendance findByID(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Attendance.class, id);
	}

	@Override
	public List<Attendance> findAll(Attendance attendance) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(attendance);
	}

	@Override
	public List<Attendance> findByPage(Attendance attendance, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(attendance, first, max);
	}

	@Override
	public Attendance addOrUpdateAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(attendance);
	}

	@Override
	public void delAttendance(Attendance attendance) {
		// TODO Auto-generated method stub
           this.getHibernateTemplate().delete(attendance);
	}

}
