package com.example.androidgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int[][] array = new int[4][4];


        Button b0 = findViewById(R.id.b0);
        Button b1 = findViewById(R.id.b1);
        Button b2 = findViewById(R.id.b2);
        Button b3 = findViewById(R.id.b3);
        Button b4 = findViewById(R.id.b4);
        Button b5 = findViewById(R.id.b5);
        Button b6 = findViewById(R.id.b6);
        Button b7 = findViewById(R.id.b7);
        Button b8 = findViewById(R.id.b8);
        Button b9 = findViewById(R.id.b9);
        Button b10 = findViewById(R.id.b10);
        Button b11 = findViewById(R.id.b11);
        Button b12 = findViewById(R.id.b12);
        Button b13 = findViewById(R.id.b13);
        Button b14 = findViewById(R.id.b14);
        Button b15 = findViewById(R.id.b15);

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Button btn = (Button) view;

                int visb0 = b0.getVisibility();
                int visb1 = b1.getVisibility();
                int visb2 = b2.getVisibility();
                int visb3 = b3.getVisibility();
                int visb4 = b4.getVisibility();
                int visb5 = b5.getVisibility();
                int visb6 = b6.getVisibility();
                int visb7 = b7.getVisibility();
                int visb8 = b8.getVisibility();
                int visb9 = b9.getVisibility();
                int visb10 = b10.getVisibility();
                int visb11 = b11.getVisibility();
                int visb12 = b12.getVisibility();
                int visb13 = b13.getVisibility();
                int visb14 = b14.getVisibility();
                int visb15 = b15.getVisibility();

                switch (view.getId()) {
                    case R.id.b0:
                        if (visb0 == View.VISIBLE && visb1 == View.INVISIBLE) {
                            b0.setVisibility(View.INVISIBLE);
                            b1.setVisibility(View.VISIBLE);
                            b1.setText(btn.getText());
                        }
                        if (visb0 == View.VISIBLE && visb4 == View.INVISIBLE) {
                            b0.setVisibility(View.INVISIBLE);
                            b4.setVisibility(View.VISIBLE);
                            b4.setText(btn.getText());
                        }
                        break;
                    case R.id.b1:
                        if (visb1 == View.VISIBLE && visb0 == View.INVISIBLE) {
                            b1.setVisibility(View.INVISIBLE);
                            b0.setVisibility(View.VISIBLE);
                            b0.setText(btn.getText());
                        }
                        if (visb1 == View.VISIBLE && visb2 == View.INVISIBLE) {
                            b1.setVisibility(View.INVISIBLE);
                            b2.setVisibility(View.VISIBLE);
                            b2.setText(btn.getText());
                        }
                        if (visb1 == View.VISIBLE && visb5 == View.INVISIBLE) {
                            b1.setVisibility(View.INVISIBLE);
                            b5.setVisibility(View.VISIBLE);
                            b5.setText(btn.getText());
                        }
                        break;
                    case R.id.b2:
                        if (visb2 == View.VISIBLE && visb1 == View.INVISIBLE) {
                            b2.setVisibility(View.INVISIBLE);
                            b1.setVisibility(View.VISIBLE);
                            b1.setText(btn.getText());
                        }
                        if (visb2 == View.VISIBLE && visb3 == View.INVISIBLE) {
                            b2.setVisibility(View.INVISIBLE);
                            b3.setVisibility(View.VISIBLE);
                            b3.setText(btn.getText());
                        }
                        if (visb2 == View.VISIBLE && visb6 == View.INVISIBLE) {
                            b2.setVisibility(View.INVISIBLE);
                            b6.setVisibility(View.VISIBLE);
                            b6.setText(btn.getText());
                        }
                        break;
                    case R.id.b3:
                        if (visb3 == View.VISIBLE && visb2 == View.INVISIBLE) {
                            b3.setVisibility(View.INVISIBLE);
                            b2.setVisibility(View.VISIBLE);
                            b2.setText(btn.getText());
                        }
                        if (visb3 == View.VISIBLE && visb7 == View.INVISIBLE) {
                            b3.setVisibility(View.INVISIBLE);
                            b7.setVisibility(View.VISIBLE);
                            b7.setText(btn.getText());
                        }
                        break;
                    case R.id.b4:
                        if (visb4 == View.VISIBLE && visb0 == View.INVISIBLE) {
                            b4.setVisibility(View.INVISIBLE);
                            b0.setVisibility(View.VISIBLE);
                            b0.setText(btn.getText());
                        }
                        if (visb4 == View.VISIBLE && visb5 == View.INVISIBLE) {
                            b4.setVisibility(View.INVISIBLE);
                            b5.setVisibility(View.VISIBLE);
                            b5.setText(btn.getText());
                        }
                        if (visb4 == View.VISIBLE && visb8 == View.INVISIBLE) {
                            b4.setVisibility(View.INVISIBLE);
                            b8.setVisibility(View.VISIBLE);
                            b8.setText(btn.getText());
                        }
                        break;
                    case R.id.b5:
                        if (visb5 == View.VISIBLE && visb1 == View.INVISIBLE) {
                            b5.setVisibility(View.INVISIBLE);
                            b1.setVisibility(View.VISIBLE);
                            b1.setText(btn.getText());
                        }
                        if (visb5 == View.VISIBLE && visb4 == View.INVISIBLE) {
                            b5.setVisibility(View.INVISIBLE);
                            b4.setVisibility(View.VISIBLE);
                            b4.setText(btn.getText());
                        }
                        if (visb5 == View.VISIBLE && visb6 == View.INVISIBLE) {
                            b5.setVisibility(View.INVISIBLE);
                            b6.setVisibility(View.VISIBLE);
                            b6.setText(btn.getText());
                        }
                        if (visb5 == View.VISIBLE && visb9 == View.INVISIBLE) {
                            b5.setVisibility(View.INVISIBLE);
                            b9.setVisibility(View.VISIBLE);
                            b9.setText(btn.getText());
                        }
                        break;
                    case R.id.b6:
                        if (visb6 == View.VISIBLE && visb2 == View.INVISIBLE) {
                            b6.setVisibility(View.INVISIBLE);
                            b2.setVisibility(View.VISIBLE);
                            b2.setText(btn.getText());
                        }
                        if (visb6 == View.VISIBLE && visb5 == View.INVISIBLE) {
                            b6.setVisibility(View.INVISIBLE);
                            b5.setVisibility(View.VISIBLE);
                            b5.setText(btn.getText());
                        }
                        if (visb6 == View.VISIBLE && visb7 == View.INVISIBLE) {
                            b6.setVisibility(View.INVISIBLE);
                            b7.setVisibility(View.VISIBLE);
                            b7.setText(btn.getText());
                        }
                        if (visb6 == View.VISIBLE && visb10 == View.INVISIBLE) {
                            b6.setVisibility(View.INVISIBLE);
                            b10.setVisibility(View.VISIBLE);
                            b10.setText(btn.getText());
                        }
                        break;
                    case R.id.b7:
                        if (visb7 == View.VISIBLE && visb3 == View.INVISIBLE) {
                            b7.setVisibility(View.INVISIBLE);
                            b3.setVisibility(View.VISIBLE);
                            b3.setText(btn.getText());
                        }
                        if (visb7 == View.VISIBLE && visb6 == View.INVISIBLE) {
                            b7.setVisibility(View.INVISIBLE);
                            b6.setVisibility(View.VISIBLE);
                            b6.setText(btn.getText());
                        }
                        if (visb7 == View.VISIBLE && visb11 == View.INVISIBLE) {
                            b7.setVisibility(View.INVISIBLE);
                            b11.setVisibility(View.VISIBLE);
                            b11.setText(btn.getText());
                        }
                        break;
                    case R.id.b8:
                        if (visb8 == View.VISIBLE && visb4 == View.INVISIBLE) {
                            b8.setVisibility(View.INVISIBLE);
                            b4.setVisibility(View.VISIBLE);
                            b4.setText(btn.getText());
                        }
                        if (visb8 == View.VISIBLE && visb9 == View.INVISIBLE) {
                            b8.setVisibility(View.INVISIBLE);
                            b9.setVisibility(View.VISIBLE);
                            b9.setText(btn.getText());
                        }
                        if (visb8 == View.VISIBLE && visb12 == View.INVISIBLE) {
                            b8.setVisibility(View.INVISIBLE);
                            b12.setVisibility(View.VISIBLE);
                            b12.setText(btn.getText());
                        }
                        break;
                    case R.id.b9:
                        if (visb9 == View.VISIBLE && visb5 == View.INVISIBLE) {
                            b9.setVisibility(View.INVISIBLE);
                            b5.setVisibility(View.VISIBLE);
                            b5.setText(btn.getText());
                        }
                        if (visb9 == View.VISIBLE && visb8 == View.INVISIBLE) {
                            b9.setVisibility(View.INVISIBLE);
                            b8.setVisibility(View.VISIBLE);
                            b8.setText(btn.getText());
                        }
                        if (visb9 == View.VISIBLE && visb10 == View.INVISIBLE) {
                            b9.setVisibility(View.INVISIBLE);
                            b10.setVisibility(View.VISIBLE);
                            b10.setText(btn.getText());
                        }
                        if (visb9 == View.VISIBLE && visb13 == View.INVISIBLE) {
                            b9.setVisibility(View.INVISIBLE);
                            b13.setVisibility(View.VISIBLE);
                            b13.setText(btn.getText());
                        }
                        break;
                    case R.id.b10:
                        if (visb10 == View.VISIBLE && visb6 == View.INVISIBLE) {
                            b10.setVisibility(View.INVISIBLE);
                            b6.setVisibility(View.VISIBLE);
                            b6.setText(btn.getText());
                        }
                        if (visb10 == View.VISIBLE && visb9 == View.INVISIBLE) {
                            b10.setVisibility(View.INVISIBLE);
                            b9.setVisibility(View.VISIBLE);
                            b9.setText(btn.getText());
                        }
                        if (visb10 == View.VISIBLE && visb11 == View.INVISIBLE) {
                            b10.setVisibility(View.INVISIBLE);
                            b11.setVisibility(View.VISIBLE);
                            b11.setText(btn.getText());
                        }
                        if (visb10 == View.VISIBLE && visb14 == View.INVISIBLE) {
                            b10.setVisibility(View.INVISIBLE);
                            b14.setVisibility(View.VISIBLE);
                            b14.setText(btn.getText());
                        }
                        break;
                    case R.id.b11:
                        if (visb11 == View.VISIBLE && visb7 == View.INVISIBLE) {
                            b11.setVisibility(View.INVISIBLE);
                            b7.setVisibility(View.VISIBLE);
                            b7.setText(btn.getText());
                        }
                        if (visb11 == View.VISIBLE && visb10 == View.INVISIBLE) {
                            b11.setVisibility(View.INVISIBLE);
                            b10.setVisibility(View.VISIBLE);
                            b10.setText(btn.getText());
                        }
                        if (visb11 == View.VISIBLE && visb15 == View.INVISIBLE) {
                            b11.setVisibility(View.INVISIBLE);
                            b15.setVisibility(View.VISIBLE);
                            b15.setText(btn.getText());
                        }
                        break;
                    case R.id.b12:
                        if (visb12 == View.VISIBLE && visb8 == View.INVISIBLE) {
                            b12.setVisibility(View.INVISIBLE);
                            b8.setVisibility(View.VISIBLE);
                            b8.setText(btn.getText());
                        }
                        if (visb12 == View.VISIBLE && visb13 == View.INVISIBLE) {
                            b12.setVisibility(View.INVISIBLE);
                            b13.setVisibility(View.VISIBLE);
                            b13.setText(btn.getText());
                        }
                        break;
                    case R.id.b13:
                        if (visb13 == View.VISIBLE && visb9 == View.INVISIBLE) {
                            b13.setVisibility(View.INVISIBLE);
                            b9.setVisibility(View.VISIBLE);
                            b9.setText(btn.getText());
                        }
                        if (visb13 == View.VISIBLE && visb12 == View.INVISIBLE) {
                            b13.setVisibility(View.INVISIBLE);
                            b12.setVisibility(View.VISIBLE);
                            b12.setText(btn.getText());
                        }
                        if (visb13 == View.VISIBLE && visb14 == View.INVISIBLE) {
                            b13.setVisibility(View.INVISIBLE);
                            b14.setVisibility(View.VISIBLE);
                            b14.setText(btn.getText());
                        }
                        break;
                    case R.id.b14:
                        if (visb14 == View.VISIBLE && visb10 == View.INVISIBLE) {
                            b14.setVisibility(View.INVISIBLE);
                            b10.setVisibility(View.VISIBLE);
                            b10.setText(btn.getText());
                        }
                        if (visb14 == View.VISIBLE && visb13 == View.INVISIBLE) {
                            b14.setVisibility(View.INVISIBLE);
                            b13.setVisibility(View.VISIBLE);
                            b13.setText(btn.getText());
                        }
                        if (visb14 == View.VISIBLE && visb15 == View.INVISIBLE) {
                            b14.setVisibility(View.INVISIBLE);
                            b15.setVisibility(View.VISIBLE);
                            b15.setText(btn.getText());
                        }
                        break;
                    case R.id.b15:
                        if (visb15 == View.VISIBLE && visb11 == View.INVISIBLE) {
                            b15.setVisibility(View.INVISIBLE);
                            b11.setVisibility(View.VISIBLE);
                            b11.setText(btn.getText());
                        }
                        if (visb15 == View.VISIBLE && visb11 == View.INVISIBLE) {
                            b15.setVisibility(View.INVISIBLE);
                            b11.setVisibility(View.VISIBLE);
                            b11.setText(btn.getText());
                        }
                        if (visb15 == View.VISIBLE && visb14 == View.INVISIBLE) {
                            b15.setVisibility(View.INVISIBLE);
                            b14.setVisibility(View.VISIBLE);
                            b14.setText(btn.getText());
                        }
                        break;
                }
            }
        };
        b0.setOnClickListener(onClickListener);
        b1.setOnClickListener(onClickListener);
        b2.setOnClickListener(onClickListener);
        b3.setOnClickListener(onClickListener);
        b4.setOnClickListener(onClickListener);
        b5.setOnClickListener(onClickListener);
        b6.setOnClickListener(onClickListener);
        b7.setOnClickListener(onClickListener);
        b8.setOnClickListener(onClickListener);
        b9.setOnClickListener(onClickListener);
        b10.setOnClickListener(onClickListener);
        b11.setOnClickListener(onClickListener);
        b12.setOnClickListener(onClickListener);
        b13.setOnClickListener(onClickListener);
        b14.setOnClickListener(onClickListener);
        b15.setOnClickListener(onClickListener);
    }
}