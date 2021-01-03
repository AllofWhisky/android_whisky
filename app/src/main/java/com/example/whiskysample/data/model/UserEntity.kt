package com.example.whiskysample.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.example.whiskysample.constants.LoginType

@Entity(tableName = "User")
data class UserEntity(
    @PrimaryKey(autoGenerate = true) var id: String, // null 일 경우 자동 생성
    @ColumnInfo(name = "name") var name: String,

) {
    constructor() : this("", "")
}