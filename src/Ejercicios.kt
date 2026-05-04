/**
 * Soluciones a los 30 retos de Kotlin - Sesión 3
 */

// 1. Control de Gastos Diarios
fun reto1() {
    val gastos = arrayOf(45.0, 12.5, 30.0, 50.0, 10.0, 5.0, 100.0, 25.0, 15.0, 40.0, 60.0, 5.0, 80.0, 20.0, 35.0)
    var total = 0.0
    var max = gastos[0]
    var min = gastos[0]

    for (gasto in gastos) {
        total += gasto
        if (gasto > max) max = gasto
        if (gasto < min) min = gasto
    }
    val promedio = total / gastos.size

    println("--- Reto 1: Control de Gastos ---")
    println("Total: $total, Promedio: $promedio, Máximo: $max, Mínimo: $min")
}
// 2. Filtro de Empleados Senior
fun reto2() {
    val empleados = listOf("Ana" to 25, "Carlos" to 35, "Beatriz" to 42, "David" to 28, "Elena" to 31)
    val seniorNames = empleados
        .filter { it.second > 30 }
        .map { it.first.uppercase() }

    println("\n--- Reto 2: Filtro Senior ---")
    println("Empleados Senior: $seniorNames")
}
