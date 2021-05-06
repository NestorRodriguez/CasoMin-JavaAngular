package com.ministerio.post.dao;

import org.springframework.data.repository.CrudRepository;

import com.ministerio.post.entities.Post;

public interface IPostDao extends CrudRepository<Post, Long>{

}
