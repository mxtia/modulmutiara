package com.example.mutiarakartika.operatormatematika;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText editRupiah;
    RadioButton radioDolar, radioEuro;
    Button btnOkKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editRupiah = (EditText) findViewById(R.id.editRupiah);
        radioDolar = (RadioButton) findViewById(R.id.radioDolar);
        radioEuro = (RadioButton) findViewById(R.id.radioEuro);
        btnOkKonversi = (Button) findViewById(R.id.btnOkKonversi);
        txtHasil = (TextView) findViewById(R.id.txtHasil);

        btnOkKonversi.setOnClickListener(new View.OnClickListener() {

            @Override
          public void onClick(View v){ String nilairupiah = editRupiah.getText().toString();

              if(radioDolar.isChecked()){
                  double hasil = Double.parseDouble(nilairupiah)/13000;
                  String result = Double.toString(hasil);
                  txtHasil.setText(result);
              }

                if(radioEuro.isChecked()){
                    double hasil = Double.parseDouble(nilairupiah)/15000;
                    String result = Double.toString(hasil);
                    txtHasil.setText(result);
                }
            }
        });
    }
}
