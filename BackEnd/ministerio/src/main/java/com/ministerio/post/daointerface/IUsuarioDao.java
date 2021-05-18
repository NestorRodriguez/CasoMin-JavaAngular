package com.ministerio.post.daointerface;

import org.springframework.data.repository.CrudRepository;

import com.ministerio.post.entities.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {
	
	public Usuario findUsuarioByUserName(String mail, String password);
	
	public Usuario findUsuarioByMail(String mail);
}
