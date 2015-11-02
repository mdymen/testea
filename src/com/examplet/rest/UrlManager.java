package com.examplet.rest;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class UrlManager {

	private HttpURLConnection conn;
	private URL url;
	
	public UrlManager(String action, String variaveis) throws IOException {
        this.url = new URL("http://www.worldfight.com.br/public/agt/"+action+"?"+variaveis);
        this.conn = (HttpURLConnection) url.openConnection();
        conn.setReadTimeout(10000);
        conn.setConnectTimeout(15000);
        conn.setRequestMethod("POST");
        conn.setDoInput(true);
        conn.setDoOutput(true);

	}
	
	public HttpURLConnection getConn() {
		return this.conn;
	}
}
