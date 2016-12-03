package com.shoppinglist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dekel31 on 12/3/2016.
 */

public class ItemTypeAdapter extends RecyclerView.Adapter<ItemTypeViewHolder> {
    private final List<ItemType> itemTypes;

    public ItemTypeAdapter(List<ItemType> itemTypes) {
        this.itemTypes = itemTypes;
    }

    @Override
    public ItemTypeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ItemTypeView view = new ItemTypeView(parent.getContext());

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_type_textview, parent, false);

        return new ItemTypeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemTypeViewHolder holder, int position) {
        holder.getView().setText(itemTypes.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemTypes.size();
    }
}
