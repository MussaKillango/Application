package com.example.application.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.application.model.Item;

import java.util.List;

@Dao
public interface ItemDao {

    @Insert
    void insert(Item item);

    @Update
    void update(Item item);

    @Delete
    void delete(Item item);

    @Query("DELETE FROM item_table")
    void deleteAllItem();

    @Query("SELECT * FROM item_table ORDER BY priority_col DESC")
    LiveData<List<Item>> getAllItem();

}
