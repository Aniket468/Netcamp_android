package com.example.aniketkumar.netcamp_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Calci extends AppCompatActivity {

    EditText e1,e2;
    TextView t1;
    Button add,subs,divi,mul,reset;
    String s1,s2,s3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,//full Screen
                 WindowManager.LayoutParams.FLAG_FULLSCREEN);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);
        e1=(EditText)findViewById(R.id.editText);
        e2=(EditText)findViewById(R.id.editText2);
        t1=(TextView)findViewById(R.id.textView);
        add=(Button)findViewById(R.id.add);
        subs=(Button)findViewById(R.id.substract);
        divi=(Button)findViewById(R.id.division);
        mul=(Button)findViewById(R.id.multiply);
        reset=(Button)findViewById(R.id.reset);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                s1=e1.getText().toString();
                s2=e2.getText().toString();

                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter all field",Toast.LENGTH_SHORT).show();
                }
                else {
                    float p, q;
                    p = Float.parseFloat(s1);
                    q = Float.parseFloat(s2);
                    float ans = p + q;
                    t1.setText("" + ans);
                    Toast.makeText(getApplicationContext(), "The ans is" + "" + ans, Toast.LENGTH_LONG).show();
                }
            }
        });
        subs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter all field",Toast.LENGTH_SHORT).show();
                }
                else {
                    float p, q;
                    p = Float.parseFloat(s1);
                    q = Float.parseFloat(s2);
                    float ans = p - q;
                    t1.setText("" + ans);
                    Toast.makeText(getApplicationContext(), "The ans is" + "" + ans, Toast.LENGTH_LONG).show();
                }
            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter all field",Toast.LENGTH_SHORT).show();
                }
                else {
                    float p, q;
                    p = Float.parseFloat(s1);
                    q = Float.parseFloat(s2);
                    float ans = p * q;
                    t1.setText("" + ans);
                    Toast.makeText(getApplicationContext(), "The ans is" + "" + ans, Toast.LENGTH_LONG).show();
                }
            }
        });
        divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                if(s1.equals("")||s2.equals(""))
                {
                    Toast.makeText(getApplicationContext(),"Enter all field",Toast.LENGTH_SHORT).show();
                }
                else {
                    float p, q;
                    p = Float.parseFloat(s1);
                    q = Float.parseFloat(s2);
                    float ans = p / q;
                    t1.setText("" + ans);
                    Toast.makeText(getApplicationContext(), "The ans is" + "" + ans, Toast.LENGTH_LONG).show();
                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                e1.setText("");
                e2.setText("");
                t1.setText("");
            }
        });
    }
}
