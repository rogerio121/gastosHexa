package br.com.inst.gastos.model.application.ports

import br.com.inst.gastos.model.application.entities.Gasto

interface GastoGateway {
    fun list(): List<Gasto>
}