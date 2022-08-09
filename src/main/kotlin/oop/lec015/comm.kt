package oop.lec015

fun <T> printArrayValues(arr: Array<T>, printStr: String) {
    printCollectionValues(arr.toList(), printStr)
}

fun <E> printCollectionValues(elements: Collection<E>, printStr: String): Unit {
    println("\n===============\n[$printStr]")
    for ((idx, value) in elements.withIndex()) {
        println("$idx : $value")
    }
}

fun <K, V> printMapValues(map: Map<K, V>, printStr: String): Unit {
    println("\n===============\n[$printStr]")
    for ((idx, value) in map.entries) {
        println("$idx : $value")
    }
}