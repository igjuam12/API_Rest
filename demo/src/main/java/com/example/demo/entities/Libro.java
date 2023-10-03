package com.example.demo.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.envers.Audited;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Libro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Audited
public class Libro extends Base{
    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "genero")
    private  String genero;

    @Column(name = "paginas")
    private int paginas;

    @Column(name = "autor")
    private String autor;

    @ManyToMany(cascade = CascadeType.REFRESH)

    private List<Autor> autores;

}
