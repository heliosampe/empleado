package com.mx.example.demo.Model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class EmpleadoHorasTrabajadas implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column(name ="ID")
	private int idEmpleadoHorasTrabajadas;
	
	@Column(name = "HORAS_TRABAJADAS")
	private int horasTrabajadas;

	@Column(name = "DIA_TRABAJADO")
	private Date diaTrabajado;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EMPLEADO", nullable = false)
	private Empleado empleado;
	
	
	
	public EmpleadoHorasTrabajadas() {
		}



	public int getIdEmpleadoHorasTrabajadas() {
		return idEmpleadoHorasTrabajadas;
	}



	public void setIdEmpleadoHorasTrabajadas(int idEmpleadoHorasTrabajadas) {
		this.idEmpleadoHorasTrabajadas = idEmpleadoHorasTrabajadas;
	}



	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}



	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}



	public Date getDiaTrabajado() {
		return diaTrabajado;
	}



	public void setDiaTrabajado(Date diaTrabajado) {
		this.diaTrabajado = diaTrabajado;
	}



	public Empleado getEmpleado() {
		return empleado;
	}



	public void setEmpleado(Empleado empleado) {
		this.empleado = empleado;
	}
}















