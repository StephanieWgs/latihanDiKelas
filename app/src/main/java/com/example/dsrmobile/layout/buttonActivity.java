package com.example.dsrmobile.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class buttonActivity extends AppCompatActivity {

    Button supabutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button);
        supabutton = (Button) findViewById(R.id.supabutton);
        supabutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("BUTTONS", "Button supa di-klik");
            }
        });
    }
}