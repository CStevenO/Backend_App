package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MCliente;
import com.app.demo.Repositories.RCliente;

@Service
public class SCliente {
	@Autowired
	RCliente repCliente;
	
	public MCliente guardar(MCliente cliente) {
		return repCliente.save(cliente);
	}
	
	public Optional<MCliente> obtenerPorId(Long id){
		return repCliente.findById(id);
	}
	
	public ArrayList<MCliente> obtenerTodos(){
		return (ArrayList<MCliente>) repCliente.findAll();
	}
	
	public boolean eliminar(Long id) {
		try {
			repCliente.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
