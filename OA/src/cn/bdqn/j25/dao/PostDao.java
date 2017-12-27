package cn.bdqn.j25.dao;

import java.util.List;

import cn.bdqn.j25.pojo.Post;

public interface PostDao {
	public Post findByid(int id);//根据ID查询
	
	public List<Post> findAll(Post post);//根据取值查询信息
	
	public List<Post> findByPage(Post post,int first,int max);//分页展示全部
	
	public Post addOrUpdatePost(Post post);//增加或更新信息
	
	public void delPost(Post post);//删除
}
