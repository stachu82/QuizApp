package eu.learn.quizapp


object Constants {

    fun getQuestion() : ArrayList<Question>{

        val questionList = ArrayList<Question>()

        val que1 = Question(1,
        "Jakiego kraju to jest flaga?",
        R.drawable.ic_flag_of_argentina,
        "Argentyna","Austria", "Australia", "Brazylia",
            1)

        questionList.add(que1)

        // 2
        val que2 = Question(
            2, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_australia,
            "Angola", "Austria",
            "Australia", "Armenia", 3
        )

        questionList.add(que2)

        // 3
        val que3 = Question(
            3, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_brazil,
            "Belarus", "Belize",
            "Brunei", "Brazil", 4
        )

        questionList.add(que3)

        // 4
        val que4 = Question(
            4, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_belgium,
            "Bahamas", "Belgium",
            "Barbados", "Belize", 2
        )

        questionList.add(que4)

        // 5
        val que5 = Question(
            5, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_fiji,
            "Gabon", "France",
            "Fiji", "Finland", 3
        )

        questionList.add(que5)

        // 6
        val que6 = Question(
            6, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Georgia",
            "Greece", "none of these", 1
        )

        questionList.add(que6)

        // 7
        val que7 = Question(
            7, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_denmark,
            "Dominica", "Egypt",
            "Denmark", "Ethiopia", 3
        )

        questionList.add(que7)

        // 8
        val que8 = Question(
            8, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_india,
            "Ireland", "Iran",
            "Hungary", "India", 4
        )

        questionList.add(que8)

        // 9
        val que9 = Question(
            9, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia", "New Zealand",
            "Tuvalu", "United States of America", 2
        )

        questionList.add(que9)

        // 10
        val que10 = Question(
            10, "Jakiego kraju to jest flaga?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Jordan",
            "Sudan", "Palestine", 1
        )

        questionList.add(que10)

        return questionList
    }
}