package com.denis.cursosmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.denis.cursosmc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>  {

}
