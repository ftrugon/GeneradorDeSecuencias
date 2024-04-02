fun main() {
    val entradaSalida = GestorEntradaSalida()
    val secuencias = GeneradorSecuencias(entradaSalida)

    secuencias.fraseIncremental(4)
}