package com.example.bmi

class Bmical() {

    var weight:Float=0F
    var height:Float=0F
    fun bmi():Float{

        return weight/(height*height)
    }

}