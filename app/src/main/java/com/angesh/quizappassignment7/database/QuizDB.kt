package com.angesh.quizappassignment7.database

import android.content.Context
import androidx.room.Room
import com.angesh.quizappassignment7.constants.Constant
import com.angesh.quizappassignment7.data.QuizDAO

class QuizDB(context: Context) {

    private var quizDatabase: QuizDatabase = Room.databaseBuilder(
        context,
        QuizDatabase::class.java,
        Constant.DB_NAME
    ).build()

    fun getQuizDAO(): QuizDAO = quizDatabase.quizDAO
}