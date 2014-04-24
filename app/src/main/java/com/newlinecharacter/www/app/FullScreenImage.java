package com.newlinecharacter.www.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import com.newlinecharacter.www.app.adaptor.PhotoImageAdapter;

/**
 * Created by nikhil.bansal on 23/04/14.
 */
public class FullScreenImage extends Activity
{
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_fullscreen_image);
        Intent intent = getIntent();
        int imageId = (Integer) intent.getExtras().get("id");
        ImageView imageView = (ImageView)this.findViewById(R.id.imageView2);

        //imageView.setLayoutParams( new ViewGroup.LayoutParams(WindowManager.LayoutParams.MATCH_PARENT, WindowManager.LayoutParams.MATCH_PARENT));

        imageView.setImageResource(PhotoImageAdapter.mThumbIds[imageId]);
        imageView.setScaleType(ImageView.ScaleType.FIT_XY);

    }
}