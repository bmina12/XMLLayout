package com.example.xmllayout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    EditText txtCost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg= findViewById(R.id.rgTipAmount);
        Button btn= findViewById(R.id.btnCalculate);
        RadioButton rbOK=
        RadioGroup rg= findViewById(R.id.rgTipAmount);
        txtCost=findViewById(R.id.txtCostOfService);
        btn.setOnClickListenew OnClickListener(){
        @Override                   }
        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener(){
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId){
                switch (checkedId){
                    case R.id.rdoAmazing:
                        Toast.makeTest( context MainActivity.this, int "Amazing clicked", Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rdoGood:
                        Toast.makeTest(context MainActivity.this, int "Good Clicked", Toast.LENGTH_SHORT).show();
                    case R.id.rdoOK:
                        Toast.makeText(context MainActivity.this, int"OK Clicked", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}