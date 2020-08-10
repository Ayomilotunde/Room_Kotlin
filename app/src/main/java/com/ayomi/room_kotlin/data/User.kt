package com.ayomi.room_kotlin.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user_profile")
data class User (
    @PrimaryKey(autoGenerate = true)
    val id: Int,
    val firstname: String,
    val lastname: String,
    val age: Int

)