package com.example.calculation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button add_btn,sub_btn,mult_btn,div_btn,modul_btn,power_btn;
    EditText first_num,second_num;
    TextView display;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        first_num = (EditText)findViewById(R.id.number1);
        second_num = (EditText)findViewById(R.id.number2);
        display = (TextView)findViewById(R.id.result);


        //ADDITON BUTTON
        add_btn = (Button)findViewById(R.id.button_add);
        add_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int total = variable1+variable2;
                display.setText(String.valueOf(total));
            }
        });
        //SUBSTRACTION BUTTON
        sub_btn = (Button)findViewById(R.id.button_sub);
        sub_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int total = variable1-variable2;
                display.setText(String.valueOf(total));
            }
        });
        //DIVISION BUTTON
        div_btn = (Button)findViewById(R.id.button_div);
        div_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int Total = variable1/variable2;
                display.setText(String.valueOf(Total));
            }
        });
        //MULTIPLICATION BUTTON
        mult_btn = (Button)findViewById(R.id.button_multiply);
        mult_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int total = variable1*variable2;
                display.setText(String.valueOf(total));
            }
        });
        //MODULA BUTTON
        modul_btn = (Button)findViewById(R.id.button_modula);
        modul_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int total = variable1%variable2;
                display.setText(String.valueOf(total));
            }
        });
        //POWER BUTTON
        power_btn = (Button)findViewById(R.id.button_power);
        power_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variable1 = Integer.parseInt(first_num.getText().toString());
                int variable2 = Integer.parseInt(second_num.getText().toString());
                int total = ((int)Math.pow(variable1,variable2));
                display.setText(String.valueOf(total));
            }
        });
    }
}