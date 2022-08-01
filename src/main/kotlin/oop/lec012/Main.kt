package oop.lec012

fun main() {
    something(object : Log {
        override fun logging() {
            println("익명클래스 구현 object 키워드 사용")
        }

    })
}


fun something(target: Log): Unit {
    target.logging()
}