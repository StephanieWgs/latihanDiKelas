package com.example.dsrmobile.layout;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class profilActivity extends AppCompatActivity {

    TextView isiNama;
    TextView isiNIM;
    TextView isiJurusan;
    TextView isiHobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        isiNama = (TextView) findViewById(R.id.isiNama);
        isiNama.setText("Stephanie");
        isiNIM = (TextView) findViewById(R.id.isiNIM);
        isiNIM.setText("03081220016");
        isiJurusan = (TextView) findViewById(R.id.isiJurusan);
        isiJurusan.setText("Sistem Informasi");
        isiHobi = (TextView) findViewById(R.id.isiHobi);
        isiHobi.setText("Rebahan");
    }
}