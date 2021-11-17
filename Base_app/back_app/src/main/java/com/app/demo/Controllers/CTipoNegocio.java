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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.Modelo.MTipoNegocio;
import com.app.demo.Services.STipoNegocio;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/tipo")
public class CTipoNegocio {
	
	@Autowired
	STipoNegocio serTip;
	
	@GetMapping
	public ArrayList<MTipoNegocio> obtener(){
		return serTip.obtenerTodos();
	}
	
	@PostMapping
	public MTipoNegocio crear(@RequestBody MTipoNegocio tipo) {
		return serTip.guardar(tipo);
	}
	
	@GetMapping (path="{id}")
	public Optional<MTipoNegocio> obtenerPorId(@PathVariable("id") Long id){
		return serTip.obtenerPorId(id);
	}
	
	@DeleteMapping(path="{id}")
	public String eliminar(@PathVariable("id") Long id) {
		boolean eliminado = serTip.eliminar(id);
		
		if(eliminado) return "Tipo Eliminado";
		else return "Error Eliminando Tipo";
	}
}
