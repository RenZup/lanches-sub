package br.com.lanches.sub.infrastructure.broker.model

data class LancheEvent(
    val lanche: LancheDto,
    val operacao: Operacao
){
}

enum class Operacao(private val string: String){
    CADASTRAR("CADASTRAR")
}