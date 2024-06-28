package br.com.ulbra.exemplorecycler

fun String.toRealMoney() = "R$ ".plus(this.replace(".", ","))