package com.taxa.selic.Produtos.model.entity;

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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "produto_id", nullable = false)
    public Long id;

    @Column(name = "codigo_produto")
    private String codigo;

    @Column(name = "nome_produto")
    private String nome;

    @Column(name = "valor_produto")
    private BigDecimal valor;

}
