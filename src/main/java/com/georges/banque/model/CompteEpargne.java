package com.georges.banque.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "compte_epargne")
public class CompteEpargne extends Compte {
    private Double taux;
    private Client titulaire;
}
