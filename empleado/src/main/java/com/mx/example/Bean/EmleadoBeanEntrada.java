package com.mx.example.Bean;

import java.util.Date;

public class EmleadoBeanEntrada {

	
	int generoId;
	int trabajoId;
	String nombre;
	String apellidos;
	Date fechaNacimiento;
	
	
	public int getGeneroId() {
		return generoId;
	}
	public void setGenderoId(int genderoId) {
		this.generoId = genderoId;
	}
	public int getTrabajoId() {
		return trabajoId;
	}
	public void setTrabajoId(int trabajoId) {
		this.trabajoId = trabajoId;
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
	public void setApellidos(String apellido) {
		this.apellidos = apellido;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	
	
	
}
