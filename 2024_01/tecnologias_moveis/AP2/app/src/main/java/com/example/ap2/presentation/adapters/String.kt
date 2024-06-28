package com.example.ap2.presentation.adapters

fun String.toRealMoney() = "R$ ".plus(this.replace(".", ","))