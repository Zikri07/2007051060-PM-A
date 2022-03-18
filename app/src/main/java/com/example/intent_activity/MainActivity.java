package com.example.intent_activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btnMove);
        Button btnShare = findViewById(R.id.btnShare);

        btnMove.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            startActivity(new Intent(MainActivity.this, DetailActivity.class));
            }
        });

        btnShare.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              Intent intent = new Intent(Intent.ACTION_SEND);

              intent.putExtra(intent.EXTRA_TEXT,"Hallo saya share ke sosial media");
                intent.setType("text/plain");

            startActivity(Intent.createChooser(intent,"Share to :"));
            }
        });

    }
}