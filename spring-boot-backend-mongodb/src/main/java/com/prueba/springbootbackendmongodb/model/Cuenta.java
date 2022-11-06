package com.prueba.springbootbackendmongodb.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Cuenta")
public class Cuenta {
	
	@Id
	private Long id;
	private String nombreDeLaCuenta;
	private String banco;
	private String tipo;
	private Double monto;
	private Long idUsuario;

}
