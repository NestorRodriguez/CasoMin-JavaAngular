package com.ministerio.post.servicesinterface;

import java.util.List;

import com.ministerio.post.entities.Post;

public interface IPostServices {

	public List<Post> findAll();

	public Post create(Post post);

}
