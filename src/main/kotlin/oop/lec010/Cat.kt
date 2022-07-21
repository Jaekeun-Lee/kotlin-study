package oop.lec010

class Cat(
    species: String, legCount: Int
) : Animal(species, 4) {
    override fun move() {
        println("코틀린 고양이 걸어가~")
    }

}