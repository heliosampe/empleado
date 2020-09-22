package com.mx.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mx.example.demo.Model.Empleado;




@Repository
public interface EmpleadoRepo extends JpaRepository<Empleado, Integer> {

	
}
