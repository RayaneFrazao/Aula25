class CalculoMatematico {

    fun divisao(numero1: Int, numero2: Int): Int {

        try {
            val dividir = numero1/numero2
        } catch (ex: ArithmeticException) {
            println("A operação não pode ser realizada")
        }
        return (0)
    }
}







