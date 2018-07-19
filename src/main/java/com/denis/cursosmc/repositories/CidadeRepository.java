package com.denis.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denis.cursosmc.domain.Cidade;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer>  {

}
