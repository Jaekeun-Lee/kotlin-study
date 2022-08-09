package oop.lec015

fun <T> printValues(vararg elements: T, printStr: String): Unit {
    println("\n===============\n[$printStr]")
    for ((idx, value) in elements.withIndex()) {
        println("$idx : $value")
    }
}

fun <K, V> printMapValues(vararg map: Map<K, V>, printStr: String): Unit {
    println("\n===============\n[$printStr]")



}