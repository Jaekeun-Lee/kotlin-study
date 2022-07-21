package oop.lec010

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount: Int = 2

    override fun move() {
        println("펭귄 뒤뚱뒤뚱 걸어가~")
    }

    override val legCount: Int
        get() = super.legCount + wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }
}