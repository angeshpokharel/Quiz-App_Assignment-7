package com.angesh.quizappassignment7.database

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.angesh.quizappassignment7.data.Quiz
import com.angesh.quizappassignment7.data.QuizDAO
import com.angesh.quizappassignment7.utilities.Converter

@Database(
    entities = [Quiz::class],
    version = 1,
    exportSchema = false
)
@TypeConverters(Converter::class)
abstract class QuizDatabase: RoomDatabase() {
    abstract val quizDAO: QuizDAO
}