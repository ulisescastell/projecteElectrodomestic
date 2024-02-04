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
        Televisio(140.5,"Vermell", 'A', 65.0, 52),
        Rentadora(320.0,"Blanc", 'B', 420.0, 5),
        Rentadora(165.0,"Blanc", 'D', 220.0, 8),
        Televisio(650.0,"Negre", 'C', 97.0, 28)
    )
    for (i in 0..llistaElectrodomestics.size-1) {
        llistaElectrodomestics[i].preuFinal()
        println("\nElectrodomèstic ${i+1}: ${llistaElectrodomestics[i]}")
        println("$PURPLE\n---------------$RESET")
    }
}