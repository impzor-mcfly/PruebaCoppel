package com.prueba.springbootbackendmongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.prueba.springbootbackendmongodb.model.Cuenta;

public interface CuentaRepository extends MongoRepository<Cuenta, Long>{

}
