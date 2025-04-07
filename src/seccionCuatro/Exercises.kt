package seccionCuatro

import java.text.DecimalFormat

fun main(){
    //exercise1();
    //exercise2();
    exercise3();
}

fun exercise1(){

    print("Ingrese tu direccion, Calle: ")
    val calle = readlnOrNull();
    print("Ingrese la ciudad de residencia: ")
    val ciudad = readlnOrNull();
    print("Ingrese el estado: ")
    val estado = readlnOrNull();
    print("Ingrese el pais: ")
    val pais = readlnOrNull();
    print("Ingrese el codigo postal: ")
    val postal = readlnOrNull();

    println("$calle, $ciudad, $estado,$pais, $postal");
}

fun exercise2(){
    print("Ingrese el valor del salario: $")
    val salary = readln().toDouble()

    print("Ingrese el porcentaje de impuesto: %")
    val tax = readln().toDouble()

    val taxMonth = salary * (tax/100)
    val salaryMonth = salary - taxMonth
    val taxYear = taxMonth * 12
    val salaryYear = salaryMonth * 12

    print("""
        Salario mensual neto: $${salaryMonth}
        Impuestos a pagar por mes: $${taxMonth}
        
        Salario anual neto: $${salaryYear}
        Impuestos a pagar por año: $${taxYear}
    """.trimIndent())
}

fun exercise3(){
    val formato = "#,###.00"
    print("Ingrese el radio en cm: ")
    val radio = readln().toDouble()

    val areaCM = areaCirculo(radio)
    val areaPulg = convertirAreaAPulgadas(areaCM)

    val circunfCM = circunferencia(radio)
    val circunfPulg = convertirLongitudAPulgadas(circunfCM)

    print("""
        *** Centímetros ***
        Área               |${"%.2f".format(areaCM)}
        Circunferencia     |${DecimalFormat(formato).format(circunfCM)} 
         
        *** Pulgadas ***
        Área               |${DecimalFormat(formato).format(areaPulg)}
        Circunferencia     |${DecimalFormat(formato).format(circunfPulg)} 
    """.trimIndent())
}

fun areaCirculo(radio: Double): Double {
    return Math.PI * radio * radio
}

fun circunferencia(radio: Double): Double {
    return 2 * Math.PI * radio
}

fun convertirAreaAPulgadas(areaCm2: Double): Double {
    return areaCm2 * 0.155
}

fun convertirLongitudAPulgadas(longitudCm: Double): Double {
    return longitudCm * 0.3937
}