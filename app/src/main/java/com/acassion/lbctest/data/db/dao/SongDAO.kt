package com.acassion.lbctest.data.db.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.acassion.lbctest.data.entity_model.SongEntityModel

@Dao
interface SongDAO {
    @Query("SELECT * FROM song")
    fun getAll(): List<SongEntityModel>

    @Insert
    fun insertAll(vararg users: SongEntityModel)
}