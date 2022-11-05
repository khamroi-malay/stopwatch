package org.molokhamroi.stopwatch;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button b = findViewById(R.id.button_click_me);

        Context c = this;

        b.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Toast.makeText(c, "This is my Toast message!",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}