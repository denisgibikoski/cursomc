package com.denis.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denis.cursosmc.domain.Categoria;
import com.denis.cursosmc.domain.Cliente;
import com.denis.cursosmc.domain.Endereco;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>  {

}
