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

import com.app.demo.Modelo.MProductoNegocio;
import com.app.demo.Services.SProductoNegocio;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("/productoNegocio")
public class CProductoNegocio {

	@Autowired
	SProductoNegocio serProNeg;
	
	@GetMapping
	public ArrayList<MProductoNegocio> obtener(){
		return serProNeg.obtenerTodos();
	}
	
	@PostMapping
	public MProductoNegocio crear(@RequestBody MProductoNegocio producto) {
		return serProNeg.guardar(producto);
	}
	
	@GetMapping (path="{id}")
	public Optional<MProductoNegocio> obtenerPorId(@PathVariable("id") Long id){
		return serProNeg.obtener(id);
	}
	
	@DeleteMapping(path="{id}")
	public String eliminar(@PathVariable("id") Long id) {
		boolean eliminado = serProNeg.eliminar(id);
		
		if(eliminado) return "Producto Eliminado";
		else return "Error Eliminando Producto";
	}
	/*
	@GetMapping (path="{id_producto}/{id_negocio}")
	public Optional<ProductoNegocio> obtenerPorId(@PathVariable("id_producto") Long id_producto, @PathVariable("id_negocio") Long id_negocio){
		return serProNeg.obtener(new MProducto(id_producto), new MNegocio(id_negocio));
	}
	
	@DeleteMapping(path="{id_producto}/{id_negocio}")
	public String eliminar(@PathVariable("id_producto") Long id_producto, @PathVariable("id_negocio") Long id_negocio) {
		boolean eliminado = serProNeg.eliminar(new MProducto(id_producto), new MNegocio(id_negocio));
		
		if(eliminado) return "Producto Eliminado";
		else return "Error Eliminando Producto";
	}
	*/
}
