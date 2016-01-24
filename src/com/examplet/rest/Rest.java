package com.examplet.rest;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;

import android.os.AsyncTask;

public class Rest extends AsyncTask<String, Void, String>{

	private String consulta;
	private String action;
	private List<String> params = new ArrayList<String>();
	private List<String> nomeVariaveis = new ArrayList<String>();
	public String retorno;
	private DataReturn dataReturn;
	
	public void adicionar(String param, String nomeVariavel) {
		this.params.add(param);
		this.nomeVariaveis.add(nomeVariavel);
	}
	
	public void setDataReturn(DataReturn dataReturn) {
		this.dataReturn = dataReturn;
	}
	
	public void setAction(String action) {
		this.action = action;
	}
	
	private String readStream(InputStream in) {
		  BufferedReader reader = null;
		  StringBuffer response = new StringBuffer();
		  try {
		    reader = new BufferedReader(new InputStreamReader(in));
		    String line = "";
		    while ((line = reader.readLine()) != null) {
		      response.append(line);
		    }
		  } catch (IOException e) {
		    e.printStackTrace();
		  } finally {
		    if (reader != null) {
		      try {
		        reader.close();
		      } catch (IOException e) {
		        e.printStackTrace();
		      }
		    }
		  }
		  return response.toString();
		} 
	
	protected void onPostExecute(String result) {
		this.retorno = result;
 		this.dataReturn.setValor(this.retorno);
		this.dataReturn.dataActiviyReturn();
	}
	
	@Override
	protected String doInBackground(String... params) {
		// TODO Auto-generated method stub
		this.arrumarConsulta(action);
		JSONArray response = new JSONArray();
		UrlManager urlManager = null;
		try {
			urlManager = new UrlManager(this.action, this.consulta);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		InputStream in;
		String responseString = ""; 
		try {
			responseString = readStream(urlManager.getConn().getInputStream());
			//in = new BufferedInputStream(urlManager.getConn().getInputStream());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		this.retorno = responseString;
		return responseString;
	}
	
	private String arrumarConsulta(String action) {
		String res = "";
		
		int i = 0;
		for (String param : this.params) {
			res += "&" + this.nomeVariaveis.get(i) + "=" + param; 
			i++;
		}
		
		this.action = action;
		this.consulta = res;
		
		return res="";
	}
}
