package io.github.vftdan.customvk;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by User on 10.03.2017.
 */

public class ItemDataAdapter extends RecyclerView.Adapter<VH> {

    List<ItemData> data;

    @Override
    public VH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new VH(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_messageslist, parent, false));
    }

    public void onBindViewHolder(VH vh, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
