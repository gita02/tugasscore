package com.bso.inf.tugasscore;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.provider.Browser;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {


    TextView skorpersib, skorpersija;
    Button btnPersib, btnPersija;
    Button tambahPersib,kurangPersib, tambahPersija,kurangPersija, Reset, Berita, Peta;
    int scorePersib, scorePersija;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        skorpersib = findViewById(R.id.scorepersib);
        skorpersija = findViewById(R.id.scorepersija);

        btnPersib = findViewById(R.id.btnpersib);
        btnPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,DetailPersibActivity.class);
                startActivity(i);
            }
        });


        Button btnPersija = findViewById(R.id.btnpersija);
        btnPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent k = new Intent(MainActivity.this, DetailPersija.class);
                startActivity(k);
            }
        });

        scorePersib=0;
        scorePersija=0;
        Button tambahPersib = findViewById(R.id.tambahpersib);
        tambahPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersib++;
                skorpersib.setText(String.valueOf(scorePersib));

            }
        });

        Button kurangPersib = findViewById(R.id.kurangpersib);
        kurangPersib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (scorePersib!=0){
                    scorePersib--;
                    skorpersib.setText((String .valueOf(scorePersib)));
                }

            }
        });

        Button tambahPersija = findViewById(R.id.tambahpersija);
        tambahPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                scorePersija++;
                skorpersija.setText(String.valueOf(scorePersija));
            }
        });

        Button kurangPersija = findViewById(R.id.kurangpersija);
        kurangPersija.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (scorePersija!=0){
                    scorePersija--;
                    skorpersija.setText((String .valueOf(scorePersija)));
                }
            }
        });

        Button Reset = findViewById(R.id.reset);
        Reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                skorpersib.setText(String.valueOf(0));
                skorpersija.setText(String.valueOf(0));
            }
        });

        Button Berita = findViewById(R.id.berita);
        Berita.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.bola.com")));
            }
        });

        Button Peta= findViewById(R.id.peta);
        Peta.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Build the intent
                Uri location = Uri.parse("geo:-6.957359, 107.712613");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);

// Verify it resolves
                PackageManager packageManager = getPackageManager();
                List<ResolveInfo> activities = packageManager.queryIntentActivities(mapIntent, 0);
                boolean isIntentSafe = activities.size() > 0;

// Start an activity if it's safe
                if (isIntentSafe) {
                    startActivity(mapIntent);
                }


            }
        }));
    }
}
