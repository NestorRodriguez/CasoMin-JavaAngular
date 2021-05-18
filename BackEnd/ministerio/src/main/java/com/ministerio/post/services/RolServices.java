package com.ministerio.post.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ministerio.post.daointerface.IRolDao;
import com.ministerio.post.entities.Rol;
import com.ministerio.post.servicesinterface.IRolServices;

@Service
public class RolServices implements  IRolServices{

	
	@Autowired
	private IRolDao rolDao;
		
	@Override
	public List<Rol> findAll() {
		return (List<Rol>) rolDao.findAll();
	}

	@Override
	public Rol create(Rol rol) {
		return rolDao.save(rol) ;
	}

}
