package com.example.linearlayoutusingthelayouteditor
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*


lateinit var text : EditText
lateinit var textview : TextView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text = findViewById(R.id.simpleEditText)
        textview = findViewById(R.id.nickname_text)
        val button : Button = findViewById(R.id.button)

        button.setOnClickListener {
            takeName()
        }
    }
    private fun takeName(){
        text.visibility = View.GONE
        button.visibility = View.GONE
        val str : String = text.getText().toString()
        textview.setText(str)
        textview.visibility = View.VISIBLE
        textview.requestFocus()
    }
}