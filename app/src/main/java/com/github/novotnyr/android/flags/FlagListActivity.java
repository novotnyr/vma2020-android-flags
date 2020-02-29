package com.github.novotnyr.android.flags;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class FlagListActivity extends AppCompatActivity {
    private RecyclerView flagsRecyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_list);

        FlagListAdapter flagAdapter = new FlagListAdapter();

        flagsRecyclerView = findViewById(R.id.flagsRecyclerView);
        flagsRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        flagsRecyclerView.setAdapter(flagAdapter);
    }
}
