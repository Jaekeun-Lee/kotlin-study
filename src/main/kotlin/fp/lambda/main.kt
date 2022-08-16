package fp.lambda


fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_400),
        Fruit("사과", 1_400),
        Fruit("사과", 1_700),
        Fruit("바나나", 2_100),
        Fruit("바나나", 2_300),
        Fruit("바나나", 2_300),
        Fruit("수박", 10_500),
        Fruit("수박", 13_500),
    )

    val isApple: (Fruit) -> Boolean = fun(fruit: Fruit): Boolean = fruit.name == "사과"
    val isApple2: (Fruit) -> Boolean = { fruit: Fruit -> fruit.name == "사과" }

    isApple(fruits[0])
    isApple.invoke(fruits[0])

    filterFruits(fruits, { fruit -> fruit.name == "사과" })
    filterFruits(fruits) { fruit -> fruit.name == "사과" } // 마지막에 함수를 받을 경우 소괄호 밖으로 함수 뺄 수 있음.
    filterFruits(fruits) { it.name == "사과" }

}

private fun filterFruits(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val result = mutableListOf<Fruit>()
    for (fruit in fruits) {
        if (filter(fruit)) {
            result.add(fruit)
        }
    }

    return result
}

