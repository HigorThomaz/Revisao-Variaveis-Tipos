fun main() {
    println(situacao(listOf(8.0, 6.0), listOf(1, 1)))
    println(situacao(listOf(), listOf()))
    println(situacao(listOf(5.0, 6.0, 4.0), listOf(2, 3, 1)))
    println(situacao(listOf(8.0, 6.0), listOf(1)))
    println(situacao(listOf(8.0), listOf(0)))
    println(situacao(listOf(8.0, 6.0), listOf(0, 2)))
}

fun situacao(notas: List<Double>, pesos: List<Int>): String {

    if (notas.size != pesos.size) {
        return "Dados invalidos"
    }
    if (notas.isEmpty()) {
        return "Sem notas"
    }

    var somaPesos = 0
    var mediaProvisoria = 0.0

    for (i in notas.indices) {
        somaPesos += pesos[i]
        mediaProvisoria += notas[i] * pesos[i]
    }

    if (somaPesos <= 0) {
        return "Dados Inválidos"
    }


    val mediaPonderada = mediaProvisoria / somaPesos


    return if (mediaPonderada >= 7.00) {
        ("Aprovado (%.2f)").format(mediaPonderada)
    } else if (mediaPonderada >= 5) {
        ("Recuperação (%.2f)".format(mediaPonderada))
    } else {
        ("Reprovado (%.2f)").format(mediaPonderada)
    }


}