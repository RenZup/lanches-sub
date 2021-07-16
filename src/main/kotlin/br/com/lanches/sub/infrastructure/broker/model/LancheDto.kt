package br.com.lanches.sub.infrastructure.broker.model

import io.micronaut.core.annotation.Introspected
import java.util.*

data class LancheDto(
    var nome: String,
    var ingredientes: String,
    var preco: Double,
    val id: UUID? = null
)