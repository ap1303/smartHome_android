package com.example.peizhizhang.smarthome;

import android.os.AsyncTask;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;

public class visitserver extends AsyncTask<URL, Void, Integer> {


    @Override
    protected Integer doInBackground(URL... urls) {
        HttpURLConnection urlConnection = null;
        URL url = urls[0];
        try {
            urlConnection = (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");
            urlConnection.setReadTimeout(10000);
            urlConnection.setConnectTimeout(60000);
            urlConnection.connect();
            InputStream is = urlConnection.getInputStream();
            while(is.available() != 0) {
                is.read();
            }
            is.close();
            urlConnection.disconnect();
        } catch(SocketTimeoutException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }
        return new Integer(1);
    }
}
