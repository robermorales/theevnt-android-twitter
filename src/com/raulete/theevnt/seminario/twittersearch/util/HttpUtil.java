package com.raulete.theevnt.seminario.twittersearch.util;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import android.util.Log;

public class HttpUtil {

	private static HttpClient httpclient;
	
	private static String TAG = "HttpUtil";
	
	public static HttpClient getHttpClient(){
		if (HttpUtil.httpclient == null)
			HttpUtil.httpclient = new DefaultHttpClient();
		return HttpUtil.httpclient;
	}
	
	public static String httpGetRequest(String paramString){
		HttpClient localHttpClient = getHttpClient();
		String responseString = "";
		try{
			HttpResponse localHttpResponse = localHttpClient.execute(new HttpGet(paramString));
			responseString = response2String(localHttpResponse);
		} catch (ClientProtocolException localClientProtocolException){
			Log.i(TAG,"ClientProtocolException : " + localClientProtocolException.getMessage());
		} catch (IOException localIOException){
			Log.i(TAG,"IOException : " + localIOException.getMessage());
		} catch (Exception localException){
			Log.i(TAG,"Exception : " + localException.toString());
			Log.i(TAG,"Exception Message : " + localException.getMessage());
		}
		return responseString;
	}

	public static String response2String(HttpResponse httpResponse){
		HttpEntity r_entity = httpResponse.getEntity();
		String xmlString = null;
		try{
			xmlString = EntityUtils.toString(r_entity);
		}catch(Exception localException){
			Log.i(TAG,"Exception : " + localException.getMessage());
		}
		return xmlString;
    }
}

