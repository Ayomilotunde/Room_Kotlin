package com.ayomi.room_kotlin.data

import androidx.lifecycle.LiveData
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

interface UserDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)

   suspend fun addUser(user: User);

    @Query("SELECT * FROM user_profile ORDER BY id ASC")
    fun readAllData(): LiveData<List<User>>
}