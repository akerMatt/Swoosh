package com.mattaker.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        btnFinish.setOnClickListener {
            val selectedOption = rgTier.checkedRadioButtonId
            val selectionText = findViewById<RadioButton>(selectedOption).text.toString()
            val yeetToast = Toast.makeText(this, "You are a ${selectionText.toLowerCase()}", Toast.LENGTH_SHORT)
            yeetToast.show()
        }
    }
}
