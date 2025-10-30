package ru.otus.homework.homework

fun main() {
    check("str1 str2 str3" == concatStrings("str1", "str2", "str3"))
    check("str1,str2,str3" == concatStrings("str1", "str2", "str3", char = ','))
}

fun concatStrings(vararg strings: String, char: Char = ' '): String =
    strings.joinToString(char.toString())