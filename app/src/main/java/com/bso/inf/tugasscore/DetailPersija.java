package com.bso.inf.tugasscore;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DetailPersija extends AppCompatActivity {

    Button Sumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_persija);
        Button Sumber = findViewById(R.id.sumberpersija);
        Sumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://id.wikipedia.org/wiki/Persib_Bandung")));
            }
        });
    }
}
