package ru.netology

import java.lang.Exception
import kotlin.math.max


fun main(args: Array<String>) {
    //Console con = System.console()

    println("Интересуетесь банковскими переводами? - нажмите 1")
    println("Затрудняетесь в написании числительных? - нажмите 2")
    println("Любите музыку и интересуетесь скидками? - нажмите 3")
    //val index: Int = Integer.parseInt(scanner.readLine())
    val s = readln()
    val i = s?.toInt() ?: throw Exception()
}

fun myTransferCard(myTypeCard:String, amountSumm:Int, amount:Int): Int {
    val Error_Type=-1
    val Error_Limit=-2
    return when(myTypeCard) {
        "Mastercard", "Maestro" -> if (amount<=150000 && (amount+amountSumm)<=600000){ if(amount+amountSumm>75_000) (amount*0.006+20).toInt() else 0} else Error_Limit
        "Visa", "Мир" -> if(amount>=35) {if(amount<=150_000 && amount+amountSumm<=600_000) max(35, (amount*0.0075).toInt()) else Error_Limit} else Error_Limit
        "VK Pay" -> if(amount<=15_000 && amount+amountSumm<=40_000) 0 else Error_Limit
        else -> Error_Type
    }
}