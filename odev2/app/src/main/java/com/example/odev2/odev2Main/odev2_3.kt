package com.example.odev2.odev2Main

fun main() {
println("faktoriyeli alinacak sayiyi giriniz: ")
    var sayi = readLine()?.toIntOrNull()

    if (sayi != null && sayi >= 0) {
        println("Faktoriyel: ${faktoriyel(sayi)}")
    } else {
        println("Geçerli bir sayı giriniz.")
    }
}

fun faktoriyel(sayi:Int):Int
{
    if (sayi==0)
    {
        return 1
    }
    else
    {
        return sayi* faktoriyel( sayi - 1 )
    }

}