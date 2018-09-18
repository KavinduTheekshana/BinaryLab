package com.industrialmaster.binarylab;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.TYPE_INPUT_METHOD_DIALOG);
        setContentView(R.layout.activity_main);

    }


    public void converttodecimal(View view){
        try {
            EditText editText = findViewById(R.id.txtInputBinary);
            EditText editText1 = findViewById(R.id.txtInputDecimal);
            String text= editText.getText().toString();
            int decimalValue = Integer.parseInt(text, 2);
            editText1.setText(String.valueOf(decimalValue));
        }catch (Exception e){

        }


    }



}
