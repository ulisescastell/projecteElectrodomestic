package models
import controllers.*
import utilities.*

open class Electrodomestics {
    private var preuBase: Double = 0.0
    private var color: Array<String> = arrayOf("")
    private var consum: Char = ' '
    private var pes: Double = 0.0

    constructor(color: Array<String> , consum: Char, pes: Double) {
        this.color = color
        this.consum = consum
        this.pes = pes
    }

    fun preuFinal () {
        when (this.consum) {
            'A' -> this.preuBase+35.0
            'B' -> this.preuBase+30.0
            'C' -> this.preuBase+25.0
            'D' -> this.preuBase+20.0
            'E' -> this.preuBase+15.0
            'F' -> this.preuBase+10.0
            'G' -> this.preuBase+0.0
        }
    }

    fun getPreuBase (): Double {
        return this.preuBase
    }

    fun getColor(): Array<String> {
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

    fun setColor(color: Array<String>) {
        this.color = color
    }

    fun setConsum(consum: Char) {
        this.consum = consum
    }

    fun setPes(pes: Double) {
        this.pes = pes
    }
}