package com.example.beritabolaapp.model

data class Player(
    val id : Int,
    val name : String,
    val age : Int,
    val position : String,
    val description : String,
    val playerImageId : Int = 0
)
