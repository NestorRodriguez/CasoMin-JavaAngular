package com.ministerio.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ministerio.post.dao.IUsuarioDao;
import com.ministerio.post.entities.Usuario;
import com.ministerio.post.servicesinterface.IUsuarioServices;

@Service
public class UsuarioServices implements IUsuarioServices {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Transactional(readOnly = true)
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Transactional(readOnly = false)
	public Usuario create(Usuario usuario) {
		System.out.println(usuario.getRol());
		return usuarioDao.save(usuario);
	}
}
