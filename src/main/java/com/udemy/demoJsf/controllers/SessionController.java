/**
 * 
 */
package com.udemy.demoJsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.udemy.demoJsf.dto.UsuarioDTO;

/**
 * @author Mariano Gomez Mtz
 * Clase que se encarga de mantener la infomacion del usuario en Session
 */

@ManagedBean
@SessionScoped
public class SessionController {
	private UsuarioDTO usuarioDTO;

	/**
	 * @return the usuarioDTO
	 */
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en sesion");
	}
	
	/**
	 * @param usuarioDTO the usuarioDTO to set
	 */
	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
