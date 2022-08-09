package oop.lec015

fun main() {
    val arr = arrayOf(100, 200)
    printArrayValues(arr, "기본 배열")

    val plus = arr.plus(300)
    printArrayValues(plus, "값 추가한 배열")
//    for (i in plus.indices) {
//        println("$i : ${plus[i]}")
//    }
//    println(plus)
//    println(plus.size)
//    println(plus[0])
//    println(plus[1])
//    println(plus[2])

}