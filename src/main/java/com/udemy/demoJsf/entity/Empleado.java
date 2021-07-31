/**
 * 
 */
package com.udemy.demoJsf.entity;

/**
 * @author Mariano Gomez Mtz
 *Clase que representa entidades empleados
 */
public class Empleado {
	
	private String nombre;
	private String apPaterno;
	private String apMaterno;
	private String puesto;
	private boolean estatus;
	
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apPaterno
	 */
	public String getApPaterno() {
		return apPaterno;
	}
	/**
	 * @param apPaterno the apPaterno to set
	 */
	public void setApPaterno(String apPaterno) {
		this.apPaterno = apPaterno;
	}
	/**
	 * @return the apMaterno
	 */
	public String getApMaterno() {
		return apMaterno;
	}
	/**
	 * @param apMaterno the apMaterno to set
	 */
	public void setApMaterno(String apMaterno) {
		this.apMaterno = apMaterno;
	}
	/**
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}
	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	/**
	 * @return the estatus
	 */
	public boolean getEstatus() {
		return estatus;
	}
	/**
	 * @param estatus the estatus to set
	 */
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
}
