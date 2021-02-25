package com.guilhermedaniel.cursomc.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.guilhermedaniel.cursomc.domain.Pedido;
import com.guilhermedaniel.cursomc.services.PedidoService;

@RestController
@RequestMapping(value = "/pedidos")
public class PedidoResource {

	@Autowired
	private PedidoService service;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	private ResponseEntity<Pedido> findById(@PathVariable Integer id) {
		Pedido pedido = service.findById(id);
		return ResponseEntity.ok().body(pedido);
	}
}