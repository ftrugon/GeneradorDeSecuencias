interface IGSecuencias{

    fun lineSequence(limit: Int = Int.MAX_VALUE) = generateSequence { readln() }.constrainOnce().take(limit)
    fun fraseIncremental(numPalabras: Int)
    fun fraseFinal()
    fun getSec()
    fun mostrarSec()
}


class GeneradorSecuencias(
    private val consola:IEntradaSalida,
    private var sec:String = ""

):IGSecuencias {

    override fun lineSequence(limit: Int): Sequence<String> {
        return super.lineSequence(limit)
    }

    override fun fraseIncremental(numPalabras: Int){
        lineSequence(numPalabras)
    }

    override fun fraseFinal(){

    }

    override fun getSec(){

    }

    override fun mostrarSec(){

    }

}