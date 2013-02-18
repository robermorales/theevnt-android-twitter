package com.raulete.theevnt.seminario.twittersearch.twitter;

import java.util.ArrayList;

public interface OnTwitterResponse {

	public void parseTweets(ArrayList<Tweet> tweets);
	
	public void runOnUiThread(Runnable run);

}
