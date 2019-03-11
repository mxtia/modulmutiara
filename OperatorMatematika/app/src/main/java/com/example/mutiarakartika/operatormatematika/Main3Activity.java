package com.example.mutiarakartika.operatormatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;

public class Main3Activity extends AppCompatActivity {
    Button btnjumlah, btnkurang, btnkali, btnbagi;
    TextView txtawal, txtoperator, txthasil;
    EditText editawal, editkedua, edithasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        btnjumlah = (Button) findViewById(R.id.btnjumlah);
        btnkurang = (Button) findViewById(R.id.btnkurang);
        btnkali = (Button) findViewById(R.id.btnkali);
        btnbagi = (Button) findViewById(R.id.btnbagi);
        txtawal = (TextView) findViewById(R.id.txtawal);
        txtoperator = (TextView) findViewById(R.id.txtoperator);
        txthasil = (TextView) findViewById(R.id.txthasil);
        editawal = (EditText) findViewById(R.id.editawal);
        editkedua = (EditText) findViewById(R.id.editkedua);
        edithasil = (EditText) findViewById(R.id.edithasil);
        btnjumlah.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                operatorpenjumlahan();
            }
        });
        btnkurang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                operatorpengurangan();
            }
        });
        btnkali.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                operatorperkalian();
            }
        });
        btnbagi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View v){
                operatorpembagian();
            }
        });
    }

    private void operatorpenjumlahan(){
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int penjumlahan = angkaawal + angkakedua;
        edithasil.setText(penjumlahan+"");
    }

    private void operatorpengurangan(){
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int pengurangan = angkaawal - angkakedua;
        edithasil.setText(pengurangan+"");
    }

    private void operatorperkalian(){
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int perkalian = angkaawal * angkakedua;
        edithasil.setText(perkalian+"");
    }

    private void operatorpembagian(){
        int angkaawal = Integer.parseInt(editawal.getText().toString());
        int angkakedua = Integer.parseInt(editkedua.getText().toString());
        int pembagian = angkaawal / angkakedua;
        edithasil.setText(pembagian+"");
    }
}
