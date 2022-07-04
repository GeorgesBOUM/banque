package com.georges.banque.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "agent")
public class Agent {
    private Long id;
    private String nom;
    private String prenom;
    private List<Client> listeDeClients;
}
