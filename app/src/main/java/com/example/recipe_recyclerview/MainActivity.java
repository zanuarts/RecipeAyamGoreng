package com.example.recipe_recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView.Adapter mAdapter;
    RecyclerView.LayoutManager layoutManager;

    String[] bahanMasak = {
          "1 ekor ayam, berat 1 kg, potong 8",
            "3 siung bawang putih",
            "1 sdm biji ketumbar, sangrai",
            "5 btr kemiri, sangrai",
            "2 cm kunyit, kupas dan bakar hingga berubah warna",
            "1 cm jahe, kupas",
            "4 lbr daun salam",
            "2 btg serai, memarkan",
            "100 gr Lengkuas, cuci bersih, parut kasar berikut kulitnya",
            "1 bks Sajiku® Bumbu Ayam Goreng",
            "200 ml of air",
            "1/4 sdt merica bubuk",
            "Minyak secukupnya"
    };

    String[] langkahMasak = {
            "Langkah 1", "Langkah 2", "Langkah 3", "Langkah 4", "Langkah 5", "Langkah 6",
    };

    String[] descLangkah = {
            "Haluskan bawang putih, biji ketumbar, kemiri, kunyit dan jahe.",
            "Angkat ayam, tiriskan, dan tinggalkan sisa bumbu dalam wajan. Tambahkan sisa parutan lengkuas ke dalam bumbu. Masak kembali selama 5 menit.",
            "Panaskan minyak dalam wajan dengan api sedang. Tumis bumbu halus hingga harum, tambahkan daun salam, serai dan setengah dari lengkuas parut. Tumis kembali hingga bumbu matang. Tambahkan garam, lada dan sedikit air.",
            "Panaskan minyak yang cukup untuk menggoreng ayam di dalam wajan bersih. Goreng ayam hingga kematangan dan warna yang diinginkan. Goreng sisa bumbu di dalam minyak sambil diaduk hingga mengering. Angkat dan tiriskan.",
            "Masukkan potongan ayam, air, merica bubuk dan Sajiku® Ayam Goreng. Aduk rata dan masak (ungkep) dengan api kecil hingga ayam matang dan bumbu surut. Bolak-balik ayam sesekali. Apabila perlu, tambahkan air selama pemasakan.",
            "Sajikan ayam goreng dan taburan bumbu lengkuas kering dengan nasi uduk, tempe dan tahu, sambal dan lalapan."
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.rvBahan);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        mAdapter = new ProgramAdapter(this, bahanMasak, langkahMasak, descLangkah);
        recyclerView.setAdapter(mAdapter);
    }
}
