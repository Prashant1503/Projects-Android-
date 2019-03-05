package com.example.pintu.tictactoe;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button b1,b2,b3,b4,b5,b6,b7,b8,b9,reset;
    int turn =1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = findViewById(R.id.btn1);
        b2= findViewById(R.id.btn2);
        b3 = findViewById(R.id.btn3);
        b4 = findViewById(R.id.btn4);
        b5 = findViewById(R.id.btn5);
        b6 = findViewById(R.id.btn6);
        b7 = findViewById(R.id.btn7);
        b8 = findViewById(R.id.btn8);
        b9 = findViewById(R.id.btn9);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b1.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b1.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b1.setText("O");
                    }
                }
                endGame();
                draw();

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b2.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b2.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b2.setText("O");
                    }
                }
                endGame();
                draw();

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (b3.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b3.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b3.setText("O");
                    }
                }
                endGame();
                draw();

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b4.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b4.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b4.setText("O");
                    }
                }
                endGame();
                draw();
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b5.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b5.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b5.setText("O");
                    }
                }
                endGame();
                draw();
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b6.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b6.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b6.setText("O");
                    }
                }
                endGame();
                draw();

            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b7.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b7.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b7.setText("O");
                    }
                }
                endGame();
                draw();
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b8.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b8.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b8.setText("O");
                    }
                }
                endGame();
            }

        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (b9.getText().toString().equals("")){

                    if (turn ==1){
                        turn =2;

                        b9.setText("X");
                    }
                    else if (turn ==2){
                        turn =1;
                        b9.setText("O");
                    }
                }
                endGame();
                draw();
            }
        });
        reset = findViewById(R.id.btnReset);
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                b1.setText("");
                b2.setText("");
                b3.setText("");
                b4.setText("");
                b5.setText("");
                b6.setText("");
                b7.setText("");
                b8.setText("");
                b9.setText("");

            }
        });


    }
    public void endGame(){
        String a,b,c,d,e,f,g,h,i;
        Boolean end = false;

        a = b1.getText().toString();
        b = b2.getText().toString();
        c = b3.getText().toString();
        d = b4.getText().toString();
        e = b5.getText().toString();
        f = b6.getText().toString();
        g = b7.getText().toString();
        h = b8.getText().toString();
        i= b9.getText().toString();

        //Winner X....

        if (a.equals("X") && b.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        //Checking Diagonlly..
        if (a.equals("X") && e.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner PLayer X",Toast.LENGTH_LONG).show();
            end=true;

        }
        if (a.equals("X") && d.equals("X") && g.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (b.equals("X") && e.equals("X") && h.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (c.equals("X") && f.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;

        }

        if (d.equals("X") && e.equals("X") && f.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (g.equals("X") && h.equals("X") && i.equals("X")){
            Toast.makeText(MainActivity.this,"Winner Player X",Toast.LENGTH_LONG).show();
            end=true;
        }

        //Winner O..


        if (a.equals("O") && b.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        //Checking Matches Diagonlly..
        if (a.equals("O") && e.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner PLayer O",Toast.LENGTH_LONG).show();
            end=true;

        }
        if (a.equals("O") && d.equals("O") && g.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (b.equals("O") && e.equals("O") && h.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (c.equals("O") && f.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }


        if (d.equals("O") && e.equals("O") && f.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }
        if (g.equals("O") && h.equals("O") && i.equals("O")){
            Toast.makeText(MainActivity.this,"Winner Player O",Toast.LENGTH_LONG).show();
            end=true;
        }

        if (end){
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);


        }
    }
    public void draw(){
        String g,e,c;
        boolean end =true;

        c = b3.getText().toString();
        g = b7.getText().toString();
        e = b5.getText().toString();

        if (g.equals("X") && e.equals("X") && c.equals("X")){
            Toast.makeText(MainActivity.this, "Winner Player X!",Toast.LENGTH_LONG).show();
            end = true;
        }

        if (g.equals("O") && e.equals("O") && c.equals("O")){
            Toast.makeText(MainActivity.this, "Winner Player O!",Toast.LENGTH_LONG).show();
            end = true;
        }
    }
}
