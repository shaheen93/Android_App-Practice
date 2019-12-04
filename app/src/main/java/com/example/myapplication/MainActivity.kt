package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        nxtbutton.setOnClickListener{
            val txt:String=edit_text.text.toString()
            val intent= Intent(this,Main2Activity::class.java)
            intent.putExtra("1",txt)
            startActivity(intent)
        }
    }


}
