package com.app.demo.Services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MDetalle_Ventas;
import com.app.demo.Repositories.RDetalle_Ventas;

@Service
public class SDetalle_Ventas {

	@Autowired
	RDetalle_Ventas repDetalle;
	
	public MDetalle_Ventas guardar(MDetalle_Ventas detalle) {
		return repDetalle.save(detalle);
	}
	
	public boolean guardarTodos(List<MDetalle_Ventas> detalles) {
		try {
			repDetalle.saveAll(detalles);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
	
	public Optional<MDetalle_Ventas> obtenerPorId(Long id){
		return repDetalle.findById(id);
	}
	
	public ArrayList<MDetalle_Ventas> obtenerTodos(){
		return (ArrayList<MDetalle_Ventas>) repDetalle.findAll();
	}
	
	
	public boolean eliminar(Long id) {
		try {
			repDetalle.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
