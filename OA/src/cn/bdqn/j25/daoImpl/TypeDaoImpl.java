package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.TypeDao;
import cn.bdqn.j25.pojo.Types;

public class TypeDaoImpl extends HibernateDaoSupport implements TypeDao {

	@SuppressWarnings("unchecked")
	@Override
	public List<Types> findAll() {
		String hql = "from Types";
		return this.getHibernateTemplate().find(hql);

	}

	@Override
	public Types addOrUpdateType(Types types) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(types);
	}

	@Override
	public void delType(Types types) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(types);
		
	}

	@Override
	public Types findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Types.class, id);
	}
	
	
}
