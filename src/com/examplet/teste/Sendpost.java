package com.examplet.teste;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import android.content.ContentValues;
import android.os.AsyncTask;

public class Sendpost extends AsyncTask<String, Void, Void>{

	@Override
	protected Void doInBackground(String... arg0) {
        try {
        	String usuario = arg0[0];
        	String senha = arg0[1];
        	String email = arg0[3];
        	String cep = arg0[2];
        	
	        URL url = new URL("http://www.worldfight.com.br/public/agt/signin?cep="+cep+"&usuario="+usuario+"&email="+email+"&senha="+senha);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setReadTimeout(10000);
	        conn.setConnectTimeout(15000);
	        conn.setRequestMethod("POST");
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	
	        InputStream in = new BufferedInputStream(conn.getInputStream());
	        
//	        ContentValues values=new ContentValues();
//	        values.put("username","mdymen");
//	        values.put("password","minhaSenha");
//	
//	        OutputStream os = conn.getOutputStream();
//	        BufferedWriter writer = new BufferedWriter(
//	                new OutputStreamWriter(os, "UTF-8"));
//	        writer.write("HOLAA");
//	        writer.flush();
//	        writer.close();
//	        os.close();
//	
//	        conn.connect();
        }
        catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        return null;
	}

}
