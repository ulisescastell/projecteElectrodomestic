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

    fun preuFinal () {
        val valorPerConsum = when (this.consum) {
            'A' -> 35.0
            'B' -> 30.0
            'C' -> 25.0
            'D' -> 20.0
            'E' -> 15.0
            'F' -> 10.0
            'G' -> 0.0
            else -> {
                println("Eficiencia energètica no disponible")
                0.0
            }
        }
        val valorPerPes = when (this.pes) {
            in 6.0..20.0 -> 20.0
            in 20.1..50.0 -> 50.0
            in 50.1..80.0 -> 80.0
            in 80.1..200.0 -> 100.0
            else -> {
                println("Peso incorrecto")
                0.0
            }
        }

        this.preuFinal = preuBase+valorPerPes+valorPerConsum
    }


    fun getPreuBase (): Double {
        return this.preuBase
    }

    fun getColor(): String {
        return this.color
    }

    fun getConsum(): Char {
        return this.consum
    }

    fun getPes(): Double {
        return this.pes
    }

    fun setPreuBase(preuBase: Double) {
        this.preuBase = preuBase
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun setConsum(consum: Char) {
        this.consum = consum
    }

    fun setPes(pes: Double) {
        this.pes = pes
    }

    override fun toString(): String {
        return "\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nPreu final: ${this.preuFinal}"
    }
}

class Rentadora : Electrodomestics {
    private var carrega:Int = 0
    constructor(preuBase: Double, color: String, consum: Char, pes: Double, carrega: Int): super(preuBase, color, consum, pes) {
        this.carrega = carrega
    }

    fun getCarrega(): Int {
        return this.carrega
    }
    fun setCarrega(carrega: Int) {
        this.carrega = carrega
    }
    override fun toString(): String {
        return "\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nPreu final: ${this.preuFinal}\nCàrrega: ${this.carrega}"
    }
    }


class Televisio : Electrodomestics {
    private var mida:Int = 0
    constructor(preuBase: Double, color: String, consum: Char, pes: Double, mida: Int): super(preuBase, color, consum, pes) {
        this.mida = mida
    }

    fun getMida(): Int {
        return this.mida
    }
    fun setMida(mida: Int) {
        this.mida = mida
    }
    override fun toString(): String {
        return "\nPreu base: ${this.preuBase}\nColor: ${this.color}\nConsum: ${this.consum}\nPes: ${this.pes}\nPreu final: ${this.preuFinal}\nMida: ${this.mida}"
    }
}
