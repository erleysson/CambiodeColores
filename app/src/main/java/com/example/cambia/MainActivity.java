package com.example.cambia;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;




public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private MediaPlayer amarillos;
    private MediaPlayer morado;
    private MediaPlayer negro;
    private MediaPlayer verde;
    private ImageView fondo;

    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button1 = findViewById(R.id.button1);
        Button button2=findViewById(R.id.button2);
        Button button3=findViewById(R.id.button3);
        Button button4=findViewById(R.id.button4);
        Button button5=findViewById(R.id.button5);

        fondo=(ImageView)findViewById(R.id.fondo);

        amarillos= MediaPlayer.create(this, R.raw.amarillos);
        morado = MediaPlayer.create(this, R.raw.morado);
        negro = MediaPlayer.create(this, R.raw.negro);
        verde = MediaPlayer.create(this, R.raw.verde);


        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);


    }




    @Override
    public void onClick(View view) {
        
        switch (view.getId()){

            case R.id.button1:
                getWindow().getDecorView().setBackgroundResource(R.color.colorAmarillo);
                    amarillos.start();
                    fondo.setImageResource(R.drawable.vegeta);
              break;

            case R.id.button2:
                getWindow().getDecorView().setBackgroundResource(R.color.colorNegro);
                negro.start();
                fondo.setImageResource(R.drawable.g);
                break;
            case R.id.button3:
                getWindow().getDecorView().setBackgroundResource(R.color.colorVerde);
                verde.start();
                fondo.setImageResource(R.drawable.cel);
                break;
            case R.id.button4:
                getWindow().getDecorView().setBackgroundResource(R.color.colorMorado);
                morado.start();
                fondo.setImageResource(R.drawable.johan);
                break;
            case R.id.button5:
                finish();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + view.getId());
        }

    }
}
