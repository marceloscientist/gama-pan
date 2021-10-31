package com.classes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.repository.IProdutoRepository;
import com.classes.model.Produtos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;

@RestController
@CrossOrigin("*")
public class Controller {
	
	@Autowired 
	private IProdutoRepository repository;

	@GetMapping("/produtos")
	public List<Produtos> buscarTodos() {
		return repository.findAll();
	}
	
	
}
