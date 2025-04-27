package com.example.odev2.odev2Main

fun main() {
    println("Lutfen kenar sayisini giriniz: ")
    val girilenDeger = readLine()?.toIntOrNull()

    val sonuc = girilenDeger?.let { icAcilarToplami(it) }

    if (sonuc != null) {
        if (sonuc >= 0) {
            println("Sonuç: $sonuc")
        } else {
            println("Gecerli bir kenar sayisi giriniz!")
        }
    } else {
        println("Geçerli bir sayı girilmedi!")
    }
}

fun icAcilarToplami(girilenDeger: Int): Int {
    return when {
        girilenDeger < 0 -> -1  // Hatalı veri için -1 döndür
        girilenDeger == 0 -> 0
        else -> (girilenDeger - 2) * 180
    }
}
