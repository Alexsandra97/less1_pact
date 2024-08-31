package org.example

fun main() {

    val timeConst: Int = 60
    val seconds: Int = 6480
    val minute: Int = (seconds % (timeConst * timeConst)) / timeConst
    val hour: Int = seconds / (timeConst * timeConst)
    val secSecond: Int = (seconds % (timeConst * timeConst)) % timeConst

    println(String.format("%02d:%02d:%02d", hour, minute, secSecond))
}