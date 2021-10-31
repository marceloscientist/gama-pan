package com.classes.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.classes.model.Produtos;

public interface IProdutoRepository extends JpaRepository<Produtos, Long> {
	
}
