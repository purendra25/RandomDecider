package app.test.com.randomdecider.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import app.test.com.randomdecider.Model.Player
import app.test.com.randomdecider.R
import app.test.com.randomdecider.Utilities.EXTRA_PLAYER

import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesText.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
