package com.app.demo.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.Modelo.MCliente;
import com.app.demo.Services.SCliente;



@RestController
@RequestMapping("/clientes")
public class CCliente {
	
	@Autowired
	SCliente sevCliente;
	
	@GetMapping
	public ArrayList<MCliente> obtener(){
		return sevCliente.obtenerTodos();
	}
	
	@PostMapping
	public MCliente crear(@RequestBody MCliente cliente) {
		return sevCliente.guardar(cliente);
	}
	
	@GetMapping (path="{id}")
	public Optional<MCliente> obtenerPorId(@PathVariable("id") Long id){
		return sevCliente.obtenerPorId(id);
	}
	
	@DeleteMapping(path="{id}")
	public String eliminar(@PathVariable("id") Long id) {
		boolean eliminado = sevCliente.eliminar(id);
		
		if(eliminado) return "Cliente Eliminado";
		else return "Error Eliminando Cliente";
	}
}
