package com.example.kiran.listviewexample;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

/**
 * Created by Kiran on 24-11-2015.
 */
public class imagedisplay extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imageviewdisplayonclick);
        ImageView iv=(ImageView)findViewById(R.id.IMdisplayonclick);
        Intent i =getIntent();
        int i_name=i.getIntExtra("imagename",0);
        iv.setImageResource(imageviewstring.imV_ides[i_name]);

    }
}
