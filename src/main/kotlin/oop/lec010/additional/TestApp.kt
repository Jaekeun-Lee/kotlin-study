package oop.lec010.additional

fun main() {
    val father = Parent("아빠", 50)
    val mother = Parent("엄마", 45)
    val oldestChild = OldestChild("첫쨰", 20)
    val youngestChild = YoungestChild("막내")

    val anonymous = YoungestChild("")

    mother.thinkCreativeIdea()
    oldestChild.stopThink()

}