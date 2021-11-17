package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.MNegocio;
import com.app.demo.Repositories.RNegocio;

@Service
public class SNegocio {
	@Autowired
	RNegocio repNegocio;
	
	//CREATE , UPDATE
	public MNegocio guardar(MNegocio negocio) {
		return repNegocio.save(negocio);
	}
	
	//GET
	public Optional<MNegocio> obtenerPorId(Long id){
		return repNegocio.findById(id);
	}
	
	//GET
	public ArrayList<MNegocio> obtenerTodos(){
		return (ArrayList<MNegocio>) repNegocio.findAll();
	}
	
	//DELETE
	public boolean eliminar(Long id) {
		try {
			repNegocio.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
