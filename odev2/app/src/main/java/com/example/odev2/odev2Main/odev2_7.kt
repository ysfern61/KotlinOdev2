package com.example.odev2.odev2Main

fun main() {
    println("kullandiginiz gb giriniz: ")
    var kullanilan_internet= readLine()?.toIntOrNull()
    if (kullanilan_internet!=null)
    {
        println("odeme tutari: ${tarife(kullanilan_internet)} TL")
    }
    else
    {
        println("yanlis deger girildi")
    }

}

fun tarife (sayi:Int):Int
{
    var kota = 50
    if (sayi<=50)
    {
        return 100
    }
    else
    {
        return ((sayi-100)*4)+100
    }
}