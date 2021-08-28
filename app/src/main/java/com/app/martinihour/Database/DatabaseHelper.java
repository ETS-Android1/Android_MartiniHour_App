package com.app.martinihour.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import com.app.martinihour.Model.Drink;

import java.util.ArrayList;

public class DatabaseHelper extends SQLiteOpenHelper {
    // structure of database
    // initialize the static and public name of database with the name of column
    public static String DATABASE_NAME = "Martini_Hour";
    private static final int DATABASE_VERSION = 1;
    private static final String TABLE_DRINK = "drink";
    private static final String COL_ID = "id";
    private static final String COL_NAME = "name";
    private static final String COL_DES = "des";
    private static final String COL_RECIPE = "recipe";
    private static final String COL_IMAGE = "image";

    // create table drinks
    private static final String CREATE_TABLE_DRINKS = "CREATE TABLE "
            + TABLE_DRINK + "(" + COL_ID
            + " INTEGER PRIMARY KEY AUTOINCREMENT," +
            COL_NAME + " TEXT NOT NULL, " +
            COL_DES + " TEXT NOT NULL, " +
            COL_RECIPE + " TEXT NOT NULL, " +
            COL_IMAGE + " INTEGER " +
            "); ";

    //  double check (version database)
    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
        Log.d("table", CREATE_TABLE_DRINKS);
    }

    // create query
    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_DRINKS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS '" + TABLE_DRINK + "'");
        onCreate(db);
    }


    // add drinks in db
    public long addDrinksDetails(String name, String des, String recipe, int image) {

        SQLiteDatabase db = this.getWritableDatabase();
        // Creating content values
        ContentValues values = new ContentValues();
        values.put(COL_NAME, name);
        values.put(COL_DES, des);
        values.put(COL_RECIPE, recipe);
        values.put(COL_IMAGE, image);
        long insert = db.insert(TABLE_DRINK, null, values);

        return insert;
    }


    // getting all drinks data from db
    // create array list
    public ArrayList<Drink> getAllDrinks() {
        ArrayList<Drink> drinksModelArrayList = new ArrayList<>();

        // query, Select data from table TABLE_DRINK
        String selectQuery = "SELECT  * FROM " + TABLE_DRINK;

        SQLiteDatabase db = this.getReadableDatabase();
        Cursor c = db.rawQuery(selectQuery, null);
        // looping through all rows and adding to list
        if (c.moveToFirst()) {
            do {
                Drink drinksModel = new Drink();
                drinksModel.setDrinkId(c.getInt(c.getColumnIndex(COL_ID)));
                drinksModel.setName_drink(c.getString(c.getColumnIndex(COL_NAME)));
                drinksModel.setDescription_drink(c.getString(c.getColumnIndex(COL_DES)));
                drinksModel.setRecipe_drink(c.getString(c.getColumnIndex(COL_RECIPE)));
                drinksModel.setDrink_image(c.getInt(c.getColumnIndex(COL_IMAGE)));
                // adding to list
                drinksModelArrayList.add(drinksModel);
            } while (c.moveToNext());
        }
        return drinksModelArrayList;
    }


    // delete specific drink from db
    public void deleteDrink(int id) {
        SQLiteDatabase db = this.getWritableDatabase();
        db.delete(TABLE_DRINK, COL_ID + " = ?",new String[]{String.valueOf(id)});
    }


    //checking item by image ID if already present or not
    public boolean CheckIfDataAlreadyInDBorNot(int fieldValue) {
        SQLiteDatabase sqldb = this.getReadableDatabase();
        String Query = "Select * from " + TABLE_DRINK + " where " + COL_IMAGE + " = " + fieldValue;
        Cursor cursor = sqldb.rawQuery(Query, null);
        if (cursor.getCount() <= 0) {
            cursor.close();
            return false;
        }
        cursor.close();
        return true;
    }

}
