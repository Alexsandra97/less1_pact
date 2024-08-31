package org.example

fun main() {


    val hoursStart: Int = 9
    val minuteStart: Int = 39
    val minuteWay: Int = 457
    val minuteConst = 60

    val allTime = hoursStart * minuteConst + minuteStart + minuteWay
    val hourseEnd = allTime / minuteConst
    val minuteEnd = allTime % minuteConst

    println("$hourseEnd:$minuteEnd")

}