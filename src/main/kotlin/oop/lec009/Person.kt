package oop.lec009

fun main() {
    val kotlinPerson = Person("코틀린이재근", 100)
    val javaPerson = JavaPerson("자바이재근", 50)
    val subConstructor1 = Person("부생성자")
    val subConstructor2 = Person()

    println("kotlinPerson.name = ${kotlinPerson.name}")
    println("javaPerson.name = ${javaPerson.name} \n")

    println("kotlinPerson.age = ${kotlinPerson.age}")
    println("javaPerson.age = ${javaPerson.age} \n")

    kotlinPerson.age = 90
    javaPerson.age = 40

    println("update kotlinPerson.age = ${kotlinPerson.age}")
    println("update javaPerson.age = ${javaPerson.age}")
}


class Person(val name: String = "이재근", var age: Int) {

    //    custom getter - backing field
//    val name = name
//        get() = field.uppercase()

//    var age = age
//        get() = 3


    //    fun getUppercaseName(): String = this.name.uppercase()
    fun getUppercaseName(): String {
        return this.name.uppercase()
    }



    init {
        if (age < 1) {
            throw IllegalAccessException("나이는 1살 이상이어야 합니다.")
        }
        println("Kotlin Person init ========= \n 초기화 블록 바디에도 코드 가능. \n")
    }


    // 부생성자 - 추가적으로 생성자 만들고 싶을 때 사용
    // 부생성자보단 default parameter 사용
    // Converting 해야하는 경우 사용할 수 있지만 그런경우는 보통 정적 팩터리 메소드 이용

    constructor() : this("기본값") {
        println("부생성자 호출 / 부생성자 바디에 코드 넣을 수 있음!")
    }

    constructor(name: String) : this(name, 1) {
        println("부생성자 호출 / this(name, 1) :: 부생성자 바디에 코드 넣을 수 있음!!")
    }




    // 객체의 속성 -> custom getter 그 이외의 경우는 함수형 추천
    // 1. 함수처럼 만드는 방법
    fun isAdultFun(): Boolean {
        return this.age >= 19
    }

    // 2. 프로퍼티로 만드는 방법
    val isAdultProps: Boolean
        get() {
            return this.age >= 19
        }

    // 3. Expression
    val isAdultExpression: Boolean
        get() = this.age >= 19
}

