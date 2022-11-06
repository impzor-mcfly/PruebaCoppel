package com.prueba.springbootbackendapirest.dao;

import org.springframework.data.repository.CrudRepository;

import com.prueba.springbootbackendapirest.models.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{
	
}
