package com.github.novotnyr.android.flags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class FlagListActivity extends AppCompatActivity implements FlagOnClickListener {
    private RecyclerView flagsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_list);

        FlagListAdapter flagAdapter = new FlagListAdapter(this);

        flagsRecyclerView = findViewById(R.id.flagsRecyclerView);
        flagsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        flagsRecyclerView.setAdapter(flagAdapter);
    }

    @Override
    public void onFlagClick(Flag flag) {
        Intent showFlagIntent = new Intent(this, FlagDetailActivity.class);
        showFlagIntent.putExtra("flag", flag);
        startActivity(showFlagIntent);
    }
}
