package br.com.lanches.sub.infrastructure.broker

import br.com.lanches.sub.core.mapper.Convert
import br.com.lanches.sub.core.ports.LancheService
import br.com.lanches.sub.infrastructure.broker.model.LancheEvent
import io.micronaut.nats.annotation.NatsListener
import io.micronaut.nats.annotation.Subject

@NatsListener
class LancheServer(private val service: LancheService) {

    @Subject("channel.lanche")
    fun cheguei(lancheEvent: LancheEvent){
        println(lancheEvent)
        service.criarLanche(Convert.lancheEventToLanche(lancheEvent))
        println(lancheEvent)
    }
}