package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Twitter {
	
	private List<Usuario> usuarios;
	
	public Twitter() {
		this.usuarios = new ArrayList<Usuario>();
	}
	

	public List<Usuario> getUsuarios() {
		return usuarios;
	
	}
	
	
	public Usuario getUsuario( String screenName ) {	
	    return this.usuarios.stream()
	    		.filter( usuario -> usuario.getScreenName().equals(screenName) )
	    		.findFirst()
	    		.orElse(null);
	}
	
	
	public boolean existeUsuario(String screenName) {
		Usuario usuario = getUsuario(screenName);
	    return ( usuario != null ) ? true
	    		                   : false;
 	}

	
	public Usuario registrarUsuario( String screenName ) {
		
		if ( !existeUsuario(screenName) ) {
			Usuario usuario = new Usuario(screenName);
			this.usuarios.add(usuario);	
			return usuario;
		}
		
		return null;	
	}
	
	
	public boolean eliminarUsuario( String screenName ) {   // le paso el screenName o el Usuario???
		
		if ( existeUsuario(screenName) ) {                  // duda tremenda sobre este modulo
			Usuario usuario = getUsuario(screenName);
			usuario.eliminarTweets();
			this.usuarios.remove(usuario);
			return true;
		}
		
		return false;
	}

}
