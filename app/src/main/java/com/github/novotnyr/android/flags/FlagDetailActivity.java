package com.github.novotnyr.android.flags;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class FlagDetailActivity extends AppCompatActivity {
    private ImageView flagImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_detail);

        Intent intent = getIntent();
        Flag flag = (Flag) intent.getSerializableExtra("flag");

        setTitle(flag.getCountry());

        flagImageView = findViewById(R.id.flagImageView);
        flagImageView.setImageResource(flag.getResource());
    }
}
