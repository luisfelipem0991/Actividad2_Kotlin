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
// 3. Limpieza de Contactos Duplicados
fun reto3() {
    val contactos = listOf("300123", "311456", "300123", "320789", "311456", "350111", "300123")
    val unicos = contactos.toSet().sorted()

    println("\n--- Reto 3: Agenda Limpia ---")
    println("Contactos únicos ordenados: $unicos")
}
// 4. Análisis de Carrito de Compras
fun reto4() {
    val carrito = listOf("Leche", "Pan", "Leche", "Huevos", "Pan", "Leche", "Café")
    val conteo = mutableMapOf<String, Int>()
    for (producto in carrito) {
        conteo[producto] = conteo.getOrDefault(producto, 0) + 1
    }

    println("\n--- Reto 4: Carrito de Compras ---")
    println("Conteo: $conteo")
}
// 5. Historial de Navegación Reversible
fun reto5() {
    val historial = arrayOf("google.com", "github.com", "kotlinlang.org", "stackoverflow.com", "medium.com")
    val invertido = arrayOfNulls<String>(historial.size)
    for (i in historial.indices) {
        invertido[i] = historial[historial.size - 1 - i]
    }

    println("\n--- Reto 5: Historial Reversible ---")
    println("Original: ${historial.joinToString()}")
    println("Invertido: ${invertido.joinToString()}")
}
// 6. Compatibilidad de Intereses (Match)
fun reto6() {
    val interesesP1 = setOf("Cine", "Música", "Viajes", "Lectura")
    val interesesP2 = setOf("Música", "Deportes", "Viajes", "Cocina")

    val comunes = interesesP1.intersect(interesesP2)
    val exclusivosP1 = interesesP1.subtract(interesesP2)

    println("\n--- Reto 6: Match de Intereses ---")
    println("Comunes: $comunes")
    println("Solo Persona 1: $exclusivosP1")
}
// 7. Inventario de Despensa
fun reto7() {
    val despensa = mutableMapOf("Arroz" to 5, "Frijol" to 2, "Leche" to 1)

    fun consumir(producto: String, cantidad: Int) {
        val actual = despensa[producto] ?: 0
        if (actual > 0) {
            val nuevo = actual - cantidad
            if (nuevo <= 0) {
                despensa.remove(producto)
                println("¡Alerta! $producto se ha agotado.")
            } else {
                despensa[producto] = nuevo
            }
        }
    }

    println("\n--- Reto 7: Inventario Despensa ---")
    println("Inicial: $despensa")
    consumir("Leche", 1)
    consumir("Arroz", 2)
    println("Final: $despensa")
}
// 8. Cálculo de Promedio Académico
fun reto8() {
    val notas = listOf(4.5 to 0.2, 3.8 to 0.3, 4.0 to 0.5)
    var notaFinal = 0.0
    for (par in notas) {
        notaFinal += par.first * par.second
    }

    println("\n--- Reto 8: Promedio Académico ---")
    println("Nota Final: $notaFinal")
}
// 9. Traductor de Códigos de País
fun reto9() {
    val paises = mapOf("CO" to "Colombia", "MX" to "México", "AR" to "Argentina", "ES" to "España")

    println("\n--- Reto 9: Traductor de Países ---")
    for ((codigo, nombre) in paises) {
        println("El código [$codigo] pertenece a [$nombre]")
    }
}