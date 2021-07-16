package br.com.lanches.sub.core.ports

import br.com.lanches.sub.core.model.Lanche

interface LancheService {
    fun criarLanche(dto: Lanche)
    fun atualizarLanche(dto: Lanche)
    fun deletarLanche(dto: Lanche)
}