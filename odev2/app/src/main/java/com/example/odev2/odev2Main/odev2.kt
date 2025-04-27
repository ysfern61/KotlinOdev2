package com.example.odev2.odev2Main

fun main() {
    println("Dönüştürülecek değeri giriniz: ")
    val girilenDeger = readLine()?.toFloatOrNull()

    if (girilenDeger != null) {
        val donusenDeger: Float = (girilenDeger * 1.8f) + 32
        println("Fahrenheit değeri: $donusenDeger")
    } else {
        println("Gecerli bir sayi girmediniz.")
    }
}