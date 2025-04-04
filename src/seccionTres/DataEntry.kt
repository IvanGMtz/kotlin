package seccionTres

fun main(){

    println("Ingresa tu nombre: ")
    val nombre = readLine()
    println("Ingresa tu edad: ")
    val edad = readLine()

    val msj = "Tu nombre es: $nombre \nTu edad: $edad\n\n"
    println(msj)

    println("""
        *** Datos ***
        Nombre: $nombre
        Edad: $edad años
    """.trimIndent())
}