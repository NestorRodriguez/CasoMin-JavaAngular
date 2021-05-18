package com.ministerio.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ministerio.post.daointerface.IUsuarioDao;
import com.ministerio.post.entities.Usuario;
import com.ministerio.post.servicesinterface.IUsuarioServices;

@Service
public class UsuarioServices implements IUsuarioServices {

	@Autowired
	private IUsuarioDao usuarioDao;

	@Transactional(readOnly = true)
	@Override
	public List<Usuario> findAll() {
		return (List<Usuario>) usuarioDao.findAll();
	}

	@Transactional(readOnly = false)
	@Override
	public Usuario create(Usuario usuario) {
		Usuario user = usuarioDao.findUsuarioByMail(usuario.getMail());
		if(user == null)
			user = usuarioDao.save(usuario);
		else
			user = new Usuario();
		return user;
	}

	@Override
	public Usuario getUser(Usuario usuario) {
		return usuarioDao.findUsuarioByUserName(usuario.getMail(), usuario.getPassword());
	}

	@Override
	public Usuario update(Usuario usuario, int id) {
		return usuarioDao.save(usuario);
	}

	@Override
	public void delete(int id) {
		usuarioDao.deleteById((long) id);
	}

}
