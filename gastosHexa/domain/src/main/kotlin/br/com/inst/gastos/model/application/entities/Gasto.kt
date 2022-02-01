package br.com.inst.gastos.model.application.entities

import java.math.BigDecimal

data class Gasto(
    val nome: String,
    val valor: BigDecimal
)
