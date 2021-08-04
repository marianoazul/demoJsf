/**
 * 
 */
package com.udemy.demoJsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author Mariano Gomez Mtz
 * Clase que se encarga de cerrar la sesion del usuario
 */
@ManagedBean
public class SessionClosedController {

	@PostConstruct
	public void init(){
		System.out.println("Cerrando sesion de usuario...");
	}
	
	
	public void cerrarSession() {
		ExternalContext externalContext=FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try {
			this.redireccionar("login.xhtml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext context= FacesContext.getCurrentInstance().getExternalContext();
		context.redirect(pagina);
	}
	
	
}
