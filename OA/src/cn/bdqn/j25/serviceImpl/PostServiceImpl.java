package cn.bdqn.j25.serviceImpl;

import java.util.List;

import cn.bdqn.j25.dao.PostDao;
import cn.bdqn.j25.pojo.Post;
import cn.bdqn.j25.service.PostService;

public class PostServiceImpl implements PostService {

	private PostDao postDao;
	
	public PostDao getPostDao() {
		return postDao;
	}

	public void setPostDao(PostDao postDao) {
		this.postDao = postDao;
	}

	@Override
	public Post findByid(int id) {
		// TODO Auto-generated method stub
		return postDao.findByid(id);
	}

	@Override
	public List<Post> findAll(Post post) {
		// TODO Auto-generated method stub
		return postDao.findAll(post);
	}

	@Override
	public List<Post> findByPage(Post post, int first, int max) {
		// TODO Auto-generated method stub
		return postDao.findByPage(post, first, max);
	}

	@Override
	public Post addOrUpdatePost(Post post) {
		// TODO Auto-generated method stub
		return postDao.addOrUpdatePost(post);
	}

	@Override
	public void delPost(Post post) {
		// TODO Auto-generated method stub
		postDao.delPost(post);
	}

}
