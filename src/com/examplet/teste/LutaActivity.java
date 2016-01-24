package com.examplet.teste;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.examplet.entidades.LutaDetalheTO;
import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class LutaActivity extends AppCompatActivity implements DataReturn  {

	String retorno;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_luta);
		
		Intent intent = getIntent();
		int luta = intent.getIntExtra("luta",0);
		
		Rest r = new Rest();
		r.adicionar(String.valueOf(luta), "id");
		r.setAction("getluta");
		r.setDataReturn(this);
		r.execute("");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.luta, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}

	@Override
	public void dataActiviyReturn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValor(Object valor) {
		this.retorno = (String) valor;
		
		JSONObject obj = null;
		
		try {
			obj = new JSONObject(this.retorno);
			LutaDetalheTO lutaDetalheTO = new LutaDetalheTO(obj);
			int i = 0;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
