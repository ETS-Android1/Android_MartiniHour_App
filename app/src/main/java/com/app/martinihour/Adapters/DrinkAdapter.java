package com.app.martinihour.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.app.martinihour.Model.Drink;
import com.app.martinihour.R;
import com.app.martinihour.Database.DatabaseHelper;
import java.util.ArrayList;

public class DrinkAdapter extends RecyclerView.Adapter<DrinkViewHolder> {
    // initialize context of app and list array
    Context context;
    ArrayList<Drink> drinkArrayList;
    private static final String TAG = "DrinkAdapter";
    // making object of database helper class
    private DatabaseHelper databaseHelper;
    String listType;

    // making constructor for adapter
    public DrinkAdapter(Context context, ArrayList<Drink> drinkArrayList, String type) {
        this.context = context;
        this.drinkArrayList = drinkArrayList;
        databaseHelper = new DatabaseHelper(context);
        listType = type;
    }

    // override method that will come with adapter
    @NonNull
    @Override
    public DrinkViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.drink_item_layout, null);
        return new DrinkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull DrinkViewHolder holder, int position) {
        // checking the condition of if it is list of items of saved list
        // listType(is fav=yes/no)
        if (listType.equals("no") || listType.equals("ran")) {
            holder.add_to_favourite.setVisibility(View.VISIBLE);
            holder.remove_favourite_btn.setVisibility(View.GONE);
        } else if (listType.equals("yes")) {
            holder.add_to_favourite.setVisibility(View.GONE);
            holder.remove_favourite_btn.setVisibility(View.VISIBLE);
        }

        // fetching the id's of list and set text from items
        Drink dr = drinkArrayList.get(position);
        holder.drink_name.setText(dr.getName_drink());
        holder.drink_description.setText(dr.getDescription_drink());
        holder.drink_recipe.setText(dr.getRecipe_drink());
        holder.drink_image.setImageResource(dr.getDrink_image());
       // Log.d(TAG, "onBindViewHolder: " + drinkArrayList.get(position).getDrink_image());

        // add favourite listener
        holder.add_to_favourite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!databaseHelper.CheckIfDataAlreadyInDBorNot(drinkArrayList.get(position).getDrink_image())) {
                    databaseHelper.addDrinksDetails(drinkArrayList.get(position).getName_drink(),
                            drinkArrayList.get(position).getDescription_drink(),
                            drinkArrayList.get(position).getRecipe_drink(),
                            drinkArrayList.get(position).getDrink_image());
                    Toast.makeText(context, "Added", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(context, "Already Added", Toast.LENGTH_SHORT).show();
                }
            }
        });

        // for items remove button that will remove the item from list
        holder.remove_favourite_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                databaseHelper.deleteDrink(drinkArrayList.get(position).getDrinkId());
                // Toast = message txt
                Toast.makeText(context, "Removed", Toast.LENGTH_SHORT).show();
                // Remove from List as well
                drinkArrayList.remove(position);
                notifyDataSetChanged();
            }
        });

    }

    @Override
    public int getItemCount() {
        // checking the size of items in list
        //	if the type is ran will show 1
        if (listType.equals("ran")) {
            return Math.min(drinkArrayList.size(), 1);
        } else {
            return drinkArrayList.size();
        }
    }
}
