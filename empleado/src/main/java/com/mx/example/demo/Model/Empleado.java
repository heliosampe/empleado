package com.mx.example.demo.Model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="EMPLEADOS")
public class Empleado implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private int idEmpleados;
	
	@Column(name = "NOMBRE")
	private String nombre;
	
	@Column(name = "APELLIDOS")
	private String apellidos;
	
	@Column(name = "FECHA_NACIMIENTO")
	private Date fechaNacimiento;
	
		
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_GENERO", nullable = false)
	private Generos generos;
	
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_TRABAJO",nullable = false)
	private Trabajos trabajos;
	
	
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="EMPLEADOS" )
	private List<EmpleadoHorasTrabajadas> empleadoHorasTrabajadas;
	
	
	
	
	public List<EmpleadoHorasTrabajadas> getEmpleadoHorasTrabajadas() {
		return empleadoHorasTrabajadas;
	}
	
	
	
	
	public Empleado() {
		
	}




	public int getIdEmpleados() {
		return idEmpleados;
	}




	public void setIdEmpleados(int idEmpleados) {
		this.idEmpleados = idEmpleados;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public String getApellidos() {
		return apellidos;
	}




	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}




	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}




	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}




	public Generos getGeneros() {
		return generos;
	}




	public void setGeneros(Generos generos) {
		this.generos = generos;
	}




	public Trabajos getTrabajos() {
		return trabajos;
	}




	public void setTrabajos(Trabajos trabajos) {
		this.trabajos = trabajos;
	}




	/*
	 * public void setEmpleadoHorasTrabajadas(List<EmpleadoHorasTrabajadas>
	 * empleadoHorasTrabajadas) { this.empleadoHorasTrabajadas =
	 * empleadoHorasTrabajadas; }
	 */
	
	
	

	



}
