package com.app.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

import com.app.demo.Modelo.MCliente;

public interface RCliente extends CrudRepository<MCliente,Long>{
	//TODO: Agregar la parte de login, ojala con spring security
}
