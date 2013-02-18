package com.raulete.theevnt.seminario.twittersearch.twitter;

import java.util.ArrayList;


public class TwitterSearchRunnable implements Runnable{
	
	private OnTwitterResponse twitterResponseHandler;
	private String search;
	
	public TwitterSearchRunnable(OnTwitterResponse activity, String search){
		this.twitterResponseHandler = activity;
		this.search = search;
	}
	
	public void run(){
		final ArrayList<Tweet> tweets = Twitter.getLastTweetsInSearch(search);
		twitterResponseHandler.runOnUiThread(new Runnable() {
		     public void run() {
		    	 twitterResponseHandler.parseTweets(tweets);
		    }
		});
	}
}
