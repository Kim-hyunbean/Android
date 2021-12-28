package com.cookandroid.a4button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3, button4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);
        button1.setBackgroundColor(Color.WHITE);
        button2 = (Button) findViewById(R.id.button2);
        button2.setBackgroundColor(Color.RED);
        button3 = (Button) findViewById(R.id.button3);
        button3.setBackgroundColor(Color.BLUE);
        button4 = (Button) findViewById(R.id.button4);
        button4.setBackgroundColor(Color.YELLOW);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netlntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.youtube.com/"));
                startActivity(netlntent);

            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent tellntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("tel:/911"));
                startActivity(tellntent);

            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gallntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("content://media/internal/images/media"));
                startActivity(gallntent);

            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();


            }
        });
    }
}
