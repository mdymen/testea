package com.examplet.teste;

import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class Treino extends AppCompatActivity implements DataReturn {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Rest r = new Rest();
		r.adicionar(1+"", "id");
		r.setAction("getlutador");
		r.setDataReturn(this);
		r.execute("");
		
		setContentView(R.layout.activity_treino);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.treino, menu);
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
		// TODO Auto-generated method stub
		
	}
}