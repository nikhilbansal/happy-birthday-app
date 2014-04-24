//package com.example.helloworld.app.utils;
//
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.os.AsyncTask;
//
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLConnection;
//
///**
// * Created by nikhil.bansal on 23/04/14.
// */
//public class GetXMLTask extends AsyncTask<String, Void, Bitmap> {
//    @Override
//    protected Bitmap doInBackground(String... urls) {
//        Bitmap map = null;
//        for (String url : urls) {
//            map = downloadImage(url);
//        }
//        return map;
//    }
//
//    // Sets the Bitmap returned by doInBackground
//    @Override
//    protected void onPostExecute(Bitmap result) {
//        imageView.setImageBitmap(result);
//    }
//
//    // Creates Bitmap from InputStream and returns it
//    private Bitmap downloadImage(String url) {
//        Bitmap bitmap = null;
//        InputStream stream = null;
//        BitmapFactory.Options bmOptions = new BitmapFactory.Options();
//        bmOptions.inSampleSize = 1;
//
//        try {
//            stream = getHttpConnection(url);
//            bitmap = BitmapFactory.
//                    decodeStream(stream, null, bmOptions);
//            stream.close();
//        } catch (IOException e1) {
//            e1.printStackTrace();
//        }
//        return bitmap;
//    }
//
//    // Makes HttpURLConnection and returns InputStream
//    private InputStream getHttpConnection(String urlString)
//            throws IOException {
//        InputStream stream = null;
//        URL url = new URL(urlString);
//        URLConnection connection = url.openConnection();
//
//        try {
//            HttpURLConnection httpConnection = (HttpURLConnection) connection;
//            httpConnection.setRequestMethod("GET");
//            httpConnection.connect();
//
//            if (httpConnection.getResponseCode() == HttpURLConnection.HTTP_OK) {
//                stream = httpConnection.getInputStream();
//            }
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
//        return stream;
//    }
//}