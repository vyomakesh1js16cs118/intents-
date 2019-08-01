package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
   TextView textView;
   Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        button=findViewById(R.id.button2);
        textView=findViewById(R.id.textView);
        String myvalue=getIntent().getStringExtra("name");
        textView.setText(myvalue);

    }public void screen2(View view){
        Intent intent=new Intent(Main2Activity.this,MainActivity.class);
        startActivity(intent);
    }
}
