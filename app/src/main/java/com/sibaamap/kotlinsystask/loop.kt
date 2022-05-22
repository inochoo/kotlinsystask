package com.sibaamap.kotlinsystask

fun main(){
//    //val cakes = listOf("carrot", "cheese", "chocolate")
//    val cakes = mutableListOf<String>("carrot", "cheese", "chocolate")
//    cakes.add("com rang")
//
////    for (cake in cakes) {                               // 1
////        println("Yummy, it's a $cake cake!")
////    }
//    for(index in cakes.indices){
//        println("Yummy, it's a ${cakes.get(index)} - $index - cake!")
//    }

    for(i in 0..3) {             // 1
        print(i)
    }
    print(" ")

    for(i in 0 until 3) {        // 2
        print(i)
    }
    print(" ")

    for(i in 2..8 step 2) {      // 3
        print(i)
    }
    print(" ")

    for (i in 3 downTo 0) {      // 4
        print(i)
    }
    print(" ")



}