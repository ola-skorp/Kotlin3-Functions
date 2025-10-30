@file:Suppress("SimplifyBooleanWithConstants")

package ru.otus.homework.homework

fun main() {
    val list1: Collection<Any> = listOf("a", "b", "c")
    val list2: Collection<Any> = listOf(1, 2, "c")
    val list3: Collection<Any> = listOf(1, 2, 3)

    check(true == list1.checkElementsType<String>())
    check(false == list2.checkElementsType<Int>())
    check(true == list3.checkElementsType<Int>())
}

inline fun <reified T> Collection<Any>.checkElementsType(): Boolean =
    this.all { it is T }
