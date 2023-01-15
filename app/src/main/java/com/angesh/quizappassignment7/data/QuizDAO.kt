package com.angesh.quizappassignment7.data

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface QuizDAO {

    @Query("SELECT * FROM quiz")
    suspend fun getQuizList(): MutableList<Quiz>

    @Query("SELECT * FROM quiz WHERE id= :id")
    suspend fun getQuiz(id: Int): Quiz

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addQuizQuestions(quizList : MutableList<Quiz>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addQuiz(quiz: Quiz)

}