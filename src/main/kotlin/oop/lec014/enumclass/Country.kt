package oop.lec014.enumclass

fun handleCountry(country: Country) {
    when (country) {
        Country.KOREA -> TODO()
        Country.AMERICA -> TODO()
    }
}


enum class Country(
    private val code: String
) {
    KOREA("ko"),
    AMERICA("us");
}