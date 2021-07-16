package br.com.lanches.sub.core.ports

import br.com.lanches.sub.infrastructure.broker.database.LancheEntity

interface LancheDatabase {
    fun criar(lanche: LancheEntity)
    fun atualizar(lanche: LancheEntity)
    fun deletar(lanche: LancheEntity)
}
