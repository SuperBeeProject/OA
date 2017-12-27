package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.ProductDao;
import cn.bdqn.j25.pojo.Product;
import cn.bdqn.j25.service.ProductService;

public class ProductServiceImpl implements ProductService {

	private ProductDao productDao;
	
	public ProductDao getProductDao() {
		return productDao;
	}

	public void setProductDao(ProductDao productDao) {
		this.productDao = productDao;
	}

	@Override
	public Product findByid(int id) {
		// TODO Auto-generated method stub
		return productDao.findByid(id);
	}

	@Override
	public List<Product> findByProductname(String productname) {
		// TODO Auto-generated method stub
		return productDao.findByProductname(productname);
	}

	@Override
	public List<Product> findByPage(Product product, int first, int max) {
		// TODO Auto-generated method stub
		return productDao.findByPage(product, first, max);
	}

	@Override
	public Product addOrUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		return productDao.addOrUpdateProduct(product);
	}

	@Override
	public void delProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.delProduct(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return productDao.findAll();
	}

	@Override
	public List<Product> findById(int id) {
		// TODO Auto-generated method stub
		return productDao.findById(id);
	}

}
