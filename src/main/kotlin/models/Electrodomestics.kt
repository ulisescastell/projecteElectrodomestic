package models
import controllers.*
import utilities.*

open class Electrodomestics {
    protected var preuBase: Double = 0.0
    protected var color: String = ""
    protected var consum: Char = ' '
    protected var pes: Double = 0.0
    protected var preuFinal: Double = 0.0

    constructor(preuBase: Double, color: String , consum: Char, pes: Double) {
        this.preuBase = preuBase
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    open fun preuFinal () {
        val valorPerConsum = when (this.consum) {
            'A' -> 35.0
            'B' -> 30.0
            'C' -> 25.0
            'D' -> 20.0
            'E' -> 15.0
            'F' -> 10.0
            'G' -> 0.0
            else -> {
                println(YELLOW + "Eficiencia energètica no disponible" + RESET)
                0.0
            }
        }
        val valorPerPes = when (this.pes) {
            in 6.0..20.0 -> 20.0
            in 20.1..50.0 -> 50.0
            in 50.1..80.0 -> 80.0
            in 80.1..1000.0 -> 100.0
            else -> {
                println(YELLOW + "Pes incorrecte" + RESET)
                0.0
            }
        }
        this.preuFinal = preuBase+valorPerPes+valorPerConsum
    }

    //ELS SEGÜENTS GETTERS/SETTERS NO ELS PUC POSSAR JA QUE EM DONA ERROR // MIRAR-HO

    //protected fun getPreuBase (): Double {
       // return this.preuBase
    //}

    //protected fun getColor(): String {
       // return this.color
    //}

    //protected fun getConsum(): Char {
        //return this.consum
    //}

    /**protected fun getPes(): Double {
        return this.pes
    }

    //protected fun setPreuBase(preuBase: Double) {
       // this.preuBase = preuBase
    //}

    protected fun setColor(color: String) {
        this.color = color
    }

    protected fun setConsum(consum: Char) {
        this.consum = consum
    }

    protected fun setPes(pes: Double) {
        this.pes = pes
    }**/

    override fun toString(): String {
        return "\nTipus electrodomèstic: No definit\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nPreu final: ${this.preuFinal}"
    }
}

class Rentadora : Electrodomestics {
    private var carrega: Int = 0

    constructor(preuBase: Double, color: String, consum: Char, pes: Double, carrega: Int) : super(preuBase, color, consum, pes) {
        this.carrega = carrega
    }

     override fun preuFinal() {
         super.preuFinal()
        val valorPerCarrega = when (this.carrega) {
            6, 7 -> 55.0
            8 -> 70.0
            9 -> 85.0
            10 -> 100.0
            else -> this.preuFinal
        }
         this.preuFinal += valorPerCarrega
    }

    fun getCarrega(): Int {
        return this.carrega
    }

    fun setCarrega(carrega: Int) {
        this.carrega = carrega
    }

    override fun toString(): String {
        return "\nTipus electrodomèstic: Rentadora\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nCàrrega: ${this.carrega}\nPreu final: ${this.preuFinal}\n"
    }

}

    class Televisio : Electrodomestics {
        private var mida: Int = 0

        constructor(preuBase: Double, color: String, consum: Char, pes: Double, mida: Int) : super(preuBase, color, consum, pes)
        {
            this.mida = mida
        }

        fun getMida(): Int {
            return this.mida
        }

        fun setMida(mida: Int) {
            this.mida = mida
        }

        override fun toString(): String {
            return "\nTiups electrodomèstic: Televisió\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nMida: ${this.mida}\nPreu final: ${this.preuFinal}"
        }

    }








