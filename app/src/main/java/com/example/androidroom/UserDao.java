package com.example.androidroom;

import com.example.androidroom.User;

import java.util.List;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface UserDao {
    @Insert
    void insertAll(User... users);
    @Query("SELECT * FROM user")
    List<User> getAll();

}