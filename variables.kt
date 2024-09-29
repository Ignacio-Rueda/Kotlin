/*TIPOS DE DATOS DE KOTLIN 

String
Int
Double
Float
Boolean

*/

//Declaración de variable -> val nombre:tipoDato = valor inicial
fun main() {
    val num: Int = 2
    println("Tienes $num oportunidades")
    //Declaración de variable por inferencia de tipos
    val otroNum = 3
    println("Haciendo uso de la inferencia de tipos $otroNum")
    //Si no proporcionas un valor inicial, debes especificar el tipo de dato
    var sinValor: Int
    sinValor = 4
    println("Uso de variable que al principio no tenía valor $sinValor")
    sumar()
    incrementoYdecremento()
    manipularString();
}


fun sumar() {
    val num1 = 5
    val num2 = 6
    println("Suma de ambos valores ${num1+num2}")
}
/*
VARIABLE DE SOLO LECTURA: val Es como declarar un valor constante
VARIABLE MUTABLE: var
 */
fun incrementoYdecremento() {
    var incremento = 0
    var decremento = 10
    for(i in 1..10){
        println("Valor incrementado ${incremento++}")
        println("Valor decremento ${decremento--}")
    }
}

fun manipularString() {
    val nombre = "Ignacio "
    val apellido = "Rueda"
    println(nombre+apellido+" Delgado")
}

