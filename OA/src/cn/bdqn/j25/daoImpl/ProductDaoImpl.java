package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.ProductDao;
import cn.bdqn.j25.pojo.Product;

public class ProductDaoImpl extends HibernateDaoSupport implements ProductDao {

	@Override
	public Product findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Product.class, id);
	}

	@Override
	public List<Product> findByProductname(String productname) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Product where productname =?", productname);
	}

	@Override
	public List<Product> findByPage(Product product, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(product, first, max);
	}

	@Override
	public Product addOrUpdateProduct(Product product) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(product);
	}

	@Override
	public void delProduct(Product product) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(product);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("select new Product(productid,productname) from Product");
	}

	@Override
	public List<Product> findById(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().find("from Product where productid=?", id);
	}

	
}
