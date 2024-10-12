package com.example.questbasickotlin_0203

import android.provider.ContactsContract.CommonDataKinds.Email

class Motor()

class Contact(val id: Int, var email: String)

fun main() {
    val contact = Contact(1, "mary@gmail.com")

}