package com.example.user.myapplication1027;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    AutoCompleteTextView act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        act = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String[] data = {"aaa","aab","aac","abc","ccc","bbb","acc","bbc","cab"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(Main2Activity.this,
                android.R.layout.simple_spinner_item,data);
        act.setThreshold(1);
        act.setAdapter(adapter);
    }
    public void click1(View v)
    {
        Toast.makeText(Main2Activity.this,act.getText().toString(),
                Toast.LENGTH_SHORT).show();
    }
    public void click2(View v)
    {
        Intent it = new Intent(Main2Activity.this,Main3Activity.class);
        startActivity(it);
    }
}
