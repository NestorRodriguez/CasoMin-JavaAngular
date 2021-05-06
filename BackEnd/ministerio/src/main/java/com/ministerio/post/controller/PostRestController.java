package com.ministerio.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ministerio.post.entities.Post;
import com.ministerio.post.servicesinterface.IPostServices;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*", methods={RequestMethod.GET,RequestMethod.POST})
public class PostRestController {
	@Autowired
	private IPostServices postService;
	
	@GetMapping("/post")
	public List<Post> index(){
		return postService.findAll();
	}
	
	@PostMapping("/post")
	public Post create(@RequestBody Post usuario){
		return postService.create(usuario);
	}
}
