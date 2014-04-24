package com.newlinecharacter.www.app.adaptor;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.newlinecharacter.www.app.R;

public class PhotoImageAdapter extends BaseAdapter {
    private Context mContext;

    public PhotoImageAdapter(Context c) {
        mContext = c;
    }

    public int getCount() {
        return mThumbIds.length;
    }

    public Object getItem(int position) {
        return mThumbIds[position];
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;
        if (convertView == null) {  // if it's not recycled, initialize some attributes
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(400, 400));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(0, 0, 0, 0);
        } else {
            imageView = (ImageView) convertView;
        }

        imageView.setImageResource(mThumbIds[position]);
//        imageView.setOnClickListener(new OnImageClickListener(position));
        return imageView;
    }

    public static Integer[] mThumbIds = {
            R.drawable.imb1, R.drawable.imb2,
            R.drawable.imb3, R.drawable.imb4,
            R.drawable.imb5, R.drawable.imb6,
            R.drawable.imb7, R.drawable.imb8,
            R.drawable.imb9, R.drawable.imb10,
            R.drawable.imb11, R.drawable.imb12,
            R.drawable.imb13, R.drawable.imb14,
            R.drawable.imb15, R.drawable.imb16,
            R.drawable.imb17, R.drawable.imb18,
            R.drawable.imb19, R.drawable.imb20,
            R.drawable.imb21, R.drawable.imb22,
    };

//    public Integer[] mThumbIds = {
//
//        R.drawable.ima1,
//
//                R.drawable.ima2,
//
//                R.drawable.ima3,
//
//                R.drawable.ima4,
//
//                R.drawable.ima5,
//
//                R.drawable.ima6,
//
//                R.drawable.ima7,
//
//                R.drawable.ima8,
//
//                R.drawable.ima9,
//
//                R.drawable.ima10,
//
//                R.drawable.ima11,
//
//                R.drawable.ima12,
//
//                R.drawable.ima13,
//
//                R.drawable.ima14,
//
//                R.drawable.ima15,
//
//                R.drawable.ima16,
//
//                R.drawable.ima17,
//
//                R.drawable.ima18,
//
//                R.drawable.ima19,
//
//                R.drawable.ima20,
//
//            R.drawable.ima21,
//
//            R.drawable.ima22
//
//    };
}







//package com.example.www.app.adaptor;
//
//import android.content.Context;
//import android.graphics.Bitmap;
//import android.graphics.BitmapFactory;
//import android.os.AsyncTask;
//import android.os.StrictMode;
//import android.util.Log;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.BaseAdapter;
//import android.widget.GridView;
//import android.widget.ImageView;
//
//import java.io.BufferedInputStream;
//import java.io.IOException;
//import java.io.InputStream;
//import java.net.HttpURLConnection;
//import java.net.URL;
//import java.net.URLConnection;
//
///**
// * Created by nikhil.bansal on 23/04/14.
// */
//public class PhotoImageAdapter extends BaseAdapter {
//    private Context mContext;
//
//    public PhotoImageAdapter(Context c) {
//        StrictMode.ThreadPolicy policy =
//                new StrictMode.ThreadPolicy.Builder().permitAll().build();
//        StrictMode.setThreadPolicy(policy);
//        mContext = c;
//    }
//
//    public int getCount() {
//        return mThumbIds.length;
//    }
//
//    public Object getItem(int position) {
//        return null;
//    }
//
//    public long getItemId(int position) {
//        return 0;
//    }
//
//    ImageView imageView;
//    public View getView(int position, View convertView, ViewGroup parent) {
//        if (convertView == null) {  // if it's not recycled, initialize some attributes
//            imageView = new ImageView(mContext);
//            imageView.setLayoutParams(new GridView.LayoutParams(85, 85));
//            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
//            imageView.setPadding(8, 8, 8, 8);
//        } else {
//            imageView = (ImageView) convertView;
//        }
//
//        //imageView.setImageResource(mThumbIds[position]);
//        //imageView.setImageBitmap(getImageBitmap("http://upload.wikimedia.org/wikipedia/commons/d/dd/Birthday_candles.jpg"));
//        GetXMLTask task = new GetXMLTask();
//        // Execute the task
//        task.execute(new String[] { "" });
//        return imageView;
//    }
//
//    private Integer[] mThumbIds = {1, 2, 3, 4, 5, 6
////            R.drawable.sample_2, R.drawable.sample_3,
////            R.drawable.sample_4, R.drawable.sample_5,
////            R.drawable.sample_6, R.drawable.sample_7,
////            R.drawable.sample_0, R.drawable.sample_1,
////            R.drawable.sample_2, R.drawable.sample_3,
////            R.drawable.sample_4, R.drawable.sample_5,
////            R.drawable.sample_6, R.drawable.sample_7,
////            R.drawable.sample_0, R.drawable.sample_1,
////            R.drawable.sample_2, R.drawable.sample_3,
////            R.drawable.sample_4, R.drawable.sample_5,
////            R.drawable.sample_6, R.drawable.sample_7
//    };
//
////    private Bitmap getImageBitmap(String url) {
////        Bitmap bm = null;
////        try {
////            URL aURL = new URL(url);
////            URLConnection conn = aURL.openConnection();
////            try {
////                conn.connect();
////            } catch (IOException e) {
////                e.printStackTrace();
////            }
////            InputStream is = conn.getInputStream();
////            BufferedInputStream bis = new BufferedInputStream(is);
////            bm = BitmapFactory.decodeStream(bis);
////            bis.close();
////            is.close();
////        } catch (IOException e) {
////            Log.e("TAG", "Error getting bitmap", e);
////        }
////        return bm;
////    }
//
//    private class GetXMLTask extends AsyncTask<String, Void, Bitmap> {
//        @Override
//        protected Bitmap doInBackground(String... urls) {
//            Bitmap map = null;
//            for (String url : urls) {
//                map = getImageBitmap("http://upload.wikimedia.org/wikipedia/commons/d/dd/Birthday_candles.jpg");
//            }
//            return map;
//        }
//
//        // Sets the Bitmap returned by doInBackground
//        @Override
//        protected void onPostExecute(Bitmap result) {
////            view.setImageBitmap(result);
//            imageView.setImageBitmap(getImageBitmap("http://upload.wikimedia.org/wikipedia/commons/d/dd/Birthday_candles.jpg"));
//        }
//
//        private Bitmap getImageBitmap(String url) {
//            Bitmap bm = null;
//            try {
//                URL aURL = new URL(url);
//                URLConnection conn = aURL.openConnection();
//                try {
//                    conn.connect();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//                InputStream is = conn.getInputStream();
//                BufferedInputStream bis = new BufferedInputStream(is);
//                bm = BitmapFactory.decodeStream(bis);
//                bis.close();
//                is.close();
//            } catch (IOException e) {
//                Log.e("TAG", "Error getting bitmap", e);
//            }
//            return bm;
//        }
//    }
//}
