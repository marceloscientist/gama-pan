package org.microsoft.outlook.controller;

import java.util.List;

import org.microsoft.outlook.model.Usuario;
import org.microsoft.outlook.repository.UsuarioRepository;
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
@RequestMapping("/usuarios")
@CrossOrigin("*")
public class UsuarioController {
       
        @Autowired
        private UsuarioRepository repository;
       
        @GetMapping("/listar")
        public ResponseEntity<List<Usuario>> GetAll() {
                return ResponseEntity.ok(repository.findAll());
        }
 
 
        @GetMapping("/listar/{id}")
        public ResponseEntity<Usuario> GetById(@PathVariable long id) {
                return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
        }
 
        @PostMapping("/criar")
        public ResponseEntity<Usuario> Post(@RequestBody Usuario usuario) {
                return ResponseEntity.ok(repository.save(usuario));
        }
        
        @PutMapping("/atualizar")
        public ResponseEntity<Usuario> put(@RequestBody Usuario usuario){
        	return ResponseEntity.status(HttpStatus.OK).body(repository.save(usuario));
        }


        @DeleteMapping("/deletar/{id}")
        public void delete(@PathVariable long id) {
        	repository.deleteById(id);
        }
}
