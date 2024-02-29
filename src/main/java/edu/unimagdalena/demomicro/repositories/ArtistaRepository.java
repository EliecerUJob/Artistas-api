package edu.unimagdalena.demomicro.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.unimagdalena.demomicro.Data.ArtistaEntity;

public interface ArtistaRepository extends JpaRepository<ArtistaEntity, Integer>{

    List<ArtistaEntity> findByIdAndNombre(Integer id, String nombre);
    
} 
