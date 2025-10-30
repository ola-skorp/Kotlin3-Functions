package ru.otus.homework.homework

fun main() {
    val time = measureTime(::longRunningTask)
    println("Measured time: $time ms")
}

fun longRunningTask() {
    Thread.sleep(1000)
}

fun measureTime(func: () -> Unit): Long {
    val startTime = System.currentTimeMillis()
    func()
    val endTime = System.currentTimeMillis()
    return endTime - startTime
}