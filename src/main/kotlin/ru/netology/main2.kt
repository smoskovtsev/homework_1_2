package ru.netology

fun main() {
    val likes = 221
    val humanSingle = "человеку"
    val humanPlural = "человекам"

    if (likes == 1 || (likes % 10) == 1 && likes !== 11 && (likes % 100) !== 11) {
        println("Понравилось $likes $humanSingle")
    } else {
        println("Понравилось $likes $humanPlural")
    }
}