package com.raulete.theevnt.seminario.twittersearch.twitter;

import org.json.JSONObject;

import android.util.Log;

public class Tweet {

	public JSONObject json;
	
	public String message = "";
	
	public Tweet(JSONObject json){
		this.json = json;
		parseJson();
	}
	
	public void parseJson(){
		try{
			message  = json.getString("text");
		} catch (Exception e){
			Log.i("Tweet", e.toString() + " - " + e.getMessage());
		}
	}
}
