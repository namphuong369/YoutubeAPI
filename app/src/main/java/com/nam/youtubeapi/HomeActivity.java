package com.nam.youtubeapi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class HomeActivity extends AppCompatActivity {
    EditText e1;
    TextView t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        e1=findViewById(R.id.e1);
        t1=findViewById(R.id.t1);
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(e1.getText().toString().trim().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"URL NULL",Toast.LENGTH_SHORT).show();
                }else{
                    Intent intent=new Intent(getApplicationContext(),MainActivity.class);
                    intent.putExtra("HOME",e1.getText().toString().trim());
                    startActivity(intent);
                }
            }
        });
    }
}