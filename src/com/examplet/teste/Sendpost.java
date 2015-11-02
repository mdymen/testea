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
        	String action = arg0[0];
        	String usuario = arg0[1];
        	String senha = arg0[2];
        	String email = arg0[4];
        	String cep = arg0[5];
        	
	        URL url = new URL("http://www.worldfight.com.br/public/agt/"+action+"?cep="+cep+"&usuario="+usuario+"&email="+email+"&senha="+senha);
	        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	        conn.setReadTimeout(10000);
	        conn.setConnectTimeout(15000);
	        conn.setRequestMethod("POST");
	        conn.setDoInput(true);
	        conn.setDoOutput(true);
	
	        InputStream in = new BufferedInputStream(conn.getInputStream());
	        
        }
        catch (Exception e) {
        	System.out.println(e.getMessage());
        }
        
        return null;
	}

}
