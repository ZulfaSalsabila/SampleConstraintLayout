package com.example.sampleconstraintlayout;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ActivityLihatData extends AppCompatActivity {

    TextView tvnama, tvnomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lihat_data);

        tvnama = findViewById(R.id.tvNamaKontak);
        tvnomor = findViewById(R.id.tvNomorTelepon);

        //Membuat variabel dengan jenis data bundle dan
        //assign value dari variabel tersebut dengan
        //getIntent().getExtras()

        Bundle bundle = getIntent().getExtras();

        //Membuat variabel nama dan assign value dari pesan
        //yang dikirimkan dari activity sebelumnya
        String nama = bundle.getString("a");

        switch (nama)
        {
            case "Inayah":
                tvnama.setText("Inayah M");
                tvnomor.setText("08122233344");
                break;

            case "Ilham":
                tvnama.setText("Ilham R");
                tvnomor.setText("08162526162");
                break;

            case "Eris":
                tvnama.setText("Eris J");
                tvnomor.setText("08167897544");
                break;

            case "Fikri":
                tvnama.setText("M Fikri");
                tvnomor.setText("08665433344");
                break;

            case "Maul":
                tvnama.setText("Maul M");
                tvnomor.setText("089897989890");
                break;

            case "Intan":
                tvnama.setText("Intan S");
                tvnomor.setText("08125688434");
                break;

            case "Vina":
                tvnama.setText("Vina R");
                tvnomor.setText("08166998750");
                break;

            case "Gita":
                tvnama.setText("Gita S");
                tvnomor.setText("08989765454");
                break;

            case "Luthfi":
                tvnama.setText("Luthfi M");
                tvnomor.setText("08125765389");
                break;

            case "Vian":
                tvnama.setText("Vian M");
                tvnomor.setText("08184748494");
        }
    }
}
