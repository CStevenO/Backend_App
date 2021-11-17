package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MProducto;
import com.app.demo.Repositories.RProducto;

@Service
public class SProducto {
	@Autowired
	RProducto repProducto;
	
	public MProducto guardar(MProducto producto) {
		return repProducto.save(producto);
	}
	
	public Optional<MProducto> obtenerPorId(Long id){
		return repProducto.findById(id);
	}
	
	public ArrayList<MProducto> obtenerTodos(){
		return (ArrayList<MProducto>) repProducto.findAll();
	}
	
	public boolean eliminar(Long id) {
		try {
			repProducto.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
}
