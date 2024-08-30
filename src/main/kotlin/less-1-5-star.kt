package org.example

fun main(){

    var seconds: Int = 6480 //количество секунд которое Гагарин провел в космосе
    val minute: Int
    val hour: Int

    hour = seconds / 3600
    minute = (seconds % 3600) / 60
    seconds = (seconds % 3600) % 60

    println("0$hour:$minute:0$seconds")

}