/*
 * 
 * 
 * 
 * LA SOLUCION 2 ES SUPERIOR PERDO DEJO ESTA PORQUE ME LLEVO TIEMPO Y ES ALTA PAJA BORRAR TODO 
 * 
 * 
 * 
 */
package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1;

import java.util.List;
import java.util.ArrayList;


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
	    		.orElse(null); // Devuelve null si no se encuentra ningún usuario 

	}
	
	
	public Usuario registrarUsuario( String screenName ) {
		
		if ( getUsuario(screenName) == null ) {
			
			Usuario usuario = new Usuario(screenName);
			
			this.usuarios.add(usuario);
			
			return usuario;

		}
		
		return null;	
	}
	
	
	public boolean eliminarUsuario( String screenName ) {
		
		Usuario usuario = getUsuario(screenName);
		
		if ( usuario != null ) {
			
			usuario.eliminarTweets();
			
			this.usuarios.remove(usuario);
			
			return true;

		}
		
		return false;

	}

}
