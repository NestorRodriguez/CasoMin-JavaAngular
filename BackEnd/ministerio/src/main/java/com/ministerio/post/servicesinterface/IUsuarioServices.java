package com.ministerio.post.servicesinterface;

import java.util.List;

import com.ministerio.post.entities.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();

	public Usuario create(Usuario usuario);

}
