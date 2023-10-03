package com.example.demo.controllers;

import com.example.demo.entities.Base;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable>{
    public ResponseEntity<? extends Object> getAll();
    public ResponseEntity<? extends Object> getOne(@PathVariable ID id);
    public ResponseEntity<? extends  Object> save(@RequestBody E entity);
    public ResponseEntity<? extends  Object> update(@PathVariable ID id, @RequestBody E entity);
    public  ResponseEntity<?> delete(@PathVariable ID id);
}
