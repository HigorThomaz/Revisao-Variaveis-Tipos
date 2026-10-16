fun main() {
    println(calculaTempo(3661))
    println(calculaTempo(0))
    println(calculaTempo(5000000000))
}

fun calculaTempo(totalSegundos: Long): String {
    val horas = totalSegundos / 3600
    val minutos = totalSegundos % 3600 / 60
    val segundos = totalSegundos % 60


    return ("%02d" +
            ":" +
            "%02d" +
            ":" +
            "%02d").format(horas, minutos, segundos)
}