package com.shoppinglist;

import android.support.v7.app.ActionBar;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by dekel31 on 12/3/2016.
 */
public class ItemViewHolder extends RecyclerView.ViewHolder{
    private ItemView view;

    public ItemViewHolder(View itemView) {
        super(itemView);
    }

    public void setView(ItemView view) {
        this.view = view;
    }

    public ItemView getView() {
        return view;
    }
}
