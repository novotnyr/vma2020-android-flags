package com.github.novotnyr.android.flags;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FlagViewHolder extends RecyclerView.ViewHolder {
    private ImageView icon;

    private TextView textView;

    public FlagViewHolder(View layout) {
        super(layout);
        icon = layout.findViewById(android.R.id.icon);
        textView = layout.findViewById(android.R.id.text1);
    }

    public void bind(final Flag flag, final FlagOnClickListener flagOnClickListener) {
        icon.setImageResource(flag.getResource());

        textView.setText(flag.getCountry());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                flagOnClickListener.onFlagClick(flag);
            }
        });
    }
}