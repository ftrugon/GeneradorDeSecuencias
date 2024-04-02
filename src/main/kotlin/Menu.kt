class Menu(
    private val secuencias: IGSecuencias,
    private val consola: IEntradaSalida
) {

    fun mostrarMenu(){
        consola.mostrar("1. Frase incremental")
        consola.mostrar("2. Frase final")
        consola.mostrar("3. Salir del programa")
        consola.mostrarParaPedir("Que vas a hacer: ")
    }

    private fun pedirNumero():Int{
        return consola.leerNumero(readln())
    }

    private fun opcionElegida(numero:Int) = when(numero){
        1 -> hacerFraseIncremental()
        2 -> hacerFraseFinal()
        else -> {
            consola.mostrar("Opcion no valida")
        }
    }

    private fun hacerFraseIncremental(){
        consola.mostrarParaPedir("De cuantas palabras quieres la frase?: ")
        val numero = pedirNumero()
        secuencias.fraseIncremental(numero)
    }

    private fun hacerFraseFinal(){
        consola.mostrarParaPedir("De cuantas palabras quieres la frase?: ")
        val numero = pedirNumero()
        secuencias.fraseFinal(numero)
    }

    fun iniciarMenu(){
        mostrarMenu()
        var opcion = pedirNumero()
        while (opcion != 3){
            opcionElegida(opcion)
            mostrarMenu()
            opcion = pedirNumero()
        }
    }

}