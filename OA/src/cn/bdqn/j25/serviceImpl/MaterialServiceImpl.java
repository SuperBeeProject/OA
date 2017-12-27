package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.MaterialDao;
import cn.bdqn.j25.pojo.Material;
import cn.bdqn.j25.service.MaterialService;

public class MaterialServiceImpl implements MaterialService {

	private MaterialDao materialDao;
	
	public MaterialDao getMaterialDao() {
		return materialDao;
	}

	public void setMaterialDao(MaterialDao materialDao) {
		this.materialDao = materialDao;
	}

	@Override
	public Material findByid(int id) {
		// TODO Auto-generated method stub
		return materialDao.findByid(id);
	}

	@Override
	public List<Material> findByName(String name) {
		// TODO Auto-generated method stub
		return materialDao.findByName(name);
	}

	@Override
	public List<Material> findByPage(Material material, int first, int max) {
		// TODO Auto-generated method stub
		return materialDao.findByPage(material, first, max);
	}

	@Override
	public Material addOrUpdateMaterial(Material material) {
		// TODO Auto-generated method stub
		return materialDao.addOrUpdateMaterial(material);
	}

	@Override
	public void delMaterial(Material material) {
		// TODO Auto-generated method stub
		materialDao.delMaterial(material);
	}

	@Override
	public List<Material> findAll() {
		// TODO Auto-generated method stub
		return materialDao.findAll();
	}

}
