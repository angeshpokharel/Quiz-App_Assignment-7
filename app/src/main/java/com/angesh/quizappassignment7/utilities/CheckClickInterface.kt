package com.angesh.quizappassignment7.utilities

import com.angesh.quizappassignment7.data.AnswerModel

interface CheckClickInterface {
    fun onCheckBoxChecked(answerModel: AnswerModel)
    fun onCheckBoxUnChecked(answerModel: AnswerModel)
}