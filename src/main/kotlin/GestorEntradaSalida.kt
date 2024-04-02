interface IEntradaSalida{
    fun mostrar(mensaje:String)

    fun leerNumero(num:String):Int

}

class GestorEntradaSalida:IEntradaSalida {

    override fun mostrar(mensaje: String) {
        println(mensaje)
    }

    override fun leerNumero(num: String): Int {
        val numero = num.toIntOrNull()
        if (numero != null) {
            return numero
        }else return 5
    }
}
