package com.crud.implementation;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import com.crud.implementation.model.Usuario;

@FeignClient(name = "app1", url = "http://localhost:5001/usuario")
public interface UsuarioAula1Feign {
	@GetMapping
	public ResponseEntity<List<Usuario>> getAll();
}
