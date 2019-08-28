package com.mattaker.swoosh

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun leagueNextClicked(view : View){
        val yeet = Toast.makeText(this, "Yeeeet ${findViewById<RadioButton>(rgLeague.checkedRadioButtonId).text.toString()} league", Toast.LENGTH_SHORT)
        yeet.show()
        val skillIntent = Intent(this, SkillActivity::class.java)
        startActivity(skillIntent)
    }
}
