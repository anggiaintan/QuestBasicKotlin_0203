package com.example.questbasickotlin_0203

fun ContohList() {
    println("=== List ===")
    // List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // Map mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List mutable
    shape.add("Circle")
    println(shape)

    // Menghapus data dari List mutable
    shape.remove("Triangle")
    println(shape)

    // Mengubah data di dalam List mutable
    shape[0] = "Oval"
    println(shape)

    // List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

fun main() {
    ContohList()
}