package cn.bdqn.j25.daoImpl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import cn.bdqn.j25.dao.PostDao;
import cn.bdqn.j25.pojo.Post;

public class PostDaoImpl extends HibernateDaoSupport implements PostDao {

	@Override
	public Post findByid(int id) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().get(Post.class, id);
	}

	@Override
	public List<Post> findAll(Post post) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(post);
	}

	@Override
	public List<Post> findByPage(Post post, int first, int max) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().findByExample(post, first, max);
	}

	@Override
	public Post addOrUpdatePost(Post post) {
		// TODO Auto-generated method stub
		return getHibernateTemplate().merge(post);
	}

	@Override
	public void delPost(Post post) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(post);
	}

}
