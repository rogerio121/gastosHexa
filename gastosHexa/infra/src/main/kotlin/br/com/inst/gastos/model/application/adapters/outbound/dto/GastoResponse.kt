package br.com.inst.gastos.model.application.adapters.outbound.dto

import java.math.BigDecimal

data class GastoResponse(
    val nome: String,
    val valor: BigDecimal
)

