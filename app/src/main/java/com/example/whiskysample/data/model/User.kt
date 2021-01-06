package com.example.whiskysample.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.example.whiskysample.constants.LoginType
// 항목에 복합 기본 키가 있으면 다음 코드 스니펫과 같이 @Entity 주석의 primaryKeys 속성을 사용할 수 있습니다.
//@Entity(primaryKeys = arrayOf("first_name", "last_name"))

// 기본적으로는 클래스의 이름을 테이블 이름으로 사용하지만 다른 이름을 사용할 경우
// @Entity(tableName = "users") 이름을 지정해 줄 수 있다. 테이블 이름은 대소문자를 구분하지 않는다.

// 유지하지 않으려는 필드가 항목에 있으면
// @Ignore 를 사용하여 무시할수 있다.

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)
