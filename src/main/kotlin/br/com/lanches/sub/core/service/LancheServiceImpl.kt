package br.com.lanches.sub.core.service

import br.com.lanches.sub.core.mapper.Convert
import br.com.lanches.sub.core.model.Lanche
import br.com.lanches.sub.core.ports.LancheDatabase
import br.com.lanches.sub.core.ports.LancheService
import javax.inject.Singleton

@Singleton
class LancheServiceImpl(private val database: LancheDatabase): LancheService {
    override fun criarLanche(dto: Lanche) {
        database.criar(Convert.lancheToLancheEntity(dto))
    }

    override fun atualizarLanche(dto: Lanche) {
        database.atualizar(Convert.lancheToLancheEntity(dto))
    }

    override fun deletarLanche(dto: Lanche) {
    }
}