package com.app.demo.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.demo.Modelo.MNegocio;
import com.app.demo.Services.SNegocio;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/negocios")
public class CNegocio {
	
	@Autowired
	SNegocio sevNegocio;
	
	@GetMapping
	public ArrayList<MNegocio> obtener(){
		return sevNegocio.obtenerTodos();
	}
	
	@PostMapping
	public MNegocio crear(@RequestBody MNegocio negocio) {
		return sevNegocio.guardar(negocio);
	}
	
	@GetMapping (path="{id}")
	public Optional<MNegocio> obtenerPorId(@PathVariable("id") Long id){
		return sevNegocio.obtenerPorId(id);
	}
	
	@DeleteMapping(path="{id}")
	public String eliminar(@PathVariable("id") Long id) {
		boolean eliminado = sevNegocio.eliminar(id);
		
		if(eliminado) return "Negocio Eliminado";
		else return "Error Eliminando Negocio";
	}
}
