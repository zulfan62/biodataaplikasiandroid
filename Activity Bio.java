package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class activity_bio extends AppCompatActivity {
    TextView tampilData;
    public static String EXTRA_DATA = "extra_data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        tampilData = (TextView)findViewById(R.id.tampil);
        isibio tampung = getIntent().getParcelableExtra(EXTRA_DATA);
        String text = "NIM : "+tampung.getNim()+" Nama : "+tampung.getNama()+" Kelas : "+tampung.getKelas()+
                " Tanggal Lahir : "+tampung.getTanggal();
        tampilData.setText(text);

    }
}
