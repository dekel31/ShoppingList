package com.shoppinglist;

import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by dekel31 on 12/3/2016.
 */

public class ItemTypeViewHolder extends RecyclerView.ViewHolder {
    private ItemTypeView view;

    public ItemTypeView getView() {
        return view;
    }

    public void setView(ItemTypeView view) {
        this.view = view;
    }

    public ItemTypeViewHolder(View itemView) {
        super(itemView);
        this.view = view;
    }
}
