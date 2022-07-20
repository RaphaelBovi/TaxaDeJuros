package com.taxa.selic.Produtos.model.dtos;

import com.taxa.selic.Produtos.model.entity.Produto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.annotation.security.DenyAll;
import java.math.BigDecimal;

@Data
@DenyAll
@NoArgsConstructor
public class ProdutoRequest {

    public Long id;

    private String codigo;

    private String nomeProduto;

    private BigDecimal valorProduto;

    public Produto toModel() {
        return new Produto(this.codigo, this.nomeProduto, this.valorProduto);
    }


}
