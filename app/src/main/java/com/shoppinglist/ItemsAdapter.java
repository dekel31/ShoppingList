package com.shoppinglist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by dekel31 on 12/3/2016.
 */

public class ItemsAdapter extends RecyclerView.Adapter<ItemViewHolder> {
    private final List<ItemType> itemTypes;

    public ItemsAdapter(List<ItemType> itemTypes) {
        this.itemTypes = itemTypes;
    }

    @Override
    public ItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
//        ItemTypeView view = new ItemTypeView(parent.getContext());

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_type_textview, parent, false);

        return new ItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ItemViewHolder holder, int position) {
        holder.getView().setText(itemTypes.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return itemTypes.size();
    }
}
