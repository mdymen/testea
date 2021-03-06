package com.examplet.teste;

import com.examplet.entidades.Lutador;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.TextView;

public class LutadorActivity extends AppCompatActivity  {

	TextView txtBoxe = null;
	TextView txtChute = null;
	TextView txtJoelho = null;
	TextView txtCotovelo = null;
	TextView txtClinch = null;
	TextView txtVelocidade = null;
	TextView txtExplocao = null;
	TextView txtResistencia = null;
	TextView txtEstadofisico = null;
	
	TextView txtGanhadas = null;
	TextView txtPerdidas = null;
	TextView txtEmpatadas = null;
	TextView txtKos = null;
	TextView txtNome = null;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_lutador);
		
		try {
			Lutador lutador = (Lutador) getIntent().getSerializableExtra("Lutador");
			
			txtBoxe = (TextView) findViewById(R.id.txtBoxe);
			txtChute = (TextView) findViewById(R.id.txtChute);		
			txtJoelho = (TextView) findViewById(R.id.txtJoelho);
			txtCotovelo = (TextView) findViewById(R.id.txtCotovelo);
			txtClinch = (TextView) findViewById(R.id.txtClinch);
			txtVelocidade = (TextView) findViewById(R.id.txtVelocidade);
			txtExplocao = (TextView) findViewById(R.id.txtExplocao);
			txtResistencia = (TextView) findViewById(R.id.txtResistencia);
			txtEstadofisico = (TextView) findViewById(R.id.txtEstadofisico);
			
			txtGanhadas = (TextView) findViewById(R.id.txtGanhadas);
			txtPerdidas = (TextView) findViewById(R.id.txtPerdidas);
			txtEmpatadas = (TextView) findViewById(R.id.txtEmpatadas);
			txtKos = (TextView) findViewById(R.id.txtKos);
			
			txtNome = (TextView) findViewById(R.id.txtNome);
			
			txtBoxe.setText(lutador.getBoxe()+"");
			txtChute.setText(lutador.getChute()+"");
			txtJoelho.setText(lutador.getJoleho()+"");
			txtCotovelo.setText(lutador.getCotovelo()+"");
			txtClinch.setText(lutador.getClinch()+"");
			txtVelocidade.setText(lutador.getVelocidade()+"");
			txtExplocao.setText(lutador.getExplocao()+"");
			txtResistencia.setText(lutador.getResistencia()+"");
			txtEstadofisico.setText(lutador.getEstadofisico()+"");	
			
			txtGanhadas.setText(lutador.getGanhadas()+"");
			txtPerdidas.setText(lutador.getPerdidas()+"");
			txtEmpatadas.setText(lutador.getEmpatadas()+"");
			txtKos.setText(lutador.getKos()+"");	
			txtNome.setText(lutador.getNome()+"");	
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.lutador, menu);
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
}