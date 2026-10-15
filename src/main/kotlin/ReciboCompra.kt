fun main(){
    println(calculaPreco("Caderno", 12.50, 4, 10))
    println(calculaPreco("Caneta", 3.99, 1, 0))
    println(calculaPreco("Mochila", 150.00, 0, 20))

}

fun calculaPreco(produto : String, precoUni : Double, quantidade: Int, descPercent : Int) : String{

    val subTotal = precoUni * quantidade
    val desconto = (subTotal * descPercent) / 100
    val total = subTotal - desconto
    return ("${produto} \n" +
            "Subtotal %.2f \n" +
            "Desconto %.2f \n" +
            "Total %.2f \n").
    format(subTotal, desconto, total)
}

