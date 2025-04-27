package ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion2;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1.ReTweet;
import ar.edu.unlp.info.oo2.ejercicio_01_RedSocial_Solucion1.Tweet;

public class Usuario2 {

	
	private String screenName;
	private List<Tweet2> tweets;
	
	
	public Usuario2( String screenName ) {	
		this.screenName = screenName;	
		this.tweets = new ArrayList<Tweet2>();
	}
	
	
	public String getScreenName() {
		return this.screenName;
	}

	
	public List<Tweet2> getTweets() {
		return this.tweets;
	}
	

	public Tweet2 publicarTweet( String texto ) {
		
		if ( texto.length() > 1 && texto.length() < 280 ) {
			
			Tweet2 tweet = new TweetOriginal( this , texto );
			
			tweets.add(tweet);

			return tweet;
			
		}
		
		return null;

	}
	
	
	public Tweet2 publicarRetweet( Tweet2 tweet ) {
		
		if ( tweet != null ) {
			
			Tweet2 retweet = new ReTweet2( this , tweet );
			
			tweets.add( retweet );
			
			return retweet;
			
		}
		
		return null;
		
	}
	

	public boolean eliminarTweet( Tweet2 tweet ) {
		tweet.eliminar();
		return tweets.remove(tweet);
	}
	
	
	public boolean eliminarTweets() {
		
		tweets.clear();
		
		return tweets.isEmpty() ? true
				                : false;
		
	}
	

}
