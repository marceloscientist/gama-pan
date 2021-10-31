package com.crud.implementation;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {
	
	private static Map<String, Produto> produtoRepository = new HashMap<>();
	static {
		// mocka
		Produto choco = new Produto();
		choco.setId("1");
		choco.setNome("Choco");
		produtoRepository.put(choco.getId(), choco);
		
		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
	}
	
	@Override
	public void	createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
	}

	@Override
	public void deleteProduto(String id) {
		// TODO Auto-generated method stub
		produtoRepository.remove(id);		
	}

	@Override
	public Collection<Produto> getProdutos() {
		// TODO Auto-generated method stub
		return produtoRepository.values();
	}
}
