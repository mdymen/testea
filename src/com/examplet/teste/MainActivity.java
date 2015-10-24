package com.examplet.teste;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import android.support.v7.app.AppCompatActivity;
import android.content.ContentValues;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

	Button btnClick = null;
	EditText txtUsuario = null;
	EditText txtSenha = null;
	public static final String AGT = "AGT";
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SharedPreferences settings = getSharedPreferences(AGT,0);
        
        btnClick = (Button) findViewById(R.id.login);
        settings = getSharedPreferences(AGT,0);
        String restoredText = settings.getString("usuario", null);
        
        if (restoredText != null) {
//        	Editor editor = settings.edit();
//        	editor.putString("name", null);
//        	editor.commit();
        	this.btnAbrirNuevo(null);
        } else {
        	setContentView(R.layout.activity_main);
        }
    }
    
    public void btnLoginClick(View view) {
    	  txtUsuario = (EditText) findViewById(R.id.usuario);
          txtSenha = (EditText) findViewById(R.id.senha);
        
    	String[] args = new String[] {txtUsuario.getText().toString(),txtSenha.getText().toString() };
    	new Sendpost().execute(args);
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
}
