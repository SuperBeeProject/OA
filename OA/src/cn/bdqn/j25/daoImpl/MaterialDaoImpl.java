package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.MaterialDao;
import cn.bdqn.j25.pojo.Material;

public class MaterialDaoImpl extends HibernateDaoSupport implements MaterialDao {

	@Override
	public Material findByid(int id) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().get(Material.class, id);
	}

	@Override
	public List<Material> findByName(String name) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().find("from Material where materialname =?", name);
	}

	@Override
	public List<Material> findByPage(Material material, int first, int max) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().findByExample(material, first, max);
	}

	@Override
	public Material addOrUpdateMaterial(Material material) {
		// TODO Auto-generated method stub
		return this.getHibernateTemplate().merge(material);
	}

	@Override
	public void delMaterial(Material material) {
		// TODO Auto-generated method stub
		this.getHibernateTemplate().delete(material);
	}

	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("select new Material(materialid,materialname) from Material");
	}

}
