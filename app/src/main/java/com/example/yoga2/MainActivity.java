 package com.example.yoga2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {
    ImageView i1,i2,i3,i4,i5,i6;
    TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView) findViewById(R.id.imageView);
        t1=(TextView) findViewById(R.id.textView);
        i1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,mountain_act.class);
                startActivity(x);
            }
        });
        t1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,mountain_act.class);
                startActivity(x);
            }
        });
        i2=(ImageView)findViewById(R.id.imageView3);
        t2=(TextView) findViewById(R.id.textView3);
        i2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,chair_act.class);
                startActivity(x);
            }
        });
        t2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,chair_act.class);
                startActivity(x);
            }
        });
        i3=(ImageView)findViewById(R.id.imageView4);
        t3=(TextView) findViewById(R.id.textView4);
        i3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,warrior_act.class);
                startActivity(x);

            }
        });
        t3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,warrior_act.class);
                startActivity(x);
            }
        });
        i4=(ImageView)findViewById(R.id.imageView5);
        t4=(TextView) findViewById(R.id.textView7);
        i4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,triangle_act.class);
                startActivity(x);
            }
        });
        t4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,triangle_act.class);
                startActivity(x);

            }
        });
        i5=(ImageView)findViewById(R.id.imageView7);
        t5=(TextView) findViewById(R.id.textView8);
        i5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,tree_act.class);
                startActivity(x);
            }
        });
        t5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,tree_act.class);
                startActivity(x);
            }
        });
        i6=(ImageView)findViewById(R.id.imageView8);
        t6=(TextView) findViewById(R.id.textView9);
        i6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,wheel_act.class);
                startActivity(x);
            }
        });
        t6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent x = new Intent(MainActivity.this,wheel_act.class);
                startActivity(x);
            }
        });
    }
}
