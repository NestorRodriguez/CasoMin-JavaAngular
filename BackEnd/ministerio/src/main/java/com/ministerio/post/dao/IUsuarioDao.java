package com.ministerio.post.dao;

import org.springframework.data.repository.CrudRepository;

import com.ministerio.post.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

}
