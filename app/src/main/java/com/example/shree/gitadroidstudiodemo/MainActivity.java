package com.example.shree.gitadroidstudiodemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    /**
     * Added by shree
     */
    private void initView() {
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
         Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
        Toast.makeText(this, "Hello", Toast.LENGTH_SHORT).show();
    }
}
