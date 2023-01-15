package com.angesh.quizappassignment7.repository

import com.angesh.quizappassignment7.data.Quiz
import com.angesh.quizappassignment7.data.QuizDAO
import com.angesh.quizappassignment7.database.QuizDatabase
import javax.inject.Inject

class QuizRepositoryImpl @Inject constructor(
    private val db: QuizDatabase
) : QuizRepository {

    private var quizDao: QuizDAO = db.quizDAO

    override suspend fun addQuizQuestions(quizList: MutableList<Quiz>) {
        quizDao.addQuizQuestions(quizList)
    }

    override suspend fun addQuiz(quiz: Quiz) {
        quizDao.addQuiz(quiz)
    }

    override suspend fun getQuizList(): MutableList<Quiz> {
        return quizDao.getQuizList()
    }

    override suspend fun resetQuestionSet() {
        db.clearAllTables()
    }

}