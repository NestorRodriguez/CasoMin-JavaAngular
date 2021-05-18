package com.ministerio.post.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.ministerio.post.entities.Rol;

public interface IRolDao extends CrudRepository<Rol, Long>{
	
}
