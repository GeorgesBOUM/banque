package com.georges.banque.model;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "compte_courant")
public class CompteCourant extends Compte {
    Client titulaire;
}
