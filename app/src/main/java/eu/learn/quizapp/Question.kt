package eu.learn.quizapp

data class Question (
    val id: Int,
    val question: String,
    val image: Int,
    val optionOne: String,
    val optionTwo: String,
    val optionTree: String,
    val optionFour: String,
    val correctAnswer: Int

)

