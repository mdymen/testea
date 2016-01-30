package com.examplet.teste;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.examplet.entidades.Luta;
import com.examplet.entidades.LutaTO;
import com.examplet.rest.DataReturn;
import com.examplet.rest.Rest;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class InicioActivity extends AppCompatActivity implements DataReturn  {

	ListView listView; 
	String retorno;
	Context ctx;
	InicioActivity cls;
	   
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_inicio);
		
//		String[] itemname ={
//				"Safari",
//				"Camera",
//				"Global",
//				"FireFox",
//				"UC Browser",
//				"Android Folder",
//				"VLC Player",
//				"Cold War"
//			};
		
		
		
//        ArrayAdapter<LutaTO> adapter = new ArrayAdapter<LutaTO>(this,
//          android.R.layout.simple_list_item_1, android.R.id.text1, lutas);
//		listView = (ListView) findViewById(R.id.list);
//		ListaInicioAdapter adapter = new ListaInicioAdapter(this, itemname);
//        listView.setAdapter(adapter); 
        
     //   listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

		
//		cls = this;
//		
//		ctx = getApplicationContext();
//		
//		 // Get ListView object from xml
//        listView = (ListView) findViewById(R.id.list);
//        
//        Luta l1 = new Luta();
//        l1.setId(1);
//        
//        Luta[] lutas = new Luta[] { l1, l1 };
//        
//        // Defined Array values to show in ListView
//        String[] values = new String[] { "Android List View", 
//                                         "Adapter implementation",
//                                         "Simple List View In Android",
//                                         "Create List View Android", 
//                                         "Android Example", 
//                                         "List View Source Code", 
//                                         "List View Array Adapter", 
//                                         "Android Example List View" 
//                                        };
//        
//        // Define a new Adapter
//        // First parameter - Context
//        // Second parameter - Layout for the row
//        // Third parameter - ID of the TextView to which the data is written
//        // Forth - the Array of data
//
//        ArrayAdapter<Luta> adapter = new ArrayAdapter<Luta>(this,
//          android.R.layout.simple_list_item_1, android.R.id.text1, lutas);
//
//
//        // Assign adapter to ListView
//        listView.setAdapter(adapter); 
//        
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//
//            @Override
//            public void onItemClick(AdapterView<?> parent, final View view,
//                int position, long id) {
//            	try {
//            		final Luta item = (Luta) parent.getItemAtPosition(position);
//            		
//            		Intent i = new Intent(cls, LutaActivity.class);
//            		i.putExtra("luta", item.getId());
//            		startActivity(i);
//
//            	}
//            	catch (Exception e) {
//            		e.printStackTrace();
//            	}
//            }
//
//          });
//        

//		
		Rest r = new Rest();
		r.setAction("getlutas");
		r.setDataReturn(this);
		r.execute("");

	}
	
	public void ltView(View view) {
		int i = 0;
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.inicio, menu);
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
    	JSONArray obj = null;
    	
		cls = this;
		
		ctx = getApplicationContext();
		
		 // Get ListView object from xml
        listView = (ListView) findViewById(R.id.list);

    	
		try {
			obj = new JSONArray(this.retorno);
			
			List<LutaTO> lutas = new ArrayList<LutaTO>();
			for (int i=0; i<obj.length(); i++) {
			    JSONObject actor = obj.getJSONObject(i);
			    String l1 = actor.getString("lutador1");
			    String l2 = actor.getString("lutador2");
			    int id = Integer.parseInt(actor.getString("luta"));
			    LutaTO luta = new LutaTO(l1,l2,id);
			    lutas.add(luta);
			}
			
		//	ListaInicioAdapter adapter = new ListaInicioAdapter(cls, lutas);
			
			listView = (ListView) findViewById(R.id.list);
			ListaInicioAdapter adapter = new ListaInicioAdapter(this, lutas);
	        listView.setAdapter(adapter); 
			
//	        ArrayAdapter<LutaTO> adapter = new ArrayAdapter<LutaTO>(this,
//	          android.R.layout.simple_list_item_1, android.R.id.text1, lutas);
//	        
//	        listView.setAdapter(adapter); 
	        
	        
	        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

	            @Override
	            public void onItemClick(AdapterView<?> parent, final View view,
	                int position, long id) {
	            	try {
	            		final LutaTO item = (LutaTO) parent.getItemAtPosition(position);
	            		
	            		Intent i = new Intent(cls, LutaActivity.class);
	            		i.putExtra("luta", item.getLuta());
	            		startActivity(i);

	            	}
	            	catch (Exception e) {
	            		e.printStackTrace();
	            	}
	            }

	          });

			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
}
