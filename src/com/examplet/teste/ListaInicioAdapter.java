package com.examplet.teste;

import java.util.List;

import com.examplet.entidades.LutaTO;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class ListaInicioAdapter extends ArrayAdapter<LutaTO>{

	private Activity context;
	private List<LutaTO> lutas;
	
	public ListaInicioAdapter(Activity context, List<LutaTO> lutas) {
		super(context, R.id.list, lutas);
		// TODO Auto-generated constructor stub
		try {
			this.context = (Activity) context;
			this.lutas = lutas;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	public View getView(int position,View view,ViewGroup parent) {
		try {
			LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			View rowView = inflater.inflate(R.layout.item_inicio, parent,false);
			
			TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
			
			txtTitle.setText(lutas.get(position).toString());
	
			return rowView;
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return null;
		
	};
}
