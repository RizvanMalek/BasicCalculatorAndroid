package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    EditText et1,et2,etResult;
    Button btnAdd,btnSub,btnMul,btnClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        etResult = findViewById(R.id.etResult);

        btnAdd = findViewById(R.id.btnAdd);
        btnSub = findViewById(R.id.btnSub);
        btnMul = findViewById(R.id.btnMul);
        btnClear = findViewById(R.id.btnClear);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,add;
                try {
                    n1 = Integer.parseInt(et1.getText().toString());
                    n2 = Integer.parseInt(et2.getText().toString());
                    add = n1+n2;
                    etResult.setText(Double.toString(add));
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                et1.setText("");
                et2.setText("");
                etResult.setText("");
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,sub;
                try {
                    n1 = Integer.parseInt(et1.getText().toString());
                    n2 = Integer.parseInt(et2.getText().toString());
                    sub = n1-n2;
                    etResult.setText(Double.toString(sub));
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_LONG).show();
                }
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double n1,n2,mul;
                try {
                    n1 = Integer.parseInt(et1.getText().toString());
                    n2 = Integer.parseInt(et2.getText().toString());
                    mul = n1*n2;
                    etResult.setText(Double.toString(mul));
                }
                catch (Exception e)
                {
                    Toast.makeText(getApplicationContext(),"Something Went Wrong",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}





