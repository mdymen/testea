package com.examplet.teste;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONStringer;

import com.examplet.entidades.Lutador;
import com.examplet.rest.Rest;

import android.support.v7.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.os.UserManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

import com.examplet.rest.DataReturn;

public class MainActivity extends AppCompatActivity implements DataReturn {

	Button btnClick = null;
	EditText txtUsuario = null;
	EditText txtSenha = null;
	public String retorno;
	Context ctx;
	
	ListView listView; 
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.ctx = this.getApplicationContext();
        com.examplet.util.UserManager.getInstance(this.ctx);
        
		Rest r = new Rest();
		r.adicionar(1+"", "id");
		r.setAction("getlutador");
		r.setDataReturn(this);
		r.execute("");
        
        
        try {
            setContentView(R.layout.activity_lutador);
        // Get ListView object from xml
//        listView = (ListView) findViewById(R.id.list);
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
//        ctx = this;
//        // Define a new Adapter
//        // First parameter - Context
//        // Second parameter - Layout for the row
//        // Third parameter - ID of the TextView to which the data is written
//        // Forth - the Array of data
//
//        listView.setOnItemClickListener(new OnItemClickListener() {
//
//			@Override
//			public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
//					long arg3) {
////				Intent i = new Intent(ctx, CriarLutador.class);
////				startActivity(i);
//				Toast toast = Toast.makeText(ctx, arg2, Toast.LENGTH_LONG);
//				toast.show();
////				Toast toast = Toast.makeText(this.ctx, "Error na criacao!", Toast.LENGTH_LONG);
////				toast.show();
//				
//			};
//        	
//        });
//        
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
//          android.R.layout.simple_list_item_1, android.R.id.text1, values);
//
//
//        // Assign adapter to ListView
//        listView.setAdapter(adapter); 
        
        }
        catch (Exception e) {
        	e.printStackTrace();
        }
		
		
    }
    
    public void clickItem(View view) {
		Toast toast = Toast.makeText(this.ctx, "Nome de usuario ou senha incorretos!", Toast.LENGTH_LONG);
		toast.show();
    }
    
    public void btnLoginClick(View view) {
    	
  	  txtUsuario = (EditText) findViewById(R.id.usuario);
      txtSenha = (EditText) findViewById(R.id.senha);
      
    	Rest r = new Rest();
    	r.adicionar(txtUsuario.getText().toString(), "usuario");
    	r.adicionar(txtSenha.getText().toString(), "senha");
    	r.setAction("login");
    	r.setDataReturn(this);
    	r.execute("");
//        
//    	String[] args = new String[] {"login", txtUsuario.getText().toString(),txtSenha.getText().toString() };
//    	new Sendpost().execute(args);
    }
    
    public void btnAbrirNuevo(View view) {
    	Intent intent = new Intent(this, SignIn.class);
    	startActivity(intent);
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    public void menuAcademia(MenuItem item) {
    	Intent i = new Intent(this, CriarAcademia.class);
    	startActivity(i);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.meus_dados) {
        	Intent intent = new Intent(this, SignIn.class);
        	startActivity(intent);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    @Override
    public void dataActiviyReturn() {
    	Lutador lutador = new Lutador(this.retorno);
    	
		Intent intent = new Intent(this, LutadorActivity.class);
		intent.putExtra("Lutador", lutador);
		startActivity(intent);
    }

//	@Override
//	public void dataActiviyReturn() {
//		if (!this.retorno.equals("0")) {
//			com.examplet.util.UserManager.getInstance().setUsuario(txtUsuario.getText().toString());
//			int id = Integer.parseInt(this.retorno);
//			com.examplet.util.UserManager.getInstance().setId(id);
//	    	Intent intent = new Intent(this, CriarAcademia.class);
//	    	startActivity(intent);
//		} else {
//			Toast toast = Toast.makeText(this.ctx, "Nome de usuario ou senha incorretos!", Toast.LENGTH_LONG);
//			toast.show();
//		}
//	}
	
	public void setValor(Object valor) {
		this.retorno = valor+"";
	}
}
