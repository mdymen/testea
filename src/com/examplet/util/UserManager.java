package com.examplet.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.support.v7.app.AppCompatActivity;

public class UserManager extends AppCompatActivity{

	private static UserManager manager = null;
	public static final String AGT = "AGT";
	private Context ctx;
	
	SharedPreferences settings;
	
	private UserManager(){
		try {
         this.settings = getSharedPreferences(AGT,0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private UserManager(Context ctx){
		try {
		this.ctx = ctx;
         this.settings = this.ctx.getSharedPreferences(AGT,0);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static UserManager getInstance() {
		if (manager == null) {
			manager = new UserManager();
		}
		return manager;
	}
	
	public static UserManager getInstance(Context ctx) {
		if (manager == null) {
			manager = new UserManager(ctx);
		}
		return manager;
	}
	
	public void setUsuario(String usuario) {
    	Editor editor = settings.edit();
    	editor.putString("usuario", usuario);
    	editor.commit();		
	}
	
	public void setId(int id) {
		try {
	    	Editor editor = settings.edit();
	    	editor.putInt("id", id);
	    	editor.commit();		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getUsuario() {
		return settings.getString("usuario", null);
	}
	
	public int getId() {
		return settings.getInt("id", 0);
	}
}
