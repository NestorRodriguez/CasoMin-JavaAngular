package com.ministerio.post.servicesinterface;

import java.util.List;

import com.ministerio.post.entities.Rol;

public interface IRolServices {

	public List<Rol> findAll();

	public Rol create(Rol rol);
}
