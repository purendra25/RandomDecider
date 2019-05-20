package app.test.com.randomdecider

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    var foodList = arrayListOf<String>("Chinease","Malay","Indian","Pizza")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnDecide.setOnClickListener{
            val random  = Random()
            val randomFood = random.nextInt(foodList.count())
            tvSelectedFood.text = foodList[randomFood]
        }

        btnAddFood.setOnClickListener {
            if(!foodList.contains(editTextDinner.text.toString()))
                foodList.add(editTextDinner.text.toString())
                editTextDinner.text.clear()
        }



    }
}
