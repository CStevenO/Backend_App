package com.app.demo.Repositories;

import org.springframework.data.repository.CrudRepository;

//import com.app.demo.Modelo.MNegocio;
//import com.app.demo.Modelo.MProducto;
import com.app.demo.Modelo.MProductoNegocio;

public interface RProductoNegocio extends CrudRepository<MProductoNegocio,Long>{
	//ProductoNegocio findByProductAndBusiness(MProducto id_producto,MNegocio id_negocio);
	//void deleteByProductAndBusiness(MProducto id_producto,MNegocio id_negocio);
}
