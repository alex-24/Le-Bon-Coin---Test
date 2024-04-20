package com.acassion.lbctest.data.entity_model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class AlbumEntityModel(
    @PrimaryKey
    var id: Long,

    var title: String,
)