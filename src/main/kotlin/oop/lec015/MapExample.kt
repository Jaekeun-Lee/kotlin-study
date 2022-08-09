package oop.lec015

fun main() {

    val oldMap = mutableMapOf<Int, String>()
    oldMap[1] = "MONDAY"
    oldMap[2] = "TUESDAY"

    val mapOf = mapOf(
        1 to "MON",
        2 to "TUE"
    )

    printMapValues(oldMap, printStr = "OLD MAP")
    printMapValues(mapOf, printStr = "MAP OF")

    oldMap.entries
    oldMap.keys
}