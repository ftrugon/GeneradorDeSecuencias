interface IEntradaSalida{
    fun <T> mostrar(mensaje: T)

    fun leerNumero(num:String):Int

}

class GestorEntradaSalida:IEntradaSalida {


    override fun <T> mostrar(mensaje: T) {
        println(mensaje)
    }

    override fun leerNumero(num: String): Int {
        var numero = num.toIntOrNull()
        while (numero == null){
            mostrar("El numero no es valido, pon otro: ")
            numero = readln().toIntOrNull()
        }
        return numero
    }
}
