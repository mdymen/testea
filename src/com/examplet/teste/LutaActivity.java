package com.examplet.teste;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class LutaActivity extends AppCompatActivity implements DataReturn  {

	String retorno;
	
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
		try {
		setContentView(R.layout.activity_luta);
		

	    
	    
//		txtBoxe = (TextView) findViewById(R.id.luta1_boxe);
//		txtChute = (TextView) findViewById(R.id.luta1_chute);
//		txtJoelho = (TextView) findViewById(R.id.luta1_joelho);
//		txtCotovelo = (TextView) findViewById(R.id.luta1_cotovelo);
//		txtClinch = (TextView) findViewById(R.id.luta1_clinch);
//		txtVelocidade = (TextView) findViewById(R.id.luta1_velocidade);
//		txtExplocao = (TextView) findViewById(R.id.luta1_explocao);
//		txtResistencia = (TextView) findViewById(R.id.luta1_resistencia);
//		txtEstadofisico = (TextView) findViewById(R.id.luta1_estadofisico);
//		
//		
			Intent intent = getIntent();
			int luta = intent.getIntExtra("luta",0);
//		
			Rest r = new Rest();
			r.adicionar(String.valueOf(luta), "id");
			r.setAction("getluta");
			r.setDataReturn(this);
			r.execute("");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
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
			HashMap<String, Integer> lut2 = lutaDetalheTO.getLut2();
			TableLayout ll = (TableLayout) findViewById(R.id.t);
			HashMap<String, Integer> lut1 = lutaDetalheTO.getLut1();
			
			Iterator it = lut2.entrySet().iterator();
			Iterator it2 = lut1.entrySet().iterator();
			
			while (it.hasNext()) {
				Map.Entry pair = (Map.Entry)it.next();
				Map.Entry pair2 = (Map.Entry)it2.next();
				
				TableRow tr = new TableRow(this);
				
				TextView tv_caract = new TextView(this);
			    tv_caract.setText(pair.getKey().toString());
			    
				TextView tv1_caract = new TextView(this);
			    tv1_caract.setText(pair2.getKey().toString());
				
			    TextView tv_valor = new TextView(this);
			    tv_valor.setText(pair.getValue().toString());
				
			    TextView tv2_valor = new TextView(this);
			    tv2_valor.setText(pair2.getValue().toString());
		        
		        tr.addView(tv_caract);
		        tr.addView(tv_valor);
		        tr.addView(tv1_caract);
		        tr.addView(tv2_valor);
		        ll.addView(tr);
		    }
			

//			TableLayout ll2 = (TableLayout) findViewById(R.id.t2);
//			
//			
//			Iterator it2 = lut1.entrySet().iterator();
//			while (it2.hasNext()) {
//				Map.Entry pair = (Map.Entry)it2.next();
//				TableRow tr = new TableRow(this);
//				TextView tv_caract = new TextView(this);
//			    tv_caract.setText(pair.getKey().toString());
//				
//			    TextView tv_valor = new TextView(this);
//			    tv_valor.setText(pair.getValue().toString());
//		        
//		        tr.addView(tv_caract);
//		        tr.addView(tv_valor);
//		        ll2.addView(tr);
//		    }
//			
//			
//			txtGanhadas = null;
//			txtPerdidas = null;
//			txtEmpatadas = null;
//			txtKos = null;
//			txtNome = null;
//			
//			txtBoxe.setText(lutaDetalheTO.getLut1_boxe() + "");
//			txtChute.setText(String.valueOf(lutaDetalheTO.getLut1_chute()));
//			txtJoelho.setText(String.valueOf(lutaDetalheTO.getLut1_joleho()));
//			
//			txtCotovelo.setText(String.valueOf(lutaDetalheTO.getLut1_cotovelo()));
//			txtClinch.setText(String.valueOf(lutaDetalheTO.getLut1_clinch()));
//			txtVelocidade.setText(String.valueOf(lutaDetalheTO.getLut1_velocidade()));
//			
//			txtExplocao.setText(String.valueOf(lutaDetalheTO.getLut1_explocao()));
//			txtResistencia.setText(String.valueOf(lutaDetalheTO.getLut1_resistencia()));
//			txtEstadofisico.setText(String.valueOf(lutaDetalheTO.getLut1_estadofisico()));
//			int i = 0;
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
