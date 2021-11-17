package com.app.demo.Services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.demo.Modelo.ProductoNegocio;
import com.app.demo.Repositories.RProductoNegocio;

@Service
public class SProductoNegocio {

	@Autowired
	RProductoNegocio repProNeg;
	
	public ProductoNegocio guardar(ProductoNegocio proneg) {
		return repProNeg.save(proneg);
	}
	
	public ArrayList<ProductoNegocio> obtenerTodos(){
		return (ArrayList<ProductoNegocio>) repProNeg.findAll();
	}
	
	public Optional<ProductoNegocio> obtener(Long id){
		return repProNeg.findById(id);
	}
	
	public boolean eliminar(Long id) {
		try {
			repProNeg.deleteById(id);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
			return false;
		}
	}
}
