package com.examplet.teste;

import java.util.ArrayList;
import java.util.List;

import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class TreinoActivity extends AppCompatActivity implements DataReturn {

	CheckBox cbBoxe = null;
	CheckBox cbCotovelo = null;
	CheckBox cbChute = null;
	CheckBox cbClinch = null;
	CheckBox cbJoelho = null;
	CheckBox cbVelocidade = null;
	CheckBox cbExplocao = null;
	CheckBox cbEstadoFisico = null;
	CheckBox cbResistencia = null;
	
	
	List<String> treinos = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
//		Rest r = new Rest();
//		r.adicionar(1+"", "id");
//		r.setAction("getlutador");
//		r.setDataReturn(this);
//		r.execute("");
		
		setContentView(R.layout.activity_treino);
		treinos = new ArrayList<String>();
		cbBoxe = (CheckBox) findViewById(R.id.cbBoxe);
		cbChute = (CheckBox) findViewById(R.id.cbChute);
		cbCotovelo = (CheckBox) findViewById(R.id.cbCotovelo);
		cbJoelho = (CheckBox) findViewById(R.id.cbJoelho);
		cbClinch = (CheckBox) findViewById(R.id.cbClinch);
		cbVelocidade = (CheckBox) findViewById(R.id.cbVelocidade);
		cbExplocao = (CheckBox) findViewById(R.id.cbExplocao);
		cbResistencia = (CheckBox) findViewById(R.id.cbResistencia);
		cbEstadoFisico = (CheckBox) findViewById(R.id.cbEstadoFisico);
		cbResistencia = (CheckBox) findViewById(R.id.cbResistencia);
	}
	
	public int getTreinoId(String propiedad) {
		return 0;
	}
	
	public void btnTreinarLutador(View view) {
		Rest r = new Rest();
		
		//r.adicionar(,"id");
		r.adicionar("treino1","carac1");
		r.adicionar("treino2","carac2");
		r.adicionar("treino3","carac3");
		r.setAction("treinar");
    	r.setDataReturn(this);
    	r.execute("");
		
	}
	
	private void excluirTreinamento(String propiedad) {
		if (propiedad.equals("boxe")) {
			treinos.remove("boxe");
		} else if (propiedad.equals("chute")){
			treinos.remove("chute");
		} else if (propiedad.equals("joelho")) {
			treinos.remove("joelho");
		} else if (propiedad.equals("clinch")) {
			treinos.remove("clinch");
		} else if (propiedad.equals("cotovelo")) {
			treinos.remove("cotovelo");
		} else if (propiedad.equals("estado fisico")) {
			treinos.remove("estadofisico");
		} else if (propiedad.equals("velocidade")) {
			treinos.remove("velocidade");
		} else if (propiedad.equals("explocao")) {
			treinos.remove("explocao");
		} else if (propiedad.equals("resistencia")) {
			treinos.remove("resistencia");
		}		
	}
	
	private void incluirTreinamento(String propiedad) {
		if (propiedad.equals("boxe")) {
			treinos.add("boxe");
		} else if (propiedad.equals("chute")){
			treinos.add("chute");
		} else if (propiedad.equals("joelho")) {
			treinos.add("joelho");
		} else if (propiedad.equals("clinch")) {
			treinos.add("clinch");
		} else if (propiedad.equals("cotovelo")) {
			treinos.add("cotovelo");
		} else if (propiedad.equals("estado fisico")) {
			treinos.add("estadofisico");
		} else if (propiedad.equals("velocidade")) {
			treinos.add("velocidade");
		} else if (propiedad.equals("explocao")) {
			treinos.add("explocao");
		} else if (propiedad.equals("resistencia")) {
			treinos.add("resistencia");
		}
	}
	
	public void cbTreino(View view) {
		CheckBox cb = (CheckBox)view;
		String treino = cb.getText().toString();
		boolean checked = cb.isChecked();
		
		if (treinos.size() < 3) {
			if (checked) {
				this.incluirTreinamento(treino);
			} else {
				this.excluirTreinamento(treino);
			}
		} else {
			Context ctx = this.getApplicationContext();
			Toast.makeText(ctx, "Mucho error", Toast.LENGTH_LONG).show();
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
