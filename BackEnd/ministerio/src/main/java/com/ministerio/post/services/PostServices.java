package com.ministerio.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ministerio.post.daointerface.IPostDao;
import com.ministerio.post.entities.Post;
import com.ministerio.post.servicesinterface.IPostServices;

@Service
public class PostServices implements IPostServices{
	
	@Autowired
	private IPostDao postDao;

	@Transactional(readOnly = true)
	@Override
	public List<Post> findAll() {
		return (List<Post>) postDao.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public Post create(Post post) {
		return postDao.save(post);
	}
	
	@Override
	public Post update(Post post, int id) {
		return postDao.save(post);
	}

	public void delete(int id) {
		postDao.deleteById((long) id);
	}
	
	public List<Post> findPostByIdUsuario(int id) {
		return postDao.findPostByIdUsuario(id);
	}

	@Override
	public List<Post> findPostShared(boolean estado) {
		return postDao.findPostShared(estado);
	}

}
