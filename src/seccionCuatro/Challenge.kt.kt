package seccionCuatro

import java.text.DecimalFormat

var tasaCambio = 0.0
var COPEnCaja = 0.0
var USDEnCaja = 0.0

fun main() {
    print("Ingrese la tasa de cambio de dólar a peso: ")
    tasaCambio = readln().toDouble()

    print("Ingrese la cantidad de pesos de la apertura de caja: $")
    COPEnCaja = readln().toDouble()

    print("Ingrese la cantidad de dólares de la apertura de caja: $")
    USDEnCaja = readln().toDouble()

    operationSystem()
}

fun operationSystem() {
    val formato = "#,###.00"

    print("\nIngrese la cantidad de dólares a cambiar: $")
    val USDaCambiar = readln().toDouble()

    val COPaEntregar = tasaCambio * USDaCambiar

    if (COPaEntregar > COPEnCaja) {
        println("\nNo hay suficiente dinero en COP para realizar esta transacción.")
        println("COP disponible en caja: $${DecimalFormat(formato).format(COPEnCaja)}")
    } else {
        USDEnCaja += USDaCambiar
        COPEnCaja -= COPaEntregar

        println(
            """
            ***  RECIBO  ***
            COP a Entregar: $${DecimalFormat(formato).format(COPaEntregar)}
            
            COP en Caja: $${DecimalFormat(formato).format(COPEnCaja)}
            USD en Caja: $${DecimalFormat(formato).format(USDEnCaja)}
        """.trimIndent()
        )
    }

    if (COPEnCaja > 0) {
        operationSystem()
    } else {
        println("\nLa caja se ha quedado sin COP suficientes para continuar.")
    }
}