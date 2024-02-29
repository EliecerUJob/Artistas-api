package edu.unimagdalena.demomicro.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "géneros")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GeneroEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "identificador")
    private Integer id;

    private String nombre;

    // @OneToMany(mappedBy = "genero")
    // private List<ArtistaEntity> artista;

}
