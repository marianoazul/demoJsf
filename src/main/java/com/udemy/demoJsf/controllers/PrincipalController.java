/**
 * 
 */
package com.udemy.demoJsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.udemy.demoJsf.entity.Empleado;
import com.udemy.demoJsf.services.EmpleadoService;

/**
 * @author Mariano Gomez Mtz
 * Clase controller que se encarga de procesar informacion para la pantalla principal
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	private List<Empleado> empleados;
	private List<Empleado> empleadosFiltrados;
	
	EmpleadoService empleadoService=new EmpleadoService();
	
	/*
	 * Metodo que se encarga de inicializar la informacion de la pantalla principal
	 * */
	@PostConstruct
	public void init() {
		this.consultarEmpelados();
	}
	
	/*
	 * Metodo que consulta la lista de empleados
	 * */
	public void consultarEmpelados() {
		this.empleados=this.empleadoService.consultarEmpleados();
		
	}

	
	/**
	 * @return the empleados
	 */
	public List<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @return the empleadosFiltrados
	 */
	public List<Empleado> getEmpleadosFiltrados() {
		return empleadosFiltrados;
	}

	/**
	 * @param empleadosFiltrados the empleadosFiltrados to set
	 */
	public void setEmpleadosFiltrados(List<Empleado> empleadosFiltrados) {
		this.empleadosFiltrados = empleadosFiltrados;
	}
	
	

}
