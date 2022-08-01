package oop.lec012

class KtFactory private constructor(
    val name: String,
    val age: Int
){
    companion object {
        private const val MIN_AGE = 1
        fun newBaby(name: String): KtFactory {
            return KtFactory(name, MIN_AGE)
        }

        @JvmStatic
        fun newBaby2(name: String): KtFactory {
            return KtFactory(name, MIN_AGE)
        }
    }
}