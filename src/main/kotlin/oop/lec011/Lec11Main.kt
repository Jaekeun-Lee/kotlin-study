package oop.lec011

val publicVal = 3
private val privateVal = 3


fun accessor(): Unit {
    println(publicVal)
    println(privateVal)
}

class Cat private constructor(
    legCnt: Int
)
