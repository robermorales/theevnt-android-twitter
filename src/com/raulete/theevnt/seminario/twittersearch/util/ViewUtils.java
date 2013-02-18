package com.raulete.theevnt.seminario.twittersearch.util;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Utility methods for Views.
 */
public class ViewUtils {
    private ViewUtils() {
    }

    public static void setViewWidths(View view, View[] views) {
        int w = view.getWidth();
        int h = view.getHeight();
        for (int i = 0; i < views.length; i++) {
            View v = views[i];
            v.layout((i + 1) * w, 0, (i + 2) * w, h);
            printView("view[" + i + "]", v);
        }
    }

    public static void printView(String msg, View v) {
        System.out.println(msg + "=" + v);
        if (null == v) {
        	return;
        }
        String log = "[" + v.getLeft() + ", " + v.getTop() + ", w=" + v.getWidth() + ", h=" + v.getHeight() + "]"
        		+"mw=" + v.getMeasuredWidth() + ", mh=" + v.getMeasuredHeight() + "scroll [" + v.getScrollX() + "," + v.getScrollY() + "]";
        System.out.print("[" + v.getLeft());
        System.out.print(", " + v.getTop());
        System.out.print(", w=" + v.getWidth());
        System.out.println(", h=" + v.getHeight() + "]");
        System.out.println("mw=" + v.getMeasuredWidth() + ", mh=" + v.getMeasuredHeight());
        System.out.println("scroll [" + v.getScrollX() + "," + v.getScrollY() + "]");
        Log.i("ViewUtils", log);
    }

    public static void initListView(Context context, ListView listView, String prefix, int numItems, int layout) {
        // By using setAdpater method in listview we an add string array in list.
        String[] arr = new String[numItems];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prefix + (i + 1);
        }
        
        OnItemClickListener itemCallback = new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Context context = view.getContext();
                String msg = "item[" + position + "]=" + parent.getItemAtPosition(position);
                Toast.makeText(context, msg, Toast.LENGTH_LONG).show();
                System.out.println(msg);
            }
        };
        
        initListView(context, listView, arr, layout, itemCallback);
    }
    
    public static void initListView(Context context, ListView listView, String prefix, int numItems, int layout, OnItemClickListener callback) {
        // By using setAdpater method in listview we an add string array in list.
        String[] arr = new String[numItems];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = prefix + (i + 1);
        }
        initListView(context, listView, arr, layout, callback);
    }
    
    
    public static void initListView(Context context, ListView listView, String[] items, int layout, OnItemClickListener itemCallback){
    	listView.setAdapter(new ArrayAdapter<String>(context, layout, items));
    	if(itemCallback != null){
        	listView.setOnItemClickListener(itemCallback);
        }
    	
    }
    
    
//    public static void initListViewWithViews(Context context, ListView listView, ArrayList<View> views){
//    	listView.setAdapter(new ViewAdapter(context, views));
//    }
//    
//    public static void initListViewWithViews(Context context, ListView listView, ArrayList<View> views, OnItemSelectedListener callback){
//    	listView.setAdapter(new ViewAdapter(context, views));
//    	if(callback != null){
//        	listView.setOnItemSelectedListener(callback);
//        }
//    }
//    
//    public static void initListViewWithViews(Context context, ListView listView, ArrayList<View> views, OnItemClickListener callback){
//    	listView.setAdapter(new ViewAdapter(context, views));
//    	if(callback != null){
//        	listView.setOnItemClickListener(callback);
//        }
//    }
    
}
