package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String screenName;
	private List<Publicacion> tweets;
	
	
	public Usuario( String screenName ) {	
		this.screenName = screenName;	
		this.tweets = new ArrayList<Publicacion>();
	}
	
	
	public String getScreenName() {
		return this.screenName;
	}

	
	public List<Publicacion> getTweets() {
		return this.tweets;
	}
	
	
	private boolean verificarLongitud( String texto ) {
		return ( texto.length() > 1 && texto.length() < 280 );
	}
	
	
	public Tweet publicarTweet( String texto ) {	
		
		if ( verificarLongitud(texto) ) {                    // es demaciado?
			Tweet tweet = new Tweet( this , texto );
			tweets.add(tweet);
			return tweet;
		}
		
		return null;
	}
	
	
	public ReTweet publicarRetweet( Publicacion tweet1 ) {
		
		if ( tweet1 != null ) {                               // acá tambien?
			ReTweet retweet = new ReTweet( this , tweet1 );
			tweets.add( retweet );
			return retweet;
		}
		
		return null;
	}
	

	public boolean eliminarTweet( Publicacion tweet ) {
		tweet.eliminar();
		return tweets.remove(tweet);
	}
	
	
	public boolean eliminarTweets() {
		tweets.clear();
		return tweets.isEmpty() ? true
				                : false;
	}
	
}
