package com.cookandroid.dec28;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                출력될컨텍스트, 메시지 내용, 출력할 시간
                Toast.makeText(getApplicationContext(), "버튼클릭함",
                        Toast.LENGTH_SHORT).show();

            }
        });
    }
}
