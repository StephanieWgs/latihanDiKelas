package com.example.dsrmobile.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;

public class latihanActivity extends AppCompatActivity {
    EditText isiNama;
    RadioButton radio_pria, radio_wanita;
    CheckBox checkbox_coding, checkbox_reading,checkbox_travelling;
    ImageButton tambah, hapus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan);
        isiNama = (EditText) findViewById(R.id.isiNama);
        radio_pria = (RadioButton) findViewById(R.id.radio_pria);
        radio_wanita = (RadioButton) findViewById(R.id.radio_wanita);
        checkbox_coding = (CheckBox) findViewById(R.id.checkbox_coding);
        checkbox_reading = (CheckBox) findViewById(R.id.checkbox_reading);
        checkbox_travelling = (CheckBox) findViewById(R.id.checkbox_travelling);

        tambah = (ImageButton) findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nama = isiNama.getText().toString();
                String jenisKelamin = "";
                if(radio_pria.isChecked()){
                    jenisKelamin = "Pria";
                }
                if(radio_wanita.isChecked()){
                    jenisKelamin = "Wanita";
                }
                StringBuilder hobi = new StringBuilder("Hobi\t: ");
                boolean hobiLebihDariDua = false;
                if (checkbox_coding.isChecked()) {
                    hobi.append("Coding ");
                    hobiLebihDariDua = true;
                }
                if (checkbox_reading.isChecked()) {
                    if (hobiLebihDariDua) {
                        hobi.append(", ");
                    }
                    hobi.append("Reading");
                    hobiLebihDariDua = true;
                }
                if (checkbox_travelling.isChecked()) {
                    if (hobiLebihDariDua) {
                        hobi.append(", ");
                    }
                    hobi.append("Travelling");
                    hobiLebihDariDua = true;
                }
                String message = nama + " (" + jenisKelamin + ")\n" + hobi.toString();
                Snackbar.make(v, message, Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        hapus = (ImageButton) findViewById(R.id.hapus);
        hapus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                isiNama.setText("");
                radio_pria.setChecked(false);
                radio_wanita.setChecked(false);
                checkbox_coding.setChecked(false);
                checkbox_reading.setChecked(false);
                checkbox_travelling.setChecked(false);
            }
        });
    }
}