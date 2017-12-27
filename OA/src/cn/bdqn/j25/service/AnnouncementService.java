package cn.bdqn.j25.service;

import java.util.List;

import cn.bdqn.j25.pojo.Announcement;

public interface AnnouncementService {
	public List<Announcement> findAll();// 获得所有公开公告

	public List<Announcement> findByDepartment(String departmentid);// 获得该部门私密公告

	public Announcement addAnnouncement(Announcement announcement); // 添加公告

	public void delAnnouncement(String announcementid);// 删除公告

	
}
