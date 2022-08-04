package oop.lec013

fun main() {

}

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {
    class LivingRoom(
        private var area: Double
    ) {
        fun updatearea(size: Double) {
            this.area = size
        }
    }
}