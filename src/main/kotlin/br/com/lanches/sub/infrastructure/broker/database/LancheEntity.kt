package br.com.lanches.sub.infrastructure.broker.database

import java.util.*

data class LancheEntity(
    val nome: String,
    val ingredientes: String,
    val preco: Double,
    var id: UUID? = null

)