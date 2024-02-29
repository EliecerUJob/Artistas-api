package edu.unimagdalena.demomicro.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="artistas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class ArtistaEntity {
    
    @Id @GeneratedValue(strategy = GenerationType.AUTO) @Column(name = "identificador")
    private Integer id;

    private String nombre;
    
    @Column(name = "año_de_lanzamiento")
    private Integer nacimiento;

    @Column(name = "año_de_retiro")
    private Integer retiro;
    
    private char tipo;
    
    @ManyToOne
    @JoinColumn(name = "género_identificador")
    private GeneroEntity genero;

}
