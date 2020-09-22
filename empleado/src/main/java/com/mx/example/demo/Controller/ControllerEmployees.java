package com.mx.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/registroEmpleados")
@RestController
public class ControllerEmployees {

	
	
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping({"/agrearEmpleado"})
	public EmpleadoBean agregarEmpleado(@RequestBody EmpleadoBeanEntrada empeladoBeanEntrada) {
		EmpleadoBean response = new EmpleadoBean();
		response=employeeService.guardarEmpleado(empleadoBeanEntrada);
			return response;
	}
	
	
}
