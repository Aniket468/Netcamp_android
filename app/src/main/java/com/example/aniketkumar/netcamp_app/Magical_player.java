package com.example.aniketkumar.netcamp_app;

import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.support.constraint.solver.SolverVariable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

public class Magical_player extends AppCompatActivity implements SensorEventListener{

Button b3;
    SensorManager sm;
    Sensor s1,s2;
    Button b1,b2,b4;
    MediaPlayer mp;
    int i=0;

    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,//full Screen
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_magical_player);
        b1=(Button)findViewById(R.id.light);
        b2=(Button)findViewById(R.id.gravity);
        b3=(Button)findViewById(R.id.stop);
        b4=(Button)findViewById(R.id.back);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Third.class);
                startActivity(i);
                finish();
            }
        });
        mp=MediaPlayer.create(getApplicationContext(),R.raw.b);


        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();


            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=1;
                sm=(SensorManager) getSystemService(SENSOR_SERVICE);
                s1=sm.getDefaultSensor(Sensor.TYPE_LIGHT);
                sm.registerListener(Magical_player.this,s1,SensorManager.SENSOR_DELAY_NORMAL);
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                i=0;
                sm=(SensorManager) getSystemService(SENSOR_SERVICE);
                s2=sm.getDefaultSensor(Sensor.TYPE_GRAVITY);
                sm.registerListener(Magical_player.this,s2,SensorManager.SENSOR_DELAY_NORMAL);
            }
        });

    }

    @Override
    public void onSensorChanged(SensorEvent sensorEvent) {
        if(i==0) {

            if (sensorEvent.values[0] > 1 || sensorEvent.values[1] > 1 ||sensorEvent.values[0]>2) {
                mp.start();
            } else
                mp.pause();
        }
        else
        {
            if (sensorEvent.values[0] > 2 ) {
                mp.start();
            } else
                mp.pause();
        }


    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {

    }
}
