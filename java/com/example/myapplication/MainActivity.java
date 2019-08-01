package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText editText;
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.button);
        editText=findViewById(R.id.edittext);
    }
    public void screen1(View view){
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
         String value=editText.getText().toString();
        intent.putExtra("name",value);
        startActivity(intent);
    }
}
