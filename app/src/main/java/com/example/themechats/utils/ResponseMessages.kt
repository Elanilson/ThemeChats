package com.example.themechats.utils

import com.example.themechats.models.MessageData

val listaDeRespostas = listOf<String>(
    "Olá",
    "Que tal",
    "Bom dia",
    "Adeus",
    "Que bom",
    "Que ruim",
    "Um prazer",
    "Não me diga",
    "Não gosto",
    "Isso eu adoro",
    "É mesmo"
)


fun automaticResponse() : MessageData {
    val randomResponse = listaDeRespostas.random()

    val response = MessageData(
        isMine = false,
        text = randomResponse
    )

    return response

}