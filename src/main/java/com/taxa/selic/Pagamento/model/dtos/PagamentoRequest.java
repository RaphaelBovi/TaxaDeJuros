package com.taxa.selic.Pagamento.model.dtos;

import com.taxa.selic.Pagamento.model.entity.Pagamento;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PagamentoRequest {

    public Long id;

    private BigDecimal valorEntrada;

    private Long parcelas;

    public Pagamento toModel() {
        return new Pagamento(this.valorEntrada, this.parcelas);
    }

}
