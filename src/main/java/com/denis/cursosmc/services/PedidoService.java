package com.denis.cursosmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.denis.cursosmc.domain.Pedido;
import com.denis.cursosmc.repositories.PedidoRepository;

import javassist.tools.rmi.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private  PedidoRepository repo;
	
	public Pedido buscar(Integer id) throws ObjectNotFoundException {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não Encontrado! Id:"+id+", Tipo: "+Pedido.class.getName()));
	}
	
}
