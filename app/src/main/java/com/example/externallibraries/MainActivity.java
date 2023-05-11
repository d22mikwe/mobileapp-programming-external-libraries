package com.example.externallibraries;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Intent intent;
    private Button buttonTopLeft;
    private Button buttonTopRight;
    private Button buttonBottomLeft;
    private Button buttonBottomRight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent = new Intent(MainActivity.this, ImageActivity.class);

        buttonBottomLeft = (Button) findViewById(R.id.buttonBottomLeft);
        buttonBottomRight = (Button) findViewById(R.id.buttonBottomRight);
        buttonTopLeft = (Button) findViewById(R.id.buttonTopLeft);
        buttonTopRight = (Button) findViewById(R.id.buttonTopRight);

        buttonBottomLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras1 = new Bundle();
                extras1.putString("URL", "");
                intent.putExtras(extras1);
                startActivity(intent);
            }
        });

        buttonBottomRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras2 = new Bundle();
                extras2.putString("URL", "");
                intent.putExtras(extras2);
                startActivity(intent);
            }
        });

        buttonTopLeft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras3 = new Bundle();
                extras3.putString("URL", "");
                intent.putExtras(extras3);
                startActivity(intent);
            }
        });

        buttonTopRight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle extras4 = new Bundle();
                extras4.putString("URL", "");
                intent.putExtras(extras4);
                startActivity(intent);
            }
        });
    }
}
