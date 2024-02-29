package edu.unimagdalena.demomicro.controllers;

import org.springframework.web.bind.annotation.RestController;

import edu.unimagdalena.demomicro.Data.ArtistaEntity;
import edu.unimagdalena.demomicro.services.ArtistaServiceImpl;

import java.util.*;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/artistas")
public class ArtistaController {

    private ArtistaServiceImpl service;
    
    public ArtistaController(ArtistaServiceImpl service) {
        this.service = service;
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<ArtistaEntity>> getArtistas() {
        return new ResponseEntity<List<ArtistaEntity>>(service.findAllArtistas(), HttpStatus.OK);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Optional<ArtistaEntity>> getArtista(@PathVariable("id") Integer id){
        return new ResponseEntity<Optional<ArtistaEntity>>(service.findArtistaById(id), HttpStatus.OK);
    }

    @PostMapping("/post")
    public ResponseEntity<ArtistaEntity> postArtista(@RequestBody ArtistaEntity entity) {
        service.crearArtista(entity);
        return new ResponseEntity<ArtistaEntity>(HttpStatus.CREATED);
    }
    
    @PutMapping("/put/{id}")
    public ResponseEntity<Optional<ArtistaEntity>> putArtista(@PathVariable("id") Integer id, @RequestBody ArtistaEntity entity) {    
        service.actualizarArtista(id, entity);    
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<ArtistaEntity> deleteArtista(@PathVariable("id") Integer id){
        service.eliminarArtista(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
