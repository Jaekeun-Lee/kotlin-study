package oop.lec015

import java.lang.UnsupportedOperationException
import java.util.*

fun main() {
    val numbers = listOf(100, 200)              // 타입 명시 생략 가능

    val emptyList = emptyList<Int>()            // 타입 명시
    val mutableListOf = mutableListOf(100, 200) // 가변 list
    val immutableList = Collections.unmodifiableList(numbers)
    val toMutableList = numbers.toMutableList()

    try {
        toMutableList.add(300)
        immutableList.add(300)
    } catch (e: UnsupportedOperationException) {
        println("Immutable Collection Element :: 추가 불가능")
    }

    printValues(immutableList, printStr = "불변 리스트")
    printValues(toMutableList, printStr = "가변리스트로 변환 후 값 추가")
}