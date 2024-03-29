package com.haud.sctu;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface SmsDao {

    @Insert
    void insert(SmsLog smsLog);

    @Update
    void update(SmsLog smsLog);

    @Delete
    void delete(SmsLog smsLog);

    @Query("DELETE FROM sms_log_table")
    void deleteAllSmsLogs();

    @Query("SELECT * FROM sms_log_table")
    LiveData<List<SmsLog>> getAllSmsLogs();
}
