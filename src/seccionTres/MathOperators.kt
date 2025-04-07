package seccionTres

import java.text.DecimalFormat
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main(){


    var pi = 3.14159

    println(round(pi))
    println(floor(pi))
    println(ceil(pi))
    println("$pi  el valor del lado:")
    val lado = readLine()!!.toDouble()

    val result = lado * lado

    println(" El area es: ")
    println(result)

    println(DecimalFormat("#.##").format(pi))
}