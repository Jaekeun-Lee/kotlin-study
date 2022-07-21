package oop.lec010

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int // 추상 프로퍼티가 아닌경우 open 키워드를 붙혀주어야 함.
) {
    abstract fun move()
}