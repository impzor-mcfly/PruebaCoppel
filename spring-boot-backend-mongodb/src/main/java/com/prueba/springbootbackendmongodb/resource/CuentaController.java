package com.prueba.springbootbackendmongodb.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.prueba.springbootbackendmongodb.model.Cuenta;
import com.prueba.springbootbackendmongodb.repository.CuentaRepository;

@RestController
public class CuentaController {

	@Autowired
	private CuentaRepository repository;
	
	@GetMapping("/cuentas")
	public List<Cuenta> getCuenta(){
		return repository.findAll();
	}
	
	@GetMapping("/cuentas/{id}")
	public Optional<Cuenta> getCuenta(@PathVariable Long id){
		return repository.findById(id);
	}

	@PostMapping("/cuentas")
	public String saveCuenta(@RequestBody Cuenta cuenta) {
		repository.save(cuenta);
		return "libro anadido";
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteCuenta(@PathVariable Long id) {
		repository.deleteById(id);
		return "libro borrado";
	}
}
