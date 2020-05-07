package eu.learn.quizapp

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {


    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mCurrentSelected: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionList = Constants.getQuestion()
        setQuestion()

        tv_option_one.setOnClickListener(this)
        tv_option_two.setOnClickListener(this)
        tv_option_tree.setOnClickListener(this)
        tv_option_four.setOnClickListener(this)

    }

    private fun setQuestion(){
        val question = mQuestionList!![mCurrentPosition - 1]
        progress_bar.progress = mCurrentPosition
        tv_progress_bar.text = "$mCurrentPosition / ${progress_bar.max}"
        tv_question.text = question!!.question
        iv_image.setImageResource(question.image)
        tv_option_one.text = question.optionOne
        tv_option_two.text = question.optionTwo
        tv_option_tree.text = question.optionTree
        tv_option_four.text = question.optionFour

        setDefaultView()
    }

    private fun setDefaultView(){
        val options = ArrayList<TextView>()
        options.add(0,tv_option_one)
        options.add(1, tv_option_two)
        options.add(2, tv_option_tree)
        options.add(3, tv_option_four)

        for (option in options){
            option.setTextColor(Color.parseColor("@colors/textColorSecondary"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_option_border_bg)

        }
    }

    private fun setSelectedOption(tv: TextView, selectedOption: Int){
        setDefaultView()
        mCurrentSelected = selectedOption
        tv.setTextColor(Color.parseColor("@colors/textColorPrimary"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)
        tv.background = ContextCompat.getDrawable(this,
            R.drawable.selected_option_border_bg)

    }
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {setSelectedOption(tv_option_one, 1)}
            R.id.tv_option_two -> {setSelectedOption(tv_option_two, 2)}
            R.id.tv_option_tree -> {setSelectedOption(tv_option_tree, 3)}
            R.id.tv_option_four -> {setSelectedOption(tv_option_four, 4)}
            

        }
    }
}
