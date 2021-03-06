package com.app.demo.Controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.demo.Modelo.MDetalle_Ventas;
import com.app.demo.Modelo.MVentas;
import com.app.demo.Modelo.MVentasyDetalles;
import com.app.demo.Services.SDetalle_Ventas;
import com.app.demo.Services.SVentas;

@RestController
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST,RequestMethod.DELETE})
@RequestMapping("ventas")
public class CVentas {
	@Autowired
	SVentas serVentas;
	@Autowired
	SDetalle_Ventas serDetalle;
	
	@PostMapping
	public MVentas guardar(@RequestBody MVentasyDetalles venta) {
		MVentas ven = serVentas.guardar(venta.getVentas());
		int i = 0;
		while(i<venta.getDetalles().size()) {
			venta.getDetalles().get(i).setVenta(ven);
			i++;
		}
		serDetalle.guardarTodos(venta.getDetalles());
		return ven;
	}
	
	@GetMapping (path="{id}")
	public Optional<MVentas> obtenerPorId(@PathVariable("id") Long id){
		return serVentas.obtenerPorId(id);
	}
	
	@GetMapping(path="/ventas")
	public ArrayList<MVentas> obtenerVentas(){
		return serVentas.obtenerTodos();
	}
	
	@GetMapping(path="/detalles")
	public ArrayList<MDetalle_Ventas> obtenerDetalles(){
		return serDetalle.obtenerTodos();
	}
	
	//TODO: hacer los metodos DELETE tanto de ventas como de detalle de ventas, ojala de ambos en un solo metodo
}
