package com.ministerio.post.servicesinterface;

import java.util.List;

import com.ministerio.post.entities.Usuario;

public interface IUsuarioServices {
	
	public List<Usuario> findAll();

	public Usuario create(Usuario usuario);
	
	public Usuario update(Usuario usuario, int id);
	
	public void delete(int id);
	
	public Usuario getUser(Usuario usuario);

}
