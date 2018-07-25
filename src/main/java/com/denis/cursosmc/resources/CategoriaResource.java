package com.denis.cursosmc.resources;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.denis.cursosmc.domain.Categoria;
import com.denis.cursosmc.services.CategoriaService;

import javassist.tools.rmi.ObjectNotFoundException;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

	@Autowired
	private CategoriaService service;
	

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) throws ObjectNotFoundException {

		Categoria obj = service.find(id);

		return ResponseEntity.ok().body(obj);
	}
	
	
	//Criacao Propria
	@RequestMapping(value = "/all",method = RequestMethod.GET)
	public ResponseEntity<?> findAll() throws ObjectNotFoundException {

	 List<Categoria> obj = service.findAll();
		
		return ResponseEntity.ok().body(obj);
	}
	
	
	

	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody Categoria obj) {
		obj = service.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();

	}
	@RequestMapping(value = "/{id}", method=RequestMethod.PUT)
	public ResponseEntity<Void> uptade(@PathVariable Integer id , 
			@RequestBody Categoria obj) throws ObjectNotFoundException {
		obj.setId(id);
		obj = service.update(obj);
		
		return ResponseEntity.noContent().build();
	}
	
	
	

}
