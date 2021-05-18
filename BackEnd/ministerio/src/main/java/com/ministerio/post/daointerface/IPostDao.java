package com.ministerio.post.daointerface;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ministerio.post.entities.Post;

public interface IPostDao extends CrudRepository<Post, Long>{
	
	public List<Post> findPostByIdUsuario(int id);
	
	public List<Post> findPostShared(boolean estado);
}
