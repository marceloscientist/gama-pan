package org.microsoft.outlook.controller;

import java.util.List;

import org.microsoft.outlook.model.Topico;
import org.microsoft.outlook.repository.TopicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/topicos")
@CrossOrigin("*")
public class TopicoController {
	 @Autowired
	    private TopicoRepository repository;
	   
	 	@GetMapping("/listar")
	    public ResponseEntity<List<Topico>> GetAll(){
	            return ResponseEntity.ok(repository.findAll());
	    }
	   
	 	@GetMapping("/listar/{id}")
	    public ResponseEntity<Topico> GetById(@PathVariable long id){
	            return repository.findById(id)
	                            .map(resp -> ResponseEntity.ok(resp))
	                            .orElse(ResponseEntity.notFound().build());            
	    }

	    @PostMapping("/criar")
	    public ResponseEntity<Topico> post (@RequestBody Topico topico){
	            return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(topico));
	    }
	    
	    @PutMapping("/atualizar")
	    public ResponseEntity<Topico> put(@RequestBody Topico topico){
	            return ResponseEntity.status(HttpStatus.OK).body(repository.save(topico));
	    }

	    
	    @DeleteMapping("/deletar/{id}")
	    public void delete(@PathVariable long id) {
	    	repository.deleteById(id);
	    }
}