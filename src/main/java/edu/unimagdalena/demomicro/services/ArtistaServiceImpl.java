package edu.unimagdalena.demomicro.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import edu.unimagdalena.demomicro.Data.ArtistaEntity;
import edu.unimagdalena.demomicro.repositories.ArtistaRepository;

@Service
public class ArtistaServiceImpl implements ArtistaService{

    private ArtistaRepository repository;
    
    public ArtistaServiceImpl(ArtistaRepository repository) {
        this.repository = repository;
    }

    @SuppressWarnings("null")
    @Override
    public ArtistaEntity crearArtista(ArtistaEntity artista) {
       return this.repository.save(artista);
    }

    @SuppressWarnings("null")
    @Override
    public void eliminarArtista(Integer id) {
        repository.deleteById(id);
    }

    @SuppressWarnings("null")
    @Override
    public Optional<ArtistaEntity> actualizarArtista(Integer id, ArtistaEntity artista) {
        return repository.findById(id).map(artistaInDB -> {
            // artistaInDB.setId(artista.getId());
            artistaInDB.setNacimiento(artista.getNacimiento());
            artistaInDB.setNombre(artista.getNombre());
            artistaInDB.setRetiro(artista.getRetiro());
            return repository.save(artistaInDB);
        });
    }

    @Override
    public List<ArtistaEntity> findAllArtistas() {
        return repository.findAll();
    }

    @SuppressWarnings("null")
    @Override
    public Optional<ArtistaEntity> findArtistaById(Integer id) {
        return repository.findById(id);
    }
    
}
