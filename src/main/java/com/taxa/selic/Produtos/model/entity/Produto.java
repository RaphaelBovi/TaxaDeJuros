package com.taxa.selic.Produtos.model.entity;

import com.taxa.selic.Pagamento.model.entity.Pagamento;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "produto")
public class Produto {

    public Produto(String codigo, String nomeProduto, BigDecimal valorProduto) {
        this.codigo = codigo;
        this.nomeProduto = nomeProduto;
        this.valorProduto = valorProduto;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produto_id", nullable = false)
    public Long id;

    @Column(name = "codigo_produto")
    private String codigo;

    @Column(name = "nome_produto")
    private String nomeProduto;

    @Column(name = "valor_produto")
    private BigDecimal valorProduto;

    @OneToOne(mappedBy = "produto")
    private Pagamento pagamento;

}