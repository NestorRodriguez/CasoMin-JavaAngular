package com.ministerio.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ministerio.post.dao.IPostDao;
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
		System.out.println(post.getId());
		return postDao.save(post);
	}

	

}
