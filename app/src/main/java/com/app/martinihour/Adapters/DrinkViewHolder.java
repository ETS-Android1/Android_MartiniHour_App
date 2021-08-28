package com.app.martinihour.Adapters;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.app.martinihour.R;

public class DrinkViewHolder extends RecyclerView.ViewHolder {
    ImageView drink_image;
    Button add_to_favourite, remove_favourite_btn;
    TextView drink_name, drink_description, drink_recipe;
    CardView cardView;

    public DrinkViewHolder(@NonNull View itemView) {
        super(itemView);
        this.drink_image = itemView.findViewById(R.id.drink_Image);
        this.drink_name = itemView.findViewById(R.id.drink_Name);
        this.drink_description = itemView.findViewById(R.id.drink_Description);
        this.drink_recipe = itemView.findViewById(R.id.drink_Recipe);
        this.add_to_favourite = itemView.findViewById(R.id.add_to_favourite);
        this.remove_favourite_btn = itemView.findViewById(R.id.delBtn);
        this.cardView = itemView.findViewById(R.id.cardView);
    }
}
