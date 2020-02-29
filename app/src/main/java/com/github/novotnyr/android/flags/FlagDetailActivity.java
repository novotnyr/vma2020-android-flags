package com.github.novotnyr.android.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class FlagDetailActivity extends AppCompatActivity {
    private ImageView flagImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_detail);

        flagImageView = findViewById(R.id.flagImageView);
    }
}
