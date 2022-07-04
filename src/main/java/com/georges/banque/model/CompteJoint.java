package com.georges.banque.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "compte_joint")
public class CompteJoint extends Compte {
    List<Client> listeDeTitulaires;
}
