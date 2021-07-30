package com.udemy.demoJsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/*
 * Clase que permite el funcioamiento con la pantalla login
 * */

@ManagedBean
public class LoginController {
	private String usuario;
	private String password;
	
	
	public void ingresar() {
		if (usuario.equals("mariano")&&password.equals("123")) {
			try {
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
						new FacesMessage(FacesMessage.SEVERITY_FATAL,"ERROR AL CARGAR LA PÁGINA SOLICITADA",""));
				e.printStackTrace();
			}
		} else {
			FacesContext.getCurrentInstance().addMessage("formLogin:txtUsuario", 
					new FacesMessage(FacesMessage.SEVERITY_ERROR,"Usuario y/o contraseña incorrectos",""));
		}
		System.out.println("Usuario: "+ usuario);
	}
	
	public void redireccionar(String pagina) throws IOException {
		ExternalContext context= FacesContext.getCurrentInstance().getExternalContext();
		context.redirect(pagina);
	}
	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}
	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
