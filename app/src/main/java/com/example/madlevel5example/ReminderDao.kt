package com.example.madlevel5example

import androidx.room.*


import androidx.lifecycle.LiveData

@Dao
interface ReminderDao {

    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): LiveData<List<Reminder>>

    @Insert
    suspend fun insertReminder(reminder: Reminder)

    @Delete
    suspend fun deleteReminder(reminder: Reminder)

    @Update
    suspend fun updateReminder(reminder: Reminder)

}