package com.mx.example.demo.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="TRABAJOS")
public class Trabajos implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
    @Column(name ="ID")
	private int idTrabajos;
	
	@Column(name ="NOMBRE_TRABAJO")
	private int nombreTrabaojo;
	
	@Column(name = "SALARIO")
	private int salario;
	
	
	@OneToMany(fetch =  FetchType.LAZY, mappedBy = "trabajos")
	private List<Empleado> empleado;
	
	
	//constructor con parametro para traer el id trabajo
	public Trabajos(int idTrabajos) {
		this.idTrabajos = idTrabajos;
		}
	//constructor vacio 
	public Trabajos() {
		
	}
	//getters and setters
	public int getIdTrabajos() {
		return idTrabajos;
	}
	public void setIdTrabajos(int idTrabajos) {
		this.idTrabajos = idTrabajos;
	}
	public int getNombreTrabaojo() {
		return nombreTrabaojo;
	}
	public void setNombreTrabaojo(int nombreTrabaojo) {
		this.nombreTrabaojo = nombreTrabaojo;
	}
	public int getSalario() {
		return salario;
	}
	public void setSalario(int salario) {
		this.salario = salario;
	}
	public List<Empleado> getEmpleado() {
		return empleado;
	}
	public void setEmpleado(List<Empleado> empleado) {
		this.empleado = empleado;
	}
	
	
	
}
