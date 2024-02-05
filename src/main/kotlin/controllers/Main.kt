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

    var total = 0.0
    var totalPreuBaseElectrodomestics=0.0
    var totalPreuFinalElectrodomestics=0.0
    var totalPreuBaseRentadora=0.0
    var totalPreuFinalRentadora=0.0
    var totalPreuBaseTelevisio=0.0
    var totalPreuFinalTelevisio=0.0


    for (e in llistaElectrodomestics) {
        totalPreuBaseElectrodomestics+=e.getPreuBase()
        totalPreuFinalElectrodomestics+=e.preuFinal()
        if (e is Rentadora) {
            totalPreuBaseRentadora+=e.getPreuBase()
            totalPreuFinalRentadora+=e.preuFinal()
        }
        if (e is Televisio){
            totalPreuBaseTelevisio+=e.getPreuBase()
            totalPreuFinalTelevisio+=e.preuFinal()
        }
    }

    println(RED_BOLD_BRIGHT + "\nSUMA TOTAL ELEMENTS:" + RESET)
    println(RED_BRIGHT + "Total electrodomèstics" + RESET)
    println("Base: $totalPreuBaseElectrodomestics")
    println("Total: $totalPreuFinalElectrodomestics")
    println(RED_BRIGHT + "Total rentadores" + RESET)
    println("Base: $totalPreuBaseRentadora")
    println("Total: $totalPreuFinalRentadora")
    println(RED_BRIGHT + "Total televisions" + RESET)
    println("Base: $totalPreuBaseTelevisio")
    println("Total: $totalPreuFinalTelevisio")


}

