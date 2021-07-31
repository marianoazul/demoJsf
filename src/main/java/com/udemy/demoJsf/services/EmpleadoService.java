/**
 * 
 */
package com.udemy.demoJsf.services;

import java.util.ArrayList;
import java.util.List;

import com.udemy.demoJsf.entity.Empleado;

/**
 * @author Mariano Gomez Mtz
 *Clase que permite realizar la logica de negocio para empleados
 */
public class EmpleadoService {
	
	public List<Empleado>consultarEmpleados(){
		List<Empleado> empleados=new ArrayList<Empleado>();
		
		Empleado empleadoIBM=new Empleado();
		Empleado empleadoMicrosoft=new Empleado();
		Empleado empleadoApple=new Empleado();
		Empleado empleadoAmazon=new Empleado();
		
		empleadoIBM.setNombre("Thania");
		empleadoIBM.setApPaterno("Moreno");
		empleadoIBM.setApMaterno("Ordoñez");
		empleadoIBM.setPuesto("QA");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Luis Mariano");
		empleadoMicrosoft.setApPaterno("Gomez");
		empleadoMicrosoft.setApMaterno("Martinez");
		empleadoMicrosoft.setPuesto("Desarrollador");
		empleadoMicrosoft.setEstatus(true);

		empleadoApple.setNombre("Mariana");
		empleadoApple.setApPaterno("Gomez");
		empleadoApple.setApMaterno("Martinez");
		empleadoApple.setPuesto("Contador");
		empleadoApple.setEstatus(true);
		
		empleadoAmazon.setNombre("Gilberto");
		empleadoAmazon.setApPaterno("Gomez");
		empleadoAmazon.setApMaterno("Martinez");
		empleadoAmazon.setPuesto("Electrico");
		empleadoAmazon.setEstatus(false);
		
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadoApple);
		empleados.add(empleadoAmazon);
		
		return empleados;
	}

}
