package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MVentas;
import com.app.demo.Repositories.RVentas;

@Service
public class SVentas {

	@Autowired
	RVentas repVentas;
	
	public MVentas guardar(MVentas venta) {
		return repVentas.save(venta);
	}
	
	public Optional<MVentas> obtenerPorId(Long id){
		return repVentas.findById(id);
	}
	
	public ArrayList<MVentas> obtenerTodos(){
		return (ArrayList<MVentas>) repVentas.findAll();
	}
	
	public boolean eliminar(Long id) {
		try {
			repVentas.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
