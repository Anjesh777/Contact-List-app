package com.example.myapplication

import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Upsert
import kotlinx.coroutines.flow.Flow

interface ContactDao {

    @Upsert
    suspend fun insertContact(contact: Contact)

    @Delete
    suspend fun deleteContact(contact: Contact)

    fun GetContactsOrderByFirstName(): Flow<List<Contact>>
    fun GetContactsOrderByLastName(): Flow<List<Contact>>
}