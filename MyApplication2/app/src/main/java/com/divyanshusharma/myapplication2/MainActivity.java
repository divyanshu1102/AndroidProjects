package com.divyanshusharma.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import static com.divyanshusharma.myapplication2.R.id.Password;

public class MainActivity extends AppCompatActivity {

    public void buttonClicked(View view)
    {
        EditText emailAddress=(EditText) findViewById(R.id.emailAddress);
        EditText password=(EditText) findViewById(Password);

        if ("".equals(emailAddress.getText().toString()) || "".equals(password.getText().toString()) )
        {
            Toast.makeText(MainActivity.this, "Enter Complete Information", Toast.LENGTH_LONG).show();
        }
        else
        {
            Toast.makeText(MainActivity.this,"Welcome "+emailAddress.getText().toString(),Toast.LENGTH_LONG).show();
        }
        Log.i("Info",emailAddress.getText().toString()+" and "+ password.getText().toString());
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
