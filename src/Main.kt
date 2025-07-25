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

//Función para ejecutar operaciones
fun performOperation(a: Int, b: Int, o: (Int, Int) -> Double): Double{
    return o(a, b)
}

//Clases para el último ejercicio
data class Person(val name: String, val age: Int, val gender: String)
data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

//Función de mapeo para estudiantes
fun mapPersonToStudent(person: Person, studentId: String): Student {
    return Student(person.name, person.age, person.gender, studentId)
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
    val suma = performOperation(12,25){ a, b -> (a + b).toDouble()}
    val resta = performOperation(12,25){ a, b -> (a - b).toDouble()}
    val mul = performOperation(12,25){ a, b -> (a * b).toDouble()}
    val div = performOperation(12,25){ a, b -> (a.toDouble() / b)}
    println("Suma $suma")
    println("Resta $resta")
    println("Multiplicación $mul")
    println("División $div")

    println("")
    val persona = Person("Diego", 19, "Masculino")
    val estudiante = mapPersonToStudent(persona, "DQ123")
    println("El estudiante ${estudiante.name} tiene ${estudiante.age} años, es del género ${estudiante.gender} y su ID es ${estudiante.studentId}")
}