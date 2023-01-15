package com.angesh.quizappassignment7.repository

import com.angesh.quizappassignment7.data.Quiz

interface QuizRepository {
    suspend fun addQuizQuestions(quizList : MutableList<Quiz>)
    suspend fun addQuiz(quiz: Quiz)
    suspend fun getQuizList(): MutableList<Quiz>
    suspend fun resetQuestionSet()
}