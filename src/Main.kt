//Autor: Diego QUan
//Actividad: Laboratorio 2
//Fecha: 17/07/2025

//Función para calcular el promedio
fun calcularPromedio(numeros: List<Double>): Double{
    val suma = numeros.reduce{a, b -> a + b}
    return suma / numeros.size
}

//Función para determinar palíndromo
fun esPalindromo(cadena: String): Boolean{
    var inicio = 0
    var final = cadena.length - 1
    while (inicio < final){
        if (cadena[inicio] != cadena[final]){
            return false
        }
        inicio++
        final--
    }
    return true
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("")
    val lista = listOf(12.3,45.2,15.4,11.1)
    val promedio = calcularPromedio(lista)
    println("El promedio de los números es: $promedio")

    println("")
    val numeros = listOf(1,4,2,6,8,3,7,34,78,22,43,65,23)
    val impares = numeros.filter {it % 2 == 1}
    println("Números impares: $impares")

    println("")
    val cadena = "abba"
    val palindromo = esPalindromo(cadena)
    val si_no =
    if (palindromo){
        "si"
    } else {
        "no"
    }
    println("La cadena $cadena $si_no es un palíndromo")

    println("")
    val lista_nombres = listOf("Diego", "Javier", "Juan", "Ana", "José")
    val map = lista_nombres.map{"¡Hola, $it! \n"}
    println("Saludos: \n $map")

    println("")
}