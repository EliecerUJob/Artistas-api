package edu.unimagdalena.demomicro.services;

import java.util.List;
import java.util.Optional;

import edu.unimagdalena.demomicro.Data.ArtistaEntity;

public interface ArtistaService {
    
    ArtistaEntity crearArtista(ArtistaEntity artista);
    void eliminarArtista(Integer id);
    Optional<ArtistaEntity> actualizarArtista(Integer id, ArtistaEntity artista);

    List<ArtistaEntity> findAllArtistas();
    Optional<ArtistaEntity> findArtistaById(Integer id);

}
