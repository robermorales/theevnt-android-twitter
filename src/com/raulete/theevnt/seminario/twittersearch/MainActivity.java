package com.raulete.theevnt.seminario.twittersearch;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import com.raulete.theevnt.seminario.twittersearch.twitter.OnTwitterResponse;
import com.raulete.theevnt.seminario.twittersearch.twitter.Tweet;

public class MainActivity extends Activity implements OnTwitterResponse{

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
	
	/*
	 * TODO 
	 * Obtener la cadena texto que haya en el EditText
	 */
	public String getSearchString(){
    	String searchString = "";
    	// ...
    	return searchString;
    }
    
	/*
	 * TODO 
	 * Vamos a pedir a twitter los œltimos tweets que coincidan con la cadena escrita en el EditBox
	 * 
	 * La intenci—n es realizar una petici—n HTTP. 
	 * Desde HoneyComb no pueden hacerse peticiones HTTP en el hilo principal de la aplicaci—n.
	 * Referencia: http://developer.android.com/reference/android/os/NetworkOnMainThreadException.html
	 * 
	 * En esta pr‡ctica tenemos a nuestra disposici—n varias clases para ayudarnos a llevarla a cabo
	 * 	- RunInAnotherThreadRunnable
	 * 		Recibe un contexto sobre el que trabajar y una acci—n que ejecutar‡ en un nuevo hilo
	 * 	- TwitterSearchRunnable
	 * 		Acci—n que recibe como par‡mentros un objeto que implementa la interfaz OnTwitterResponse y la cadena de bœsqueda
	 * 
	 */
	public void search(View view){
    	//String searchString = getSearchString();
		//Runnable runInAnotherThread = ...;
		//runInAnotherThread.run();
	}
    
	/*
	 * TODO
	 * Cuando recibamos la respuesta de Twitter vamos a parsear los tweets.
	 * 
	 * La idea es preparar un Array De Strings con los mensajes que nos ha devuelto.
	 * Con la funci—n de ViewUtils.initListView(context, listView, items, layout, itemCallback) mostramos los mensajes en el ListView
	 *  -context 		: Contexto
	 *  -listView		: ListView donde vamos a "popular" los datos
	 *  -items 			: String[] con los mensajes a mostrar
	 *  -layout 		: Podemos usar el layout predefinido "android.R.layout.simple_list_item_1"
	 *  -itemCallback 	: Si queremos que haya algœn evento al hacer click sobre un elemento de la lista
	 */
	@Override
	public void parseTweets(ArrayList<Tweet> tweetsList) {
		//ListView tweetsListView = ...;
	}
}
