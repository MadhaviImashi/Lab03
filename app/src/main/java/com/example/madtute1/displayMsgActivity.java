package com.example.madtute1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class displayMsgActivity extends AppCompatActivity {

    TextView txtDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_msg);

        txtDisplay = findViewById(R.id.tvDisplay);
        Intent newIntent= getIntent();
        String message = newIntent.getStringExtra("EXTRA_MESSAGE");
        txtDisplay.setText(message);
    }
}