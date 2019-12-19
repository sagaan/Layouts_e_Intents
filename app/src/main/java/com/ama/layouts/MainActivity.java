package com.ama.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spnSpin = findViewById(R.id.spnSpin);
        spnSpin.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, position+"", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        Button btnFrame = findViewById(R.id.btnFrameToast);
        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarActivity = new Intent(MainActivity.this, LayoutsActivity.class);
                cambiarActivity.putExtra("layout", 4);
                startActivity(cambiarActivity);
            }
        });

        Button btnGrid = findViewById(R.id.btnGrid);
        btnGrid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarActivity = new Intent(MainActivity.this, LayoutsActivity.class);
                cambiarActivity.putExtra("layout", 3);
                startActivity(cambiarActivity);
            }
        });

        Button btnLinear = findViewById(R.id.btnLinear);
        btnLinear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarActivity = new Intent(MainActivity.this, LayoutsActivity.class);
                cambiarActivity.putExtra("layout", 2);
                startActivity(cambiarActivity);
            }
        });

        Button btnRelative = findViewById(R.id.btnRelative);
        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarActivity = new Intent(MainActivity.this, LayoutsActivity.class);
                cambiarActivity.putExtra("layout", 1);
                startActivity(cambiarActivity);
            }
        });

        Button btnTable = findViewById(R.id.btnTable);
        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cambiarActivity = new Intent(MainActivity.this, LayoutsActivity.class);
                cambiarActivity.putExtra("layout", 5);
                startActivity(cambiarActivity);
            }
        });

        Button btnIntent = findViewById(R.id.btnIntents);
        btnIntent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setType("text/plain");
                share.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK);

                share.putExtra(Intent.EXTRA_SUBJECT, "Pizza Time!");
                share.putExtra(Intent.EXTRA_TEXT, "https://www.youtube.com/watch?v=gUqH6Weyr2M");

                startActivity(Intent.createChooser(share, "It's Pizza Time!"));
            }
        });

        Button btnMaps = findViewById(R.id.btnMaps);
        btnMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri gmmIntentUri = Uri.parse("geo:31.859163,-116.623395");
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                if(mapIntent.resolveActivity(getPackageManager()) != null){
                    startActivity(mapIntent);
                }
            }
        });

        Button
    }
}
