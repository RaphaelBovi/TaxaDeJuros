package com.taxa.selic.Pagamento.model;

import com.taxa.selic.Produtos.model.entity.Produto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "pagamento")
public class Pagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "pagamento_id", nullable = false)
    public Long id;

    @Column(name = "valor_entrada")
    private BigDecimal valorEntrada;

    @Column(name = "parcelas")
    private Long parcelas;

    @OneToOne
    @JoinColumn(name = "produto_id")
    private Produto produto;

}
