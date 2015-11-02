package com.examplet.teste;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

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
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.examplet.rest.DataReturn;

public class MainActivity extends AppCompatActivity implements DataReturn {

	Button btnClick = null;
	EditText txtUsuario = null;
	EditText txtSenha = null;
	public String retorno;
	Context ctx;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.ctx = this.getApplicationContext();
        com.examplet.util.UserManager.getInstance(this.ctx);
        
        btnClick = (Button) findViewById(R.id.login);
//        if (restoredText != null) {
//        	this.btnAbrirNuevo(null);
//        } else {
//        	setContentView(R.layout.activity_main);
//        }
        setContentView(R.layout.activity_main);
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
		if (!this.retorno.equals("0")) {
			com.examplet.util.UserManager.getInstance().setUsuario(txtUsuario.getText().toString());
			int id = Integer.parseInt(this.retorno);
			com.examplet.util.UserManager.getInstance().setId(id);
	    	Intent intent = new Intent(this, CriarAcademia.class);
	    	startActivity(intent);
		} else {
			Toast toast = Toast.makeText(this.ctx, "Nome de usuario ou senha incorretos!", Toast.LENGTH_LONG);
			toast.show();
		}
	}
	
	public void setValor(Object valor) {
		this.retorno = valor+"";
	}
}
