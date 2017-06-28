package com.divyanshusharma.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Random rand = new Random();
    int n = rand.nextInt(20) + 1;

    public void CreateToast(String str)
    {
        Toast.makeText(MainActivity.this,str, Toast.LENGTH_SHORT).show();

    }
    public void resetClicked(View view) {

        rand = new Random();
        n = rand.nextInt(20) + 1;
    }

    public void buttonClicked(View view)
    {
        Log.i("Info.","Button was Clicked!");

        String message=null;

        EditText editText2=(EditText) findViewById(R.id.editText2);

        int guess= Integer.parseInt(editText2.getText().toString());

        if (guess>n && guess<=20)
        {
            message="Guess Smaller!";
        }
        else if(guess<n && guess>=1)
        {
            message="Guess Larger!";
        }
        else if(guess==n)
        {
            message="Correct Guess!";
        }
        else
        {
            message="Wrong Input!";
        }

        CreateToast(message);

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
