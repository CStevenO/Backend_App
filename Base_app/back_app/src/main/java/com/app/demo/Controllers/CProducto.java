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

import com.app.demo.Modelo.MProducto;
import com.app.demo.Services.SProducto;



@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/productos")
public class CProducto {

	@Autowired
	SProducto sevProducto;
	
	@GetMapping
	public ArrayList<MProducto> obtener(){
		return sevProducto.obtenerTodos();
	}
	
	@PostMapping
	public MProducto crear(@RequestBody MProducto producto) {
		return sevProducto.guardar(producto);
	}
	
	@GetMapping (path="{id}")
	public Optional<MProducto> obtenerPorId(@PathVariable("id") Long id){
		return sevProducto.obtenerPorId(id);
	}
	
	@DeleteMapping(path="{id}")
	public String eliminar(@PathVariable("id") Long id) {
		boolean eliminado = sevProducto.eliminar(id);
		
		if(eliminado) return "Producto Eliminado";
		else return "Error Eliminando Producto";
	}
}
