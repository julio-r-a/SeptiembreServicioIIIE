package com.idat.SetiembreIIIE.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="provedores")
public class Provedor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProvedor;
	private String provedor;
	private String direcion;
	
	@OneToOne
	private Producto producto;
	
	public Integer getIdProvedor() {
		return idProvedor;
	}
	public void setIdProvedor(Integer idProvedor) {
		this.idProvedor = idProvedor;
	}
	public String getProvedor() {
		return provedor;
	}
	public void setProvedor(String provedor) {
		this.provedor = provedor;
	}
	public String getDirecion() {
		return direcion;
	}
	public void setDirecion(String direcion) {
		this.direcion = direcion;
	}
		

}
