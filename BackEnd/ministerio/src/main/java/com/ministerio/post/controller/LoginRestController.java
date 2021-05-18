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

import com.ministerio.post.entities.Usuario;
import com.ministerio.post.servicesinterface.IUsuarioServices;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST })
public class LoginRestController {

	@Autowired
	private IUsuarioServices usuarioService;

	@GetMapping("/login")
	public List<Usuario> login(){
		return usuarioService.findAll();
	}
	
	@PostMapping("/login")
	public Usuario create(@RequestBody Usuario usuario) {
		return usuarioService.getUser(usuario);
	}
}
