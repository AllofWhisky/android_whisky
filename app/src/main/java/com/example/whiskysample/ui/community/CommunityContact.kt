package com.example.whiskysample.ui.community

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "communityContact")
data class CommunityContact(
    @PrimaryKey(autoGenerate = true)
    var id : Long?,

    @ColumnInfo(name = "writer")
    var writer: String,

    @ColumnInfo(name = "title")
    var title: String,

    @ColumnInfo(name = "contents")
    var contents: String,
){
    constructor() : this(null,"","","")
 }