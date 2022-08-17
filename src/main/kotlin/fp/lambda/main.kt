package fp.lambda


fun main() {
    val fruits = listOf(
        Fruit("사과", 1_000),
        Fruit("사과", 1_200),
        Fruit("사과", 1_200),
        Fruit("사과", 1_400),
        Fruit("사과", 1_400),
        Fruit("사과", null),
        Fruit("사과", null),
        Fruit("바나나", 2_100),
        Fruit("바나나", 2_300),
        Fruit("바나나", 2_300),
        Fruit("바나나", null),
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


    val apples = fruits.filter { fruit -> fruit.name == "사과" }
    val bananasPrice = fruits.filter { fruit -> fruit.name == "바나나" }.map { fruit -> fruit.price }

    fruits.filterIndexed { idx, fruit ->
        if (fruit.name == "수박") {
            println(idx)
        }
        fruit.name == "수박"
    }

    fruits.filter { fruit -> fruit.name == "사과" }.mapNotNull { it.price }.forEach { println(it) }
    fruits.filter { it.name == "바나나" && it.price == null }

    fruits.all { it.name == "사과" }
    fruits.none { it.name == "사과" }
    fruits.any { (it.price ?: 0) > 10_000 }
    fruits.count()
    fruits.sortedBy { it.price }
    fruits.sortedByDescending { it.price }
    fruits.distinctBy { it.name }.map { it.name }

    val groupBy: Map<String, List<Fruit>> = fruits.groupBy { it.name }.filter { (key, value) -> key == "사과" }


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

