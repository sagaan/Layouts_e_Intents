package com.ama.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class LayoutsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = getIntent().getExtras().getInt("layout");
        switch (layout){
            case 1:
                setContentView(R.layout.activity_relative);
                Toast.makeText(LayoutsActivity.this, "Soy un Relative Layout", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                setContentView(R.layout.activity_linear);
                Toast.makeText(LayoutsActivity.this, "Soy un Linear Layout", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                setContentView(R.layout.activity_grid);
                Toast.makeText(LayoutsActivity.this, "Soy un Grid Layout", Toast.LENGTH_SHORT).show();
                break;
            case 4:
                setContentView(R.layout.activity_frame);
                Toast.makeText(LayoutsActivity.this, "Soy un Frame Layout", Toast.LENGTH_SHORT).show();
                break;
            case 5:
                setContentView(R.layout.activity_table);
                Toast.makeText(LayoutsActivity.this, "Soy un Table Layout", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
