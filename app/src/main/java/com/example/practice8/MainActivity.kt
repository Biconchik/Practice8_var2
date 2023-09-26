package com.example.practice8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setNumber(view: View) {
        var bnum:Button = view as Button
        var textView: TextView= findViewById(R.id.textView1)
        var st : String = textView.text.toString()
        /*if(st[0] == '0'){
            textView.text=""
        }*/
        if (textView.text.length<15){
            textView.setText(textView.text.toString() + bnum.text.toString())
        }
    }

    fun onOperator(view: View){
        var bop: Button = view as Button
        var textView: TextView= findViewById(R.id.textView1)
        if (bop.text == "-"){
            textView.setText(textView.text.toString()+bop.text.toString())
        }
        if (bop.text == "+"){
            textView.setText(textView.text.toString()+bop.text.toString())
        }
        if (bop.text == "*"){
            textView.setText(textView.text.toString()+bop.text.toString())
        }
        if (bop.text == "/"){
            textView.setText(textView.text.toString()+bop.text.toString())
        }
        if (bop.text == "C"){
            textView.text.dropLast(2)
        }
    }
    fun result(view: View){
        var bop: Button = view as Button
        var textView: TextView= findViewById(R.id.textView1)
        var result : Int
        for(char in textView.text.toString().toCharArray()){
            if (char == '+'){
                val first = textView.text.toString().substringBefore('+')
                val last = textView.text.toString().substringAfter('+')
                result=first.toInt() + last.toInt()
                textView.setText(result.toString())
            }
            if (char == '-'){
                val first = textView.text.toString().substringBefore('-')
                val last = textView.text.toString().substringAfter('-')
                result=first.toInt() - last.toInt()
                textView.setText(result.toString())
            }
            if (char == '*'){
                val first = textView.text.toString().substringBefore('*')
                val last = textView.text.toString().substringAfter('*')
                result=first.toInt() * last.toInt()
                textView.setText(result.toString())
            }
            if (char == '/'){
                val first = textView.text.toString().substringBefore('/')
                val last = textView.text.toString().substringAfter('/')
                result=first.toInt() / last.toInt()
                textView.setText(result.toString())
            }
    }
    }
}

