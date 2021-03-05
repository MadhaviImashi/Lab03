package com.example.madtute1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    EditText et;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view) {

        Intent intent = new Intent(this, displayMsgActivity.class);
        et = findViewById(R.id.etMsg);
        String msg = et.getText().toString();
        intent.putExtra("EXTRA_MESSAGE", msg);
        startActivity(intent);
    }

}