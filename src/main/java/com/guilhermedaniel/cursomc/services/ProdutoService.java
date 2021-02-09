package com.guilhermedaniel.cursomc.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.guilhermedaniel.cursomc.domain.Produto;
import com.guilhermedaniel.cursomc.repositories.ProdutoRepository;

@Service
public class ProdutoService {

	@Autowired
	private ProdutoRepository repo;

	public Produto findById(Integer id) {
		Optional<Produto> obj = repo.findById(id);
		return obj.orElse(null);
	}

	public List<Produto> findAll() {
		List<Produto> obj = repo.findAll();
		return obj;
	}
}
