package com.prueba.springbootbackendapirest.services;

import java.util.List;

import com.prueba.springbootbackendapirest.models.Usuario;

public interface IUsuarioService {
	
	public List<Usuario> findAll();
	
	public Usuario findById(Long id);
	
	public Usuario save(Usuario usuario);
	
	public void delete(Long id);
	
}
