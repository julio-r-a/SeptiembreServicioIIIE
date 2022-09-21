package com.idat.SetiembreIIIE.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.idat.SetiembreIIIE.model.Producto;
import com.idat.SetiembreIIIE.repository.ProductoRepository;

@Service
public class ProductoServiceImpl implements ProductoService{
	
	@Autowired
	private ProductoRepository repository;

	@Override
	public void guardar(Producto producto) {
		repository.guardar(producto);		
	}

	@Override
	public void actualizar(Producto producto) {
		repository.actualizar(producto);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.eliminar(id);		
		
	}

	@Override
	public List<Producto> listar() {
		return repository.listar();		
	}

	@Override
	public Producto obtener(Integer id) {
		return repository.obtener(id);		
	}

}
