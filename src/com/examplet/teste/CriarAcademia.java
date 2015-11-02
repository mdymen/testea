package com.examplet.teste;

import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;
import com.examplet.util.UserManager;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CriarAcademia extends AppCompatActivity implements DataReturn {

	EditText txtNome = null;
	EditText txtDescricao = null;
	String retorno;
	Context ctx;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        this.ctx = this.getApplicationContext();
		setContentView(R.layout.activity_criar_academia);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.criar_academia, menu);
		return true;
	}
	
	public void btnCriarAcademia(View view) {
		Rest r = new Rest();
		txtNome = (EditText) findViewById(R.id.txtNomeAcademia);
		txtDescricao = (EditText) findViewById(R.id.txtDescricaoAcademia);
		try {
			r.adicionar(txtNome.getText().toString(), "nome");
			r.adicionar(txtDescricao.getText().toString(), "descricao");
			r.adicionar(UserManager.getInstance().getId()+"","usuario");
			r.setAction("adicionaracademia");
	    	r.setDataReturn(this);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		r.execute("");
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
		if (!this.retorno.equals("error")) {
			Toast toast = Toast.makeText(this.ctx, "Academia criada com sucesso", Toast.LENGTH_LONG);
			toast.show();
			Intent i = new Intent(this, CriarLutador.class);
			startActivity(i);
		} else {
			Toast toast = Toast.makeText(this.ctx, "Error na criacao!", Toast.LENGTH_LONG);
			toast.show();
		}
		
	}

	@Override
	public void setValor(Object valor) {
		this.retorno = valor.toString();
	}
}
