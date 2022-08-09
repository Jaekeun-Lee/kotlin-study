package oop.lec015

fun main() {
    // 기본적인 Set 구현체는 LinkedHashSet
    val mutableSetOf = mutableSetOf(100L, 100L, 200L, 300L, 100L, 200L)
    printValues(mutableSetOf, printStr = "Set 구현체")
}