package com.taxa.selic.Pagamento.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @Column(name = "entrada")
    private float entrada;

    @Column(name = "parcelas")
    private int parcelas;

}
