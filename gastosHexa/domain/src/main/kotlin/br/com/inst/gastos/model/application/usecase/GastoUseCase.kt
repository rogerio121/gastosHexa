package br.com.inst.gastos.model.application.usecase

import br.com.inst.gastos.model.application.entities.Gasto
import br.com.inst.gastos.model.application.ports.GastoGateway
import java.math.BigDecimal

class GastoUseCase (private val gateway: GastoGateway) {

    fun list (): List<Gasto>{
        gateway.list();
        return listOf(Gasto("Bebida", BigDecimal.TEN));
    }
}