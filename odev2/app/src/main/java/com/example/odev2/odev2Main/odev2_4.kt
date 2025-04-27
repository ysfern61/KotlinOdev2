package com.example.odev2.odev2Main

fun main() {
    println("Bir kelime giriniz: ")
    val kelime = readLine()

    if (kelime != null)
    {
        val aSayisi = aHarfiSayisi(kelime)
        println("Kelimenizdeki 'a' harfi sayisi: $aSayisi")
    } else
    {
        println("Gecerli bir kelime giriniz.")
    }
}
fun aHarfiSayisi(kelime: String): Int {
    var sayac = 0
    for (karakter in kelime) {
        if (karakter.lowercaseChar() == 'a')
        {
            sayac++
        }
    }
    return sayac
}