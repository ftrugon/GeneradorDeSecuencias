interface IEntradaSalida{
    fun mostrar(mensaje:String)

    fun leerNumero(num:String):Int

}

class GestorEntradaSalida:IEntradaSalida {
    override fun mostrar(mensaje: String) {
        println(mensaje)
    }

    override fun leerNumero(num: String): Int {
        if (num.toInt())
    }
}
