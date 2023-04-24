package com.example.calculater

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var isNewOP=true
    var oldNumber=""
    
    var op="+"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }


//
    fun numberEvent(view: View) {
if (isNewOP)editText.setText("")
isNewOP=false
        var buClick=editText.text.toString()
        var buSelect = view as Button
        when(buSelect.id){
            bu1.id->{buClick+="1"}
            bu2.id->{buClick+="2"}
            bu3.id->{buClick+="3"}
            bu4.id->{buClick+="4"}
            bu5.id->{buClick+="5"}
            bu6.id->{buClick+="6"}
            bu7.id->{buClick+="7"}
            bu8.id->{buClick+="8"}
            bu9.id->{buClick+="9"}
            bu0.id->{buClick+="0"}
            buDot.id->{buClick+="."}
            buPlusMinus.id->{buClick= "-$buClick"}
        }
        editText.setText(buClick)
    }


    fun clearFn(view: View) {
editText.setText("0")
        isNewOP=true

    }

    fun operatorEvent(view: View) {
isNewOP=true;
        oldNumber=editText.text.toString()
        var buSelect=view as Button
        when(buSelect.id){
            buMul.id->{op="*"}
            buDevide.id->{op="/"}
            bumin.id->{op="-"}
            buPlus.id->{op="+"}
        }

    }

    fun equelvent(view: View) {
        var newNumber=editText.text.toString()
        var result=0.0
        when(op){
            "+"->{result=oldNumber.toDouble()+newNumber.toDouble()}
            "-"->{result=oldNumber.toDouble()-newNumber.toDouble()}
            "*"->{result=oldNumber.toDouble()*newNumber.toDouble()}
            "/"->{result=oldNumber.toDouble()/newNumber.toDouble()}
        }
      editText.setText(result.toString())

    }

    fun percentageEvent(view: View) {
        var percentage=editText.text.toString().toDouble()/100
        editText.setText(percentage.toString())
        isNewOP=true
    }

    fun clearEvent(view: View) {
        var percentage=editText.text.toString()
        editText.setText(percentage.dropLast(1))


    }


}