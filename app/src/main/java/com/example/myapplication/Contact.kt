package com.example.myapplication

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Contact(
    @PrimaryKey(autoGenerate = true)
    val ID:Int? = null,
    val firstName:String,
    val lastName:String,
    val phoneNumber: Number


)
