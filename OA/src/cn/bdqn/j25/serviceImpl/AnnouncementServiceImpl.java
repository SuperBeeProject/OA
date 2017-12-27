package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.AnnouncementDao;
import cn.bdqn.j25.pojo.Announcement;
import cn.bdqn.j25.service.AnnouncementService;

public class AnnouncementServiceImpl implements AnnouncementService {

	private AnnouncementDao annoucementDao;

	public AnnouncementDao getAnnoucementDao() {
		return annoucementDao;
	}

	public void setAnnoucementDao(AnnouncementDao annoucementDao) {
		this.annoucementDao = annoucementDao;
	}

	@Override
	public List<Announcement> findAll() {
		// TODO Auto-generated method stub
		return annoucementDao.findAll();
	}

	@Override
	public List<Announcement> findByDepartment(String departmentid) {
		// TODO Auto-generated method stub
		return annoucementDao.findByDepartment(departmentid);
	}

	@Override
	public Announcement addAnnouncement(Announcement announcement) {
		// TODO Auto-generated method stub
		return annoucementDao.addAnnouncement(announcement);
	}

	@Override
	public void delAnnouncement(String announcementid) {
		annoucementDao.delAnnouncement(announcementid);
	}


}
