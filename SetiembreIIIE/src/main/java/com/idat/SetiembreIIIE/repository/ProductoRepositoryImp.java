package com.idat.SetiembreIIIE.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.idat.SetiembreIIIE.model.Producto;

@Service
public class ProductoRepositoryImp implements ProductoRepository{
	
	
	List<Producto> almacenamiento = new ArrayList<>();
	

	@Override
	public void guardar(Producto producto) {
		almacenamiento.add(producto);		
	}

	@Override
	public void actualizar(Producto producto) {
		
		Producto existeActualizar = obtener(producto.getIdProducto());
		eliminar(producto.getIdProducto());
		almacenamiento.add(existeActualizar);		
	}

	@Override
	public void eliminar(Integer id) {
		Producto existeEliminar = obtener(id);
		almacenamiento.remove(existeEliminar);		
	}

	@Override
	public List<Producto> listar() {
		return almacenamiento;
	}

	@Override
	public Producto obtener(Integer id) {
		return almacenamiento.stream().filter(p->p.getIdProducto()==id).findFirst().orElse(null);
	}

}
