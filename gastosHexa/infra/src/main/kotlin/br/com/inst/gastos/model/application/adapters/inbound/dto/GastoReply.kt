package br.com.inst.gastos.model.application.adapters.outbound.dto

import java.math.BigDecimal

data class GastoReply(
    val nome: String,
    val valor: BigDecimal
)

