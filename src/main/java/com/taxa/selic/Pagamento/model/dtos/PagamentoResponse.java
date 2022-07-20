package com.taxa.selic.Pagamento.model.dtos;

import com.taxa.selic.Pagamento.model.entity.Pagamento;
import com.taxa.selic.Produtos.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class PagamentoResponse {

    public Long id;

    private BigDecimal valorEntrada;

    private Long parcelas;

    private Produto produto;

    public static PagamentoResponse from(Pagamento pagamento) {
        return new PagamentoResponse(
                pagamento.getId(),
                pagamento.getValorEntrada(),
                pagamento.getParcelas(),
                pagamento.getProduto()
        );
    }

}
