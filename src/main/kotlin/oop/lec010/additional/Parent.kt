package oop.lec010.additional

open class Parent(
    open val name: String, // 상위클래스를 설계할 때 생성자 또는 초기화 블록에 사용되 프로퍼티에는 open을 피해야 한다.
    open var age: Int
) : Thinkable{
    init {
        // 하위 클래스의 필드에 접근하면 안됨. -> final인 프로퍼티에만 접근
        println("${this.javaClass.canonicalName} // $name , $age")
    }
    override fun thinkCreativeIdea() {
        println("Great Think")
    }

}