package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.HolidaysDao;
import cn.bdqn.j25.pojo.Holidays;
import cn.bdqn.j25.service.HolidaysService;

public class HolidaysServiceImpl implements HolidaysService {

	private HolidaysDao holidaysDao;
	
	public HolidaysDao getHolidaysDao() {
		return holidaysDao;
	}

	public void setHolidaysDao(HolidaysDao holidaysDao) {
		this.holidaysDao = holidaysDao;
	}

	@Override
	public Holidays findByid(int id) {
		// TODO Auto-generated method stub
		return holidaysDao.findByid(id);
	}

	@Override
	public List<Holidays> findByPage(Holidays holidays, int first, int max) {
		// TODO Auto-generated method stub
		return holidaysDao.findByPage(holidays, first, max);
	}

	@Override
	public Holidays addOrUpdateHolidays(Holidays holidays) {
		// TODO Auto-generated method stub
		return holidaysDao.addOrUpdateHolidays(holidays);
	}

	@Override
	public void delHolidays(Holidays holidays) {
		// TODO Auto-generated method stub
		holidaysDao.delHolidays(holidays);
	}

}
