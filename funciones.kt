/*
Las funciones de Kotlin pueden generar datos que se denomina
valor de muestra que se almacenan en una variable que puedes usar
en cualquier otra parte del código.
*/
fun main() {
    val valorSaludo = saludo()
    println(valorSaludo)
    val suma = sumar(num1 = 2,num2 = 3)
    val suma_ = sumar(2,3)
    println("El valor de la suma es "+suma)
    println(felicitar(edad = 35))
    
}
/*
Por defecto si no se especifica el tipo de dato, el predeterminado es Unit.
Unit significa que la función no muestra ningún valor, es equivalente a void.
 */
fun saludo(): String{
    val saludo = "Hola!"
    return saludo
}
/*
Agregar un parámetro a la función
*/

fun sumar(num1: Int,num2:Int): Int{
    /*num1 = 100 No puedes cambiar el valor que se pasa a un parámetro.Los parémetros en Kotlin son inmutables. 
    No puedes reasignar el valor de un parámetro desde el cuerpo de la función. 
    */
    return num1+num2
}
/*
Los parámetros de una función también pueden especificar argumentos predeterminados.
Cuando llamas a una función, puedes decidir omitir los argumentos para los que haya un valor predeterminado
Cuando vamos a usar el parámetro por defecto, el argumento que pasamos tiene que usar el nombre
*/
fun felicitar(nombre: String = "Ignacio",edad: Int): String{
    return "Felicidades! $nombre por tu $edad cumpleaños!"
}