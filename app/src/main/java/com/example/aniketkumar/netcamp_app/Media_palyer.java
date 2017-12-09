package com.example.aniketkumar.netcamp_app;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;

public class Media_palyer extends AppCompatActivity {
    Button b1,b2,b3,b4;
    ImageView i1;
    MediaPlayer mp,mq,mw;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,//full Screen
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media_palyer);
        b1=(Button)findViewById(R.id.back);
        b2=(Button)findViewById(R.id.play);
        b3=(Button)findViewById(R.id.pause);
        b4=(Button)findViewById(R.id.next);
        i1=(ImageView)findViewById(R.id.image);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Third.class);
                startActivity(i);
                finish();
            }
        });
        mp=new MediaPlayer();
        mp=MediaPlayer.create(this,R.raw.a);
//        mq=new MediaPlayer();
//        mq=MediaPlayer.create(this,R.raw.b);
//        mw=new MediaPlayer();
//        mw=MediaPlayer.create(this,R.raw.c);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            mp.start();
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mp.pause();
//                mq.pause();
//                mw.pause();
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                 i++;
                if(i==1) {
                   mp.reset();
                    mp=MediaPlayer.create(getApplicationContext(),R.raw.b);
                    mp.start();
                }
                else if(i==2) {
                 //   mq.stop();
                    mp.reset();
                    mp=MediaPlayer.create(getApplicationContext(),R.raw.c);
                    mp.start();
                }
                else {
                    i = 0;
                    mp.reset();
                    mp=MediaPlayer.create(getApplicationContext(),R.raw.a);
                    mp.start();
                 }

            }

        });


    }
}
