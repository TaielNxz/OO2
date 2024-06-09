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

import java.util.ArrayList;
import java.util.List;

public class Usuario {

	
	private String screenName;
	private List<Tweet> tweets;
	
	
	public Usuario( String screenName ) {	
		this.screenName = screenName;	
		this.tweets = new ArrayList<Tweet>();
	}
	
	
	public String getScreenName() {
		return this.screenName;
	}

	
	public List<Tweet> getTweets() {
		return this.tweets;
	}
	

	public Tweet publicarTweet( String texto ) {
		
		if ( texto.length() > 1 && texto.length() < 280 ) {
			
			Tweet tweet = new Tweet( this , texto );
			
			tweets.add(tweet);

			return tweet;
			
		}
		
		return null;

	}
	
	
	public ReTweet publicarRetweet( Tweet tweet ) {
		
		if ( tweet != null ) {
			
			ReTweet retweet = new ReTweet( this , tweet );
			
			tweets.add( retweet );
			
			return retweet;
			
		}
		
		return null;
		
	}
	

	public boolean eliminarTweet( Tweet tweet ) {
		tweet.eliminar();
		return tweets.remove(tweet);
	}
	
	
	public boolean eliminarTweets() {
		
		tweets.clear();
		
		return tweets.isEmpty() ? true
				                : false;
		
	}
	
	

}
