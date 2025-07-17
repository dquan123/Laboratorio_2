//Autor: Diego QUan
//Actividad: Laboratorio 2
//Fecha: 17/07/2025

//Función para calcular el promedio
fun calcularPromedio(numeros: List<Double>): Double{
    if (numeros.isEmpty()){
        throw IllegalArgumentException("La lista no puede estar vacía")
    }
    val suma = numeros.reduce{a, b -> a + b}
    return suma / numeros.size
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
}