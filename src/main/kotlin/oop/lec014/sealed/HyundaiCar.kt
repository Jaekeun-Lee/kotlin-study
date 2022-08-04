package oop.lec014.sealed

fun main() {
    handleCar(Avante())
}

private fun handleCar(car: HyundaiCar): Unit {
    when (car) {
        is Avante -> TODO()
        is Grandeur -> TODO()
        is Sonata -> TODO()
    }
}

sealed class HyundaiCar(
    val name: String,
    val price: Long
) {
    abstract fun ride()
}

class Avante : HyundaiCar("아반떼", 1_000L) {
    override fun ride() {
        TODO("Not yet implemented")
    }
}

class Sonata : HyundaiCar("소나타", 2_000L) {
    override fun ride() {
        TODO("Not yet implemented")
    }
}

class Grandeur : HyundaiCar("그렌저", 3_000L) {
    override fun ride() {
        TODO("Not yet implemented")
    }
}