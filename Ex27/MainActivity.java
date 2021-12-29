package com.cookandroid.ex2_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText text1;
    Button bt1, bt2;
    RadioGroup Rg;
    RadioButton Rb1, Rb2;
    ImageView image1 ;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText) findViewById(R.id.text1);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        Rg = (RadioGroup) findViewById(R.id.Rg);
        Rb1 = (RadioButton) findViewById(R.id.Rb1);
        Rb2 = (RadioButton) findViewById(R.id.Rb2);
        image1 = (ImageView) findViewById(R.id.image1);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), text1.getText(),
                        Toast.LENGTH_SHORT).show();

            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent netlntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse(text1.getText().toString()));
                startActivity(netlntent);

            }
        });

        Rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (Rg.getCheckedRadioButtonId()) {
                    case R.id.Rb1:
                        image1.setImageResource(R.drawable.image4);
                        break;

                    case R.id.Rb2:
                        image1.setImageResource(R.drawable.image1);
                        break;

                    default:
                }

            }
        });





    }
}

