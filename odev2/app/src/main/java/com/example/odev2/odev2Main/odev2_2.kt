package com.example.odev2.odev2Main

fun main() {

    println("kisa kenari giriniz: ")
    var kisaKenar=readLine()?.toIntOrNull()
    println("uzun kenari giriniz: ")
    var uzunKenar= readLine()?.toIntOrNull()

    if (kisaKenar!= null && uzunKenar !=null)
    {
        var alan = kisaKenar*uzunKenar
        println("alan: $alan")
    }
    else
    {
        println("tam sayi giriniz")
    }

}