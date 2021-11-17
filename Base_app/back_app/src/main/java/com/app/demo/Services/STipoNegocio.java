package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MTipoNegocio;
import com.app.demo.Repositories.RTipoNegocio;

@Service
public class STipoNegocio {

	@Autowired
	RTipoNegocio repTi;
	
	public MTipoNegocio guardar(MTipoNegocio tipo) {
		return repTi.save(tipo);
	}
	
	public Optional<MTipoNegocio> obtenerPorId(Long id){
		return repTi.findById(id);
	}
	
	public ArrayList<MTipoNegocio> obtenerTodos(){
		return (ArrayList<MTipoNegocio>) repTi.findAll();
	}
	
	public boolean eliminar(Long id) {
		try {
			repTi.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
