package br.com.lanches.sub.core.mapper

import br.com.lanches.sub.core.model.Lanche
import br.com.lanches.sub.infrastructure.broker.database.LancheEntity
import br.com.lanches.sub.infrastructure.broker.model.LancheEvent

class Convert {
    companion object{
        fun lancheEventToLanche(lancheEvent: LancheEvent)= with(lancheEvent.lanche){
            Lanche(nome,ingredientes,preco,id)
        }
        fun lancheToLancheEntity(lanche: Lanche) = with(lanche){
            LancheEntity(nome,ingredientes,preco,id)
        }

    }
}