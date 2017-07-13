package com.example.calculatorapp;

import android.os.Bundle;
//import android.support.design.widget.FloatingActionButton;
//import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.example.calculatorapp.R;

public class MainActivity extends AppCompatActivity {
    private TextView screen;
    private String result, str = "", operator, str2;
    private double x, y;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);
        screen = (TextView) findViewById(R.id.screen);
    }

    public void onClickNum(View view) {
        Button b = (Button) view;
        str += b.getText().toString();
        screen.setText(str);
        y = Double.parseDouble(str);
    }

    public void onClickOperator(View view) {
        Button b = (Button) view;
        x = Double.parseDouble(screen.getText().toString());
        operator = b.getText().toString();
        screen.setText(operator);
        str = "";
    }

    public void calculate(View view) {
        Button b = (Button) view;
        str2 = screen.getText().toString();
        y = Double.parseDouble(str2);
        switch (operator) {
            case "+":
                result = x + y + "";
                break;
            case "-":
                result = x - y + "";
                break;
            case "*":
                result = x * y + "";
                break;
            case "/":
                result = x / y + "";
                break;
            default:
                result = 0 + "";
        }
        screen.setText(result);
        str = "";
        x = 0;
        y = 0;

    }

    public void clear(View view) {
        screen.setText("0");
        str = "";
        x = 0;
        y = 0;
    }
}
/*
   @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
*/
