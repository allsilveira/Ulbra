package com.example.myapp_aula09.presentation.adapters

fun String.toRealMoney() = "R$ ".plus(this.replace(".", ","))