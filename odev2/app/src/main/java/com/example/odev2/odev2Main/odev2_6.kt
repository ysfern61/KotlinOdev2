package com.example.odev2.odev2Main

fun main() {
    print("calisma saatini giriniz: ")
    val calismaSaati = readLine()?.toIntOrNull()

    if (calismaSaati != null) {
        println("Maas: ${maasHesabi(calismaSaati)} TL")
    } else {
        println("Gecersiz giris!")
    }
}

fun maasHesabi(calismaSaati: Int): Int {
    return if (calismaSaati <= 160) {
        calismaSaati * 10
    } else {
        (160 * 10) + (calismaSaati - 160) * 20
    }
}
