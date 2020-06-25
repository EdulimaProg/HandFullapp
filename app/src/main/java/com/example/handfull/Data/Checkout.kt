package com.example.handfull.Data

class Checkout {
    val linkedList = DoublyLinkedList()
    fun addinlist(nome: String) {
        linkedList.push(nome)
        linkedList.print()
        println(linkedList.size())
    }
    //remove()
}