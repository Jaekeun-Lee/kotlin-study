package oop.lec010.additional

class OldestChild(
    override val name: String,
    override var age: Int
) : Parent(name, age) {
    init {
        println("${this.javaClass.canonicalName} - $name , $age")
    }
}

class YoungestChild(
    override val name: String,
    override var age: Int = 1
) : Parent(name, age) {
    init {
        println("$this")
    }
}