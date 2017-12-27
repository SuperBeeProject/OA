package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.HolidaysDao;
import cn.bdqn.j25.pojo.Holidays;

public class HolidaysDaoImpl extends HibernateDaoSupport implements HolidaysDao {

	@Override
	public Holidays findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Holidays.class, id);
	}

	@Override
	public List<Holidays> findByPage(Holidays holidays, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(holidays, first, max);
	}

	@Override
	public Holidays addOrUpdateHolidays(Holidays holidays) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(holidays);
	}

	@Override
	public void delHolidays(Holidays holidays) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(holidays);
	}

}
