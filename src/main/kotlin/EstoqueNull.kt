fun main() {
    println(calcularValorEstoque("10", "2,5"))
    println(calcularValorEstoque(null, "2.5"))
    println(calcularValorEstoque("-3", "4.0"))
    println(calcularValorEstoque("abc", "2.5"))
    println(calcularValorEstoque("0", "2,5"))

}

fun calcularValorEstoque(qtd: String?, preco: String?): Double? {
    val qtdInt = qtd?.toIntOrNull()
    val precoDouble = preco?.replace(",", ".")?.toDoubleOrNull()



    return if (qtdInt != null && precoDouble != null && qtdInt >= 0 && precoDouble >= 0) {
        qtdInt * precoDouble
    } else {
        null
    }

}