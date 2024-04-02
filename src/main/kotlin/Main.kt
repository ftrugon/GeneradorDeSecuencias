fun main() {
    val entradaSalida = GestorEntradaSalida()
    val secuencias = GeneradorSecuencias(entradaSalida)

    val menu = Menu(secuencias,entradaSalida)
    menu.iniciarMenu()
}