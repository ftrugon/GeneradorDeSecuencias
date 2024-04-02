interface IGSecuencias{

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)
    fun fraseIncremental(numPalabras: Int)
    fun fraseFinal(numPalabras: Int)
    fun getSec():String
    fun mostrarSec()
}


class GeneradorSecuencias(
    private val consola:IEntradaSalida,

):IGSecuencias {

    private lateinit var sec: Sequence<String>

    override fun lineSequence(limit: Int): Sequence<String> {
        return super.lineSequence(limit)
    }

    override fun fraseIncremental(numPalabras: Int){
        sec = lineSequence(numPalabras)
        var palabras = ""
        sec.forEach {
            palabras += "$it "
            consola.mostrar(palabras)
        }
    }

    override fun fraseFinal(numPalabras: Int){
        sec = lineSequence(numPalabras)
        mostrarSec()
    }

    override fun getSec():String{
        return sec.toList().joinToString(" ")
    }

    override fun mostrarSec(){
        return consola.mostrar(getSec())
    }

}