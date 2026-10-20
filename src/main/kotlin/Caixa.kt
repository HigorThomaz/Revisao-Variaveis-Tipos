import kotlin.math.roundToInt

fun main() {
    println(calculaCentavos(mutableListOf()))
    println(calculaCentavos(mutableListOf("0,1", "0,2")))
    println(calculaCentavos(mutableListOf("abc", "10,5")))
    println(calculaCentavos(mutableListOf("0,05")))
    println(calculaCentavos(mutableListOf("0,29")))
    println(calculaCentavos(mutableListOf("1000")))
}

fun calculaCentavos(valores: List<String>): String {


    var soma = 0

    for (i in valores) {
        val valorCentavo = i.replace(",", ".").toDoubleOrNull()
        if (valorCentavo != null) {
            val converteCentavo = valorCentavo * 100
            val valorReal = converteCentavo.roundToInt()
            soma += valorReal
        }



    }

    val valorReais = soma / 100
    val valorCentavos = soma % 100
    return String.format("R$ " +
            "%d" +
            "," +
            "%02d",
        valorReais, valorCentavos
    )

}