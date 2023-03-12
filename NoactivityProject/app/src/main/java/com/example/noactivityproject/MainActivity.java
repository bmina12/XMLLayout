package com.example.noactivityproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Button btn= findViewById(R.id.button2);
        //btn.setOnClickListener(new View.OnClickListener(){
          //  @Override
           // public void onClick(View v){
             //   EditText txtName= findViewById(R.id.editTextPersonName);
             //   Toast toast = Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG);
              //  toast.setMargin(50 ,50);
              //  toast.show();
          //  }
       // });

    }
    public void myButtonClick(View v){
        EditText txtName= findViewById(R.id.editTextPersonName);
        Toast toast = Toast.makeText(getApplicationContext(), "Button Clicked", Toast.LENGTH_LONG);
        toast.setMargin(50 ,50);
        toast.show();
    }
}