package com.example.whiskysample.ui.community

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface CommunityDao {
    @Query("SELECT * from communityContact ORDER BY id ASC")
    fun getAll(): LiveData<List<CommunityContact>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(communityContact: CommunityContact)

    @Delete()
    fun delete(communityContact: CommunityContact)

}