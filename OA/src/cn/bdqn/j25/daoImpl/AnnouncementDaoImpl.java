package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.AnnouncementDao;
import cn.bdqn.j25.pojo.Announcement;

public class AnnouncementDaoImpl extends HibernateDaoSupport implements AnnouncementDao {

	@Override
	public List<Announcement> findAll() {
		
		return this.getHibernateTemplate().find("from ANNOUNCEMENT where TYPEID= 1");
	}

	@Override
	public List<Announcement> findByDepartment(String departmentid) {
		
		return this.getHibernateTemplate().find("from ANNOUNCEMENT where DEPARTMENTID=?",departmentid);
	}

	@Override
	public Announcement addAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(announcement);
	}

	@Override
	public void delAnnouncement(String announcementid) {
		// TODO Auto-generated method stub
		 this.getHibernateTemplate().delete(announcementid);
	}

	@Override
	public List<Announcement> findByDepartmentid(String announcementid) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from ANNOUNCEMENT where announcementid=?",announcementid);
	}

	
	}

