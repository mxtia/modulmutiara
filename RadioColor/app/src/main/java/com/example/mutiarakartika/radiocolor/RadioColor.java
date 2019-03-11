package com.example.mutiarakartika.radiocolor;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class RadioColor extends AppCompatActivity implements OnClickListener {
    RadioButton rdb1, rdb2, rdb3, rdb4, rdb5, rdb6, rdb7, rdb8;
    TextView txtwarna;
    Button btnexit;
    private Bundle savedInstanceState;
    @Override
        protected void onCreate(Bundle saveInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdb1 = (RadioButton) findViewById(R.id.rdb1);
        rdb2 = (RadioButton) findViewById(R.id.rdb2);
        rdb3 = (RadioButton) findViewById(R.id.rdb3);
        rdb4 = (RadioButton) findViewById(R.id.rbd4);
        rdb5 = (RadioButton) findViewById(R.id.rdb5);
        rdb6 = (RadioButton) findViewById(R.id.rdb6);
        rdb7 = (RadioButton) findViewById(R.id.rdb7);
        rdb8 = (RadioButton) findViewById(R.id.rdb8);
        txtwarna = (TextView) findViewById(R.id.txtwarna);
        btnexit = (Button) findViewById(R.id.btnexit);
        rdb1.setOnClickListener((OnClickListener) this);
        rdb2.setOnClickListener((OnClickListener) this);
        rdb3.setOnClickListener((OnClickListener) this);
        rdb4.setOnClickListener((OnClickListener) this);
        rdb5.setOnClickListener((OnClickListener) this);
        rdb6.setOnClickListener((OnClickListener) this);
        rdb7.setOnClickListener((OnClickListener) this);
        rdb8.setOnClickListener((OnClickListener) this);
        btnexit.setOnClickListener((OnClickListener) this);
    }

    @Override
    public void onClick(View v) {
        if(v == btnexit){
            finish();
        }
        else if (v == rdb1){
            txtwarna.setBackgroundResource(R.color.backRed);
        }
        else if (v == rdb2){
            txtwarna.setBackgroundResource(R.color.backUngu);
        }
        else if (v == rdb3){
            txtwarna.setBackgroundResource(R.color.backGreen);
        }
        else if (v == rdb4){
            txtwarna.setBackgroundResource(R.color.backWhite);
        }
        else if (v == rdb5){
            txtwarna.setBackgroundResource(R.color.backLime);
        }
        else if (v == rdb6){
            txtwarna.setBackgroundResource(R.color.backDark);
        }
        else if (v == rdb7){
            txtwarna.setBackgroundResource(R.color.backPink);
        }
        else if (v == rdb8){
            txtwarna.setBackgroundResource(R.color.backCayon);
        }
    }
}
