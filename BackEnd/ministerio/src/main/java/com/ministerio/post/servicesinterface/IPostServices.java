package com.ministerio.post.servicesinterface;

import java.util.List;

import com.ministerio.post.entities.Post;

public interface IPostServices {

	public List<Post> findAll();

	public Post create(Post post);
	
	public void delete(int id);
	
	public Post update(Post post, int id);

	public List<Post> findPostByIdUsuario(int id);
	
	public List<Post> findPostShared(boolean estado);
}
