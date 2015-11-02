package com.examplet.teste;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignIn extends AppCompatActivity {

	EditText txtUsuario = null;
	EditText txtSenha = null;
	EditText txtCep = null;
	EditText txtEmail = null;
	Button btnCadastrase = null;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sign_in);
	}
	
	public void btnCadastrar(View view) {
		txtUsuario = (EditText) findViewById(R.id.txtUsuario);
		txtSenha = (EditText) findViewById(R.id.txtSenha);
		txtCep = (EditText) findViewById(R.id.txtCep);
		txtEmail = (EditText) findViewById(R.id.txtEmail);
		
		new Sendpost().execute(txtUsuario.getText().toString(), txtSenha.getText().toString(), txtCep.getText().toString(), txtEmail.getText().toString());
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sign_in, menu);
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
