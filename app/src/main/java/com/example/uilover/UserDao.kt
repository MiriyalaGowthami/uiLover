package com.example.uilover

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.RewriteQueriesToDropUnusedColumns


@Dao
interface UserDao {
    @Insert
     fun insertUser(user: User)

    @RewriteQueriesToDropUnusedColumns
    @Query("SELECT * FROM users WHERE email = :email AND password = :password LIMIT 1")
     fun login(email: String, password: String): User?

}
