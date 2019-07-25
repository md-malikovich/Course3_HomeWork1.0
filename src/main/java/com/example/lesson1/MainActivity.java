package com.example.lesson1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView textView = findViewById(R.id.text);
        textView.setText("Hello Meder D!");
        Button button = findViewById(R.id.botton);
        button.setTag(1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("Button clicked");
                final int status =(Integer) v.getTag();
                if (status == 1) {
                    textView.setText("Button clicked");
                    v.setTag(0);
                } else {
                    textView.setText("Hello Meder D!");
                    v.setTag(1);
                }

            }
        });
    }
}
//                switch () {
//                    case 1: textView.setText("Button clicked");
//                    case 2: textView.setText("Hello Meder D!");
//                }
//
//                for(String i: array) {
//                    textView.setText(i);
//                    textView.setText("Button clicked");
//                    textView.setText("Hello Meder!");
//                    break;
//                }
//

//                 for (int i = 0; i < array.length; i++) {
//                    textView.setText(array[i]);
//                }

//
//                for(int i = 0; i<1; i++) {
//                    switch (v.getId()) {
//                        case R.id.text:
//                            textView.setText("Hello Meder D!");
//                        case R.id.botton:
//                            textView.setText("Button clicked");
//                    }
//                }