package br.com.lanches.sub.infrastructure.broker

import br.com.lanches.sub.core.mapper.Convert
import br.com.lanches.sub.core.ports.LancheService
import br.com.lanches.sub.infrastructure.broker.model.LancheEvent
import br.com.lanches.sub.infrastructure.broker.model.Operacao
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject
import org.slf4j.LoggerFactory

@NatsListener
class LancheServer(private val service: LancheService) {

    private val logger = LoggerFactory.getLogger(this::class.java)


    @Subject("channel.lanche")
    fun listen(lancheEvent: LancheEvent){
        logger.info("infrastructure/broker/ :${lancheEvent.operacao} $lancheEvent")

        if(lancheEvent.operacao == Operacao.CADASTRAR){
            logger.info("infrastructure/broker/ :${lancheEvent.operacao} $lancheEvent")
            service.criarLanche(Convert.lancheEventToLanche(lancheEvent))

        }
        else if(lancheEvent.operacao== Operacao.ATUALIZAR){
            logger.info("infrastructure/broker/ :${lancheEvent.operacao} $lancheEvent")
            service.atualizarLanche(Convert.lancheEventToLanche(lancheEvent))
        }

    }
}