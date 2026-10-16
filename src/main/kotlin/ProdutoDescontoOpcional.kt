class Produto(val nome: String, val preco: Double, val quantidade: Int, val desconto: Double? = null) {

    // fun precoFinal deve retornar o preço unitário com o desconto aplicado
    fun precoFinal(): Double {

        return if (desconto != null && desconto > 0) {
            preco * (100 - desconto) / 100
        } else {
            preco
        }
    }

    // valorTotal deve retornar o valor de precoFinal * quantidade de produtos
    fun valorTotal() : Double {
        return precoFinal() * quantidade
    }
}

fun main() {
    val t = Produto("Teclado", 200.0, 3, null)
    println("${t.nome} - precoFinal: ${t.precoFinal()} - ${t.valorTotal()}")
    val m = Produto("Mouse", 80.0, 2, 25.0)
    println("${m.nome} - precoFinal: ${m.precoFinal()} - ${m.valorTotal()}")
    val c = Produto("Cabo", 10.0, 0, 50.0)
    println("${c.nome} - precoFinal: ${c.precoFinal()} - ${c.valorTotal()}")


}

