package com.example.eziam;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomePageActivity extends AppCompatActivity {

    Button visitorReg, visitorLog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        visitorReg = findViewById(R.id.visitor_registration);
        visitorLog = findViewById(R.id.visitor_logs);

        visitorReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });

        visitorLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HomePageActivity.this, VisitorLogActivity.class);
                startActivity(intent);
            }
        });
    }
}
