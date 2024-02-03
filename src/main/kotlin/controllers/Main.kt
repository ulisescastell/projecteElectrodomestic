package controllers
import models.*
import utilities.*

fun main() {
    val llistaElectrodomestics = arrayOf(
        Electrodomestics(100.0,"Blanc", 'A', 6.0),
        Electrodomestics(110.2,"Platejat", 'B', 12.0),
        Electrodomestics(120.0,"Rosa", 'C', 24.0),
        Electrodomestics(134.4,"Lila", 'D', 50.0),
        Electrodomestics(200.0,"Blau", 'E', 190.0),
        Electrodomestics(300.0,"Blau cel", 'F', 62.0),
        Electrodomestics(140.5,"Vermell", 'A', 65.0),
        Electrodomestics(130.0,"Blanc", 'C', 97.0),
        Rentadora(106.2,"Negre", 'F', 34.0, 6),
        Electrodomestics(500.7,"Blanc", 'A', 23.4)
    )
    for (i in 0..llistaElectrodomestics.size-1) {
        println("\n---------------")
        print("\nElectrodomèstic ${i+1}:")
        llistaElectrodomestics[i].preuFinal()
        println(llistaElectrodomestics[i])
    }
}