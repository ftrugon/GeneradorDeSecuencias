interface IEntradaSalida{
    fun <T> mostrar(mensaje: T)

    fun <T> mostrarParaPedir(mensaje: T)

    fun leerNumero(num:String):Int

}

class GestorEntradaSalida:IEntradaSalida {


    override fun <T> mostrar(mensaje: T) {
        println(mensaje)
    }

    override fun <T> mostrarParaPedir(mensaje: T) {
        print(mensaje)
    }

    override fun leerNumero(num: String): Int {
        var numero = num.toIntOrNull()
        while (numero == null){
            mostrar("Eso no es un numero, pon otro: ")
            numero = readln().toIntOrNull()
        }
        return numero
    }
}
