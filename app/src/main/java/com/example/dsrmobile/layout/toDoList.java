package com.example.dsrmobile.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class toDoList extends AppCompatActivity {

    EditText isiKeg;
    RadioButton radio_luar, radio_dalam;
    CheckBox checkbox_olahraga, checkbox_jalan,checkbox_makan,checkbox_belajar;
    Button save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_to_do_list);
        isiKeg = (EditText) findViewById(R.id.isiKeg);
        radio_luar = (RadioButton) findViewById(R.id.radio_luar);
        radio_dalam = (RadioButton) findViewById(R.id.radio_dalam);
        checkbox_olahraga = (CheckBox) findViewById(R.id.checkbox_olahraga);
        checkbox_jalan = (CheckBox) findViewById(R.id.checkbox_jalan);
        checkbox_makan = (CheckBox) findViewById(R.id.checkbox_makan);
        checkbox_belajar = (CheckBox) findViewById(R.id.checkbox_belajar);
        save = (Button) findViewById(R.id.save);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String keg = isiKeg.getText().toString();
                String tempat = "";
                if(radio_luar.isChecked()){
                    tempat = "Luar Ruangan";
                }
                if(radio_dalam.isChecked()){
                    tempat = "Dalam Ruangan";
                }
                StringBuilder jenis = new StringBuilder("\n");
                if (checkbox_olahraga.isChecked()) {
                    jenis.append("- Olahraga\n");
                }
                if (checkbox_jalan.isChecked()) {
                    jenis.append("- Jalan-Jalan\n");
                }
                if (checkbox_makan.isChecked()) {
                    jenis.append("- Makan\n");
                }
                if (checkbox_belajar.isChecked()) {
                    jenis.append("- Belajar\n");
                }
                String message = "Berhasil Disimpan" +
                        "\nNama Kegiatan    : " + keg +
                        "\nTempat Kegiatan : " + tempat +
                        "\nJenis Kegiatan: " + jenis.toString();
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(toDoList.this, message, duration);
                toast.show();
            }
        });
    }
}