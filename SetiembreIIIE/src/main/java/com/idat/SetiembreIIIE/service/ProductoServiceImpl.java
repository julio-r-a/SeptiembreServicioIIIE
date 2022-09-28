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
		repository.save(producto);		
	}

	@Override
	public void actualizar(Producto producto) {
		repository.saveAndFlush(producto);		
		
	}

	@Override
	public void eliminar(Integer id) {
		repository.deleteById(id);		
		
	}

	@Override
	public List<Producto> listar() {
		return repository.findAll();		
	}

	@Override
	public Producto obtener(Integer id) {
		return repository.findById(id).orElse(null);		
	}

}
