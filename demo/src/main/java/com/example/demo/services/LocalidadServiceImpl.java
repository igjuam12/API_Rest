package com.example.demo.services;

import com.example.demo.entities.Localidad;
import com.example.demo.repositories.BaseRepository;
import com.example.demo.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements  LocalidadService{

    @Autowired
    private LocalidadRepository localidadRepository;

    public LocalidadServiceImpl(BaseRepository baseRepository, LocalidadRepository localidadRepository) {
        super(baseRepository);
        this.localidadRepository = localidadRepository;
    }
}
