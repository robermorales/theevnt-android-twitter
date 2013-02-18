package com.raulete.theevnt.seminario.twittersearch.twitter;

import android.content.Context;

public class RunInAnotherThreadRunnable implements Runnable{
		
	Context context = null;
	Runnable runnable = null;
	
	public RunInAnotherThreadRunnable(Context context, Runnable runnable){
		this.context = context;
		this.runnable = runnable;
	}
	
	public void run(){
		if(runnable != null){
			new Thread(runnable).start();
		}
	}
	
}
