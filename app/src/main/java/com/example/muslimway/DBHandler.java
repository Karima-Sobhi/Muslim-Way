package com.example.muslimway;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHandler extends SQLiteOpenHelper {



    private static final String DB_NAME = "Zekrdb";


    private static final int DB_VERSION = 1;


    private static final String TABLE_NAME = "MyZekr";


    private static final String ID_COL = "id";


    private static final String NAME_COL = "name";


    public DBHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {

        String query = "CREATE TABLE " + TABLE_NAME + " ("
                + ID_COL + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + NAME_COL + " TEXT)";

        db.execSQL(query);
    }


    public void addNewZekr(String ZekrName) {

        SQLiteDatabase db = this.getWritableDatabase();

        ContentValues values = new ContentValues();

        values.put(NAME_COL, ZekrName);
        db.insert(TABLE_NAME, null, values);

        db.close();
    }


    public ArrayList<CourseModal> readZekr() {

        SQLiteDatabase db = this.getReadableDatabase();


        Cursor cursorZekr = db.rawQuery("SELECT * FROM " + TABLE_NAME, null);

        ArrayList<CourseModal> courseModalArrayList = new ArrayList<>();

        if (cursorZekr.moveToFirst()) {
            do {

                courseModalArrayList.add(new CourseModal(cursorZekr.getString(1)));
            } while (cursorZekr.moveToNext());

        }

        cursorZekr.close();
        return courseModalArrayList;
    }

    // below is the method for updating our course
    public void updateCourse(String originalZekrName, String ZekrName) {


        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(NAME_COL, ZekrName);


        db.update(TABLE_NAME, values, "name=?", new String[]{originalZekrName});
        db.close();
    }


    public void deleteZekr(String ZekrName) {

        SQLiteDatabase db = this.getWritableDatabase();

        db.delete(TABLE_NAME, "name=?", new String[]{ZekrName});
        db.close();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}