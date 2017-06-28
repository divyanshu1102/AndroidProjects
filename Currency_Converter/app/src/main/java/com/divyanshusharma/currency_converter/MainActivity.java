package com.divyanshusharma.currency_converter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;


public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view)
    {
        Log.i("Information","Button was Clicked!");

        TextView tv = (TextView)findViewById(R.id.textView2);
        EditText DollarAmount=(EditText) findViewById(R.id.DollarAmount);
        double input= Double.parseDouble(DollarAmount.getText().toString());

        tv.setText("INR: "+input*64.45);

        Toast.makeText(MainActivity.this,"INR: "+input*64.45,Toast.LENGTH_LONG).show();

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
