package com.github.novotnyr.android.flags;

import java.util.Objects;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

public class FlagDiff extends DiffUtil.ItemCallback<Flag> {
    @Override
    public boolean areItemsTheSame(@NonNull Flag oldItem, @NonNull Flag newItem) { //<1>
        return Objects.equals(oldItem, newItem);
    }

    @Override
    public boolean areContentsTheSame(@NonNull Flag oldItem, @NonNull Flag newItem) { //<2>
        return areItemsTheSame(oldItem, newItem);
    }
}