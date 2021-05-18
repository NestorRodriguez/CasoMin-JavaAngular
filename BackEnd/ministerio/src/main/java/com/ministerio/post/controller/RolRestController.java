package com.ministerio.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ministerio.post.entities.Rol;
import com.ministerio.post.servicesinterface.IRolServices;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST})
public class RolRestController {
	
	@Autowired
	private IRolServices rolService;
	
	@GetMapping("/rol")
	public List<Rol> getAll (){
		return rolService.findAll();
	}
	
	@PostMapping("/rol")
	public Rol create(@RequestBody Rol rol){
		return rolService.create(rol);
	}
}
