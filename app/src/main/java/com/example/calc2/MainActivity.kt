package com.example.calc2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    var k1=""
    var k2=""
    var sign=""
    var solution1=0.0
    var solution2:Long=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var one=findViewById<TextView>(R.id.one)
        var two=findViewById<TextView>(R.id.two)
        var three=findViewById<TextView>(R.id.three)
        var four=findViewById<TextView>(R.id.four)
        var five=findViewById<TextView>(R.id.five)
        var six=findViewById<TextView>(R.id.six)
        var seven=findViewById<TextView>(R.id.seven)
        var eigth=findViewById<TextView>(R.id.eigth)
        var nine=findViewById<TextView>(R.id.nine)
        var zero=findViewById<TextView>(R.id.zero)
        var add=findViewById<TextView>(R.id.add)
        var minus=findViewById<TextView>(R.id.minus)
        var product=findViewById<TextView>(R.id.product)
        var divide=findViewById<TextView>(R.id.divide)
        var clear=findViewById<TextView>(R.id.clear)
        var dot=findViewById<TextView>(R.id.dot)
        var answer=findViewById<TextView>(R.id.answer)
        var equal=findViewById<TextView>(R.id.equal)
        one.setOnClickListener(){
            if (sign==""){
                k1+="1"
            }
            else{
                k2+="1"
            }
           answer.text=k1+sign+k2
        }
        two.setOnClickListener(){
            if (sign==""){
                k1+="2"
            }
            else{
                k2+="2"
            }
            answer.text=k1+sign+k2

        }
        three.setOnClickListener(){
            if (sign==""){
                k1+="3"
            }
            else{
                k2+="3"
            }
            answer.text=k1+sign+k2

        }
        four.setOnClickListener(){
            if (sign==""){
                k1+="4"
            }
            else{
                k2+="4"
            }
            answer.text=k1+sign+k2

        }
        five.setOnClickListener(){
            if (sign==""){
                k1+="5"
            }
            else{
                k2+="5"
            }
            answer.text=k1+sign+k2

        }
        six.setOnClickListener(){
            if (sign==""){
                k1+="6"
            }
            else{
                k2+="6"
            }
            answer.text=k1+sign+k2

        }
        seven.setOnClickListener(){
            if (sign==""){
                k1+="7"
            }
            else{
                k2+="7"
            }
            answer.text=k1+sign+k2

        }
        eigth.setOnClickListener(){
            if (sign==""){
                k1+="8"
            }
            else{
                k2+="8"
            }
            answer.text=k1+sign+k2

        }
        nine.setOnClickListener(){
            if (sign==""){
                k1+="9"
            }
            else{
                k2+="9"
            }
            answer.text=k1+sign+k2

        }
        zero.setOnClickListener(){
            if (sign==""){
                k1+="0"
            }
            else{
                k2+="0"
            }
            answer.text=k1+sign+k2

        }
        dot.setOnClickListener(){
            if (sign==""){
                k1+="."
            }
            else{
                k2+="."
            }
            answer.text=k1+sign+k2

        }
        add.setOnClickListener(){
            sign="+"
            answer.text=k1+sign+k2

        }
        minus.setOnClickListener(){
            sign="-"
            answer.text=k1+sign+k2

        }
        product.setOnClickListener(){
            sign="*"
            answer.text=k1+sign+k2

        }
        divide.setOnClickListener(){
            sign="/"
            answer.text=k1+sign+k2

        }
        clear.setOnClickListener(){
            sign=""
            answer.text=""
            k1=""
            k2=""


        }
        equal.setOnClickListener(){
            if (sign=="+"){
                if(("." in k1)or("." in k2) ){
                    solution1=(k1.toDouble())+(k2.toDouble())

                    answer.text=solution1.toString()
                }
                else
                {
                    solution2=(k1.toLong())+(k2.toLong())
                    answer.text=solution2.toString()
                }
            }
            if (sign=="-"){
                if(("." in k1)or("." in k2) ){
                    solution1=(k1.toDouble())-(k2.toDouble())

                    answer.text=solution1.toString()
                }
                else
                {
                    solution2=(k1.toLong())-(k2.toLong())
                    answer.text=solution2.toString()
                }
            }
            if (sign=="*"){

            if(("." in k1)or("." in k2) ){
            solution1=(k1.toDouble())*(k2.toDouble())

            answer.text=solution1.toString()
        }
        else
        {
            solution2=(k1.toLong())*(k2.toLong())
            answer.text=solution2.toString()
        }}
            if (sign=="/"){

                        solution1=(k1.toDouble())/(k2.toDouble())
                        answer.text=solution1.toString()
                                      }
                            }



    }
}