package com.github.novotnyr.android.flags;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Arrays;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

public class FlagListAdapter extends ListAdapter<Flag, FlagViewHolder> {
    private FlagOnClickListener flagOnClickListener;

    public FlagListAdapter(FlagOnClickListener flagOnClickListener) {
        super(new FlagDiff());

        this.flagOnClickListener = flagOnClickListener;

        Flag aut = new Flag("Austria", R.drawable.austria);
        Flag cro = new Flag("Croatia", R.drawable.croatia);
        submitList(Arrays.asList(aut, cro));
    }

    @NonNull
    @Override
    public FlagViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View layout = LayoutInflater.from(parent.getContext())
                .inflate(android.R.layout.activity_list_item,
                         parent,
                         false);

        return new FlagViewHolder(layout);
    }

    @Override
    public void onBindViewHolder(@NonNull FlagViewHolder holder, int position) {
        holder.bind(getItem(position), flagOnClickListener);
    }
}