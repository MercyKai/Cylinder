package com.dummies.android.surfaceareavolumeapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText radius = findViewById(R.id.radius);
        EditText height = findViewById(R.id.height);
        Button calculateBtn = findViewById(R.id.calculateBtn);
        TextView areaView = findViewById(R.id.areaView);
        TextView volumeView = findViewById(R.id.volumeView);

        calculateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String n1 = radius.getText().toString();
                String n2 = height.getText().toString();

                double radius = Double.parseDouble(n1);
                double height = Double.parseDouble(n2);

                if (n1.isEmpty() || n2.isEmpty()) {
                    areaView.setText("Fill all fields");
                    volumeView.setText("Fill all fields");
                } else {
                    double area = 2 * Math.PI * radius * (radius + height);
                    String s1 = String.valueOf(area);
                    areaView.setText(s1);

                    double volume = Math.PI * radius * radius * height;
                    String s2 = String.valueOf(volume);
                    volumeView.setText(s2);
                }
            }
        });
    }
}