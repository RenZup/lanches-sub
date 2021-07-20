package br.com.lanches.sub.infrastructure.broker.database

import br.com.lanches.sub.core.ports.LancheDatabase
import com.datastax.oss.driver.api.core.CqlSession
import com.datastax.oss.driver.api.core.cql.SimpleStatement
import java.util.*
import javax.inject.Singleton

@Singleton
class LancheDatabseImpl(private val cqlSession: CqlSession): LancheDatabase {
    override fun criar(lanche: LancheEntity) {
        lanche.id = UUID.randomUUID()
        cqlSession.execute(
            SimpleStatement.newInstance(
                "INSERT INTO lanche(id, nome, ingredientes, preco) VALUES (?,?,?,?)",
                lanche.id,
                lanche.nome,
                lanche.ingredientes,
                lanche.preco
            )
        )
    }

    override fun atualizar(lanche: LancheEntity) {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "UPDATE lanche SET nome = ?, ingredientes = ?, preco = ? WHERE ID = ?",
                lanche.nome,
                lanche.ingredientes,
                lanche.preco,
                lanche.id
            )
        )
    }

    override fun deletar(lanche: LancheEntity) {
        cqlSession.execute(
            SimpleStatement.newInstance(
                "DELETE from champion where id = ?",
                lanche.id,
            )
        )
    }
}