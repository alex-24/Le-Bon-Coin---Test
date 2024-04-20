package com.acassion.lbctest.data.entity_model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "song")
data class SongEntityModel(
    @PrimaryKey
    var id:Long = -1,

    @ColumnInfo(name = "album_id")
    var albumId:Int? = null,

    var title:String? = null,

    var url:String? = null,

    @ColumnInfo(name = "thumbnail_url")
    var thumbnailUrl:String? = null,
)