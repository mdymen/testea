package com.examplet.teste;

import java.util.ArrayList;
import java.util.List;

import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;

public class TreinoActivity extends AppCompatActivity implements DataReturn {

	CheckBox cbEstadoFisico = null;
	
	List<String> treinos = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Rest r = new Rest();
		r.adicionar(1+"", "id");
		r.setAction("getlutador");
		r.setDataReturn(this);
		r.execute("");
		
		setContentView(R.layout.activity_treino);
		treinos = new ArrayList<String>();
		cbEstadoFisico = (CheckBox) findViewById(R.id.cbEstadoFisico);
	}
	
	public int getTreinoId(String propiedad) {
		return 0;
	}
	
	public void btnTreinarLutador(View view) {
		Rest r = new Rest();
		
//		r.adicionar(,"id");
//		r.adicionar(,"treino1");
//		r.adicionar(,"treino2");
//		r.adicionar(,"treino3");
		
	}
	
	public void cbEstadoFisico(View view) {
		CheckBox cb = (CheckBox)view;
		String propiedad = cb.getText().toString();
		
		if (treinos.size() < 3) {
			if (propiedad.equals("Boxe")) {
				treinos.add("Boxe");
			} else if (propiedad.equals("Chute")){
				treinos.add("Chute");
			} else if (propiedad.equals("Joelho")) {
				treinos.add("Joelho");
			} else if (propiedad.equals("Clinch")) {
				treinos.add("Clinch");
			} else if (propiedad.equals("Cotovelo")) {
				treinos.add("Cotovelo");
			} else if (propiedad.equals("EstadoFisico")) {
				treinos.add("EstadoFisico");
			} else if (propiedad.equals("Velocidade")) {
				treinos.add("Velocidade");
			} else if (propiedad.equals("Explocao")) {
				treinos.add("Explocao");
			} else if (propiedad.equals("Resistencia")) {
				treinos.add("Resistencia");
			}
		} else {
			
		}
				
		
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
