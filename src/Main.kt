fun main() {
    val alimentos = mapOf(
        "Pizza" to 800,
        "Ensalada" to 200,
        "Hamburguesa" to 700,
        "Manzana" to 100,
        "Helado" to 300,
        "Pasta" to 600,
        "Yogurt" to 150
    )

    // Mostrar la lista de alimentos y sus calorías
    println("Lista de alimentos y sus calorías:")
    alimentos.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

    // Separar alimentos en "Altos en calorías" y "Bajos en calorías"
    val altosEnCalorias = alimentos.filter { it.value > 500 }
    val bajosEnCalorias = alimentos.filter { it.value <= 500 }

    // Calcular el total de calorías consumidas
    val totalCalorias = alimentos.values.sum()

    // Mostrar el total de calorías consumidas
    println("\nTotal de calorías consumidas: $totalCalorias calorías")

    // Mostrar la cantidad de alimentos "Altos en calorías"
    println("Alimentos altos en calorías (más de 500): ${altosEnCalorias.size}")

    // Imprimir los alimentos categorizados
    println("\nLista de alimentos altos en calorías:")
    altosEnCalorias.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

    println("\nLista de alimentos bajos en calorías:")
    bajosEnCalorias.forEach { (alimento, calorias) ->
        println("$alimento: $calorias calorías")
    }

}
