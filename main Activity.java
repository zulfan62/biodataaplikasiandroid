 package com.example.aplikasibiodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

 public class MainActivity extends AppCompatActivity {
    EditText n_nim, t_nama, k_kelas, tt_tanggal;
    Button moving;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        n_nim = (EditText)findViewById(R.id.nn_nim);
        t_nama = (EditText)findViewById(R.id.nn_nama);
        k_kelas = (EditText)findViewById(R.id.kk_kelas);
        tt_tanggal = (EditText)findViewById(R.id.tt_anggal);

        moving = (Button)findViewById(R.id.savedata);
        moving.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String snim = String.valueOf(n_nim.getText());
                String snama = String.valueOf(t_nama.getText());
                String skelas = String.valueOf(k_kelas.getText());
                String stanggal = String.valueOf(tt_tanggal.getText());

                isibio tampung = new isibio();
                tampung.setNim(snim);
                tampung.setNama(snama);
                tampung.setKelas(skelas);
                tampung.setTanggal(stanggal);
                Intent intent = new Intent(MainActivity.this, activity_bio.class);
                intent.putExtra(activity_bio.EXTRA_DATA, tampung);
                startActivity(intent);

            }
        });

    }
}
