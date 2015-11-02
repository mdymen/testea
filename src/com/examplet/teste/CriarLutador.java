package com.examplet.teste;

import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;
import com.examplet.util.UserManager;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;

public class CriarLutador extends AppCompatActivity implements DataReturn {

	Context ctx = null;
	EditText txtNomeLutador = null;
	String retorno;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.ctx = this.getApplicationContext();
		setContentView(R.layout.activity_criar_lutador);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.criar_lutador, menu);
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
		this.retorno = valor.toString();
	}
	
	public void btnCriarLutador(View view) {
		Rest r = new Rest();
		txtNomeLutador = (EditText) findViewById(R.id.txtNomeLutador);
		try {
			r.adicionar(txtNomeLutador.getText().toString(), "nome");
			r.adicionar(3+"", "academia");
			r.setAction("adicionarlutador");
	    	r.setDataReturn(this);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		r.execute("");
	}
}
