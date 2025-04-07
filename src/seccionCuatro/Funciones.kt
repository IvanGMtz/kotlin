package seccionCuatro

import java.util.Date

fun main(){

    //mostrarMensaje();
    mostrarDatos("Ivan", 25);
    println("\n\n")
    println(calcularImpuestos(10_000.00));
}

fun mostrarMensaje(){
    println("""
        Mensaje: Hola desde Kotlin
        Fecha: ${Date()}
    """.trimIndent())
}

fun mostrarDatos(name: String, age: Int){
    println("""
        Nombre: $name
        Edad: $age
    """.trimIndent())
}

fun calcularImpuestos(salary:Double, tax:Double=16.0):Double{
    val totalTax = (tax/100)*salary
    return totalTax
}