package com.divyanshusharma.numbershapes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    Spinner American_spinner,Metric_spinner;
    String American_option=null,metric_option=null;
    TextView american_unit,american_text;
    TextView metric_unit,metric_text;

    ArrayAdapter<CharSequence> adapter_american;
    ArrayAdapter<CharSequence> adapter_metric;


    public void ToastMessage(String str)
    {
        Toast toastSpinnerSelection = Toast.makeText(getApplicationContext(),str, Toast.LENGTH_SHORT);
        toastSpinnerSelection.setGravity(Gravity.LEFT|Gravity.BOTTOM,20,150);
        toastSpinnerSelection.show();
    }

    public void swapClicked(View view)
    {
        Log.i("Info","Switch Units Clicked");

        String temp= (String)metric_text.getText();
        metric_text.setText((String)american_text.getText());
        american_text.setText(temp);


        ArrayAdapter<CharSequence> tempAdapter=adapter_metric;
        adapter_metric=adapter_american;
        adapter_american=tempAdapter;

        Metric_spinner.setAdapter(adapter_metric);
        American_spinner.setAdapter(adapter_american);

    }

    public void ConvertButtonClicked(View view)
    {
        Log.i("Info","Convert Button Clicked");

        /*-------------------------------------------
        String temp;
        temp= (String)metric_text.getText();
        metric_text.setText((String)american_text.getText());
        american_text.setText(temp);
        */


        EditText input=(EditText) findViewById(R.id.input);
        TextView output=(TextView) findViewById(R.id.output);
        double inputData=0;

        try
        {
            inputData= Double.parseDouble(input.getText().toString());
        }
        catch(Exception e)
        {
            ToastMessage("Input?");
            metric_unit.setText("");
            output.setText("");
        }


            if (American_option.equals("Miles")) {
                if (metric_option.equals("Meters")) {
                    metric_unit.setText("Meters");
                    output.setText("" + inputData * 1609.34);
                } else if (metric_option.equals("Km")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 1.60934);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }
            } else if (American_option.equals("Feet")) {
                if (metric_option.equals("Meters")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.3048);
                } else if (metric_option.equals("Km")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.0003048);
                } else if (metric_option.equals("cm")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 30.48);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }

            } else if (American_option.equals("Inches")) {
                if (metric_option.equals("Meters")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.0254);
                } else if (metric_option.equals("Km")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 2.54e-5);
                } else if (metric_option.equals("cm")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 2.54);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }

            } else if (American_option.equals("mph")) {
                if (metric_option.equals("kph")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 1.60934);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }
            } else if (American_option.equals("Fahrenheit")) {
                if (metric_option.equals("Celsius")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + (inputData * 9 / 5 + 32));
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }

            } else if (American_option.equals("Pounds")) {
                if (metric_option.equals("Kg")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.453592);
                } else if (metric_option.equals("g")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 453.592);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }

            } else if (American_option.equals("Stones")) {
                if (metric_option.equals("Kg")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 6.35029);
                } else if (metric_option.equals("g")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 6350.29);
                }

            } else if (American_option.equals("Ounces(Oz)")) {
                if (metric_option.equals("Kg")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.0283495);
                } else if (metric_option.equals("g")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 28.3495);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }

            } else if (American_option.equals("fl. Oz")) {
                if (metric_option.equals("Litres")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.0295735);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }
            } else if (American_option.equals("gallons")) {
                if (metric_option.equals("Litres")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 3.78541);
                } else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }
            } else if (American_option.equals("Kg")) {
                if (metric_option.equals("Pounds")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 2.20462);
                }
                else if (metric_option.equals("Stones")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 0.157473);
                }
                else if (metric_option.equals("Ounces(Oz)")) {
                    metric_unit.setText(metric_option);
                    output.setText("" + inputData * 35.274);
                }
                else {
                    ToastMessage("Wrong Options");
                    metric_unit.setText("Error!");
                    output.setText("Error!");

                }
            }



            else {
                ToastMessage("Wrong Options");
                metric_unit.setText("Error!");
                output.setText("Error!");
            }




    }


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        american_unit=(TextView) findViewById(R.id.american_unit);
        metric_unit=(TextView) findViewById(R.id.metric_unit);

        american_text=(TextView) findViewById(R.id.american_textView);
        metric_text=(TextView) findViewById(R.id.metric_textView);

        American_spinner = (Spinner) findViewById(R.id.american);   // Create an ArrayAdapter using the string array and a default spinner layout
        adapter_american = ArrayAdapter.createFromResource(this, R.array.American_Units, android.R.layout.simple_spinner_item);  // Specify the layout to use when the list of choices appears
        adapter_american.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);    // Apply the adapter to the spinner
        American_spinner.setAdapter(adapter_american);


        Metric_spinner = (Spinner) findViewById(R.id.metric);
        adapter_metric = ArrayAdapter.createFromResource(this, R.array.Metric_Units, android.R.layout.simple_spinner_item);
        adapter_metric.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Metric_spinner.setAdapter(adapter_metric);

        American_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                //We are here that means an item was selected
                //Now we retrieve the user selection
                //Get the selected item text
                String selectedItemText = parent.getItemAtPosition(pos).toString();
                American_option=selectedItemText;
                ToastMessage(selectedItemText);
                american_unit.setText(American_option);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){
                Log.i("Info","Nothing was selected.");
            }

        });

        Metric_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener(){

            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int pos, long id){
                //We are here that means an item was selected
                //Now we retrieve the user selection
                //Get the selected item text
                String selectedItemText = parent.getItemAtPosition(pos).toString();
                metric_option=selectedItemText;
                ToastMessage(selectedItemText);

            }

            @Override
            public void onNothingSelected(AdapterView<?> parent){
                Log.i("Info","Nothing was selected.");
                //Another interface callback
            }

        });


    }



}
