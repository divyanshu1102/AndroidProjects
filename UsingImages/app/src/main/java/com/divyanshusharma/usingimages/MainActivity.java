package com.divyanshusharma.usingimages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;



public class MainActivity extends AppCompatActivity {
    int i=0;
    public void ButtonClicked(View view)
    {
        // Following code works when you have 2 images on the screen and one of them is set to VISIBLE and the other one is set to INVISIBLE
        // alternate clicks on the button switch between the 2 images
        /*
        Log.i("info", "button was clicked!, i="+i);
        ImageView imageView3 = (ImageView) findViewById(R.id.image1);
        ImageView imageView5 = (ImageView) findViewById(R.id.image2);
        if(i%2==0) {

            imageView3.setVisibility(View.INVISIBLE);
            imageView5.setVisibility(View.VISIBLE);
        }
        else {

            imageView3.setVisibility(View.VISIBLE);
            imageView5.setVisibility(View.INVISIBLE);
        }
        i++;
        if (i==10)
            i=0;
        */
        //--------------------------------------------------------------------

        // Following code works by REPLACING the image on screen with the newer one
        // alternate clicks on the button switch between the 2 images
        if (i%2==0) {
            ImageView image = (ImageView) findViewById(R.id.image1);
            image.setImageResource(R.drawable.example);
        }
        else
        {
            ImageView image = (ImageView) findViewById(R.id.image1);
            image.setImageResource(R.drawable.sign051);
        }
        i++;
        if (i==10)
            i=0;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
