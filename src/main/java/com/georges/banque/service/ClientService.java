package com.georges.banque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.georges.banque.model.Client;
import com.georges.banque.repository.ClientRepository;
import com.google.common.collect.Lists;

@Service
public class ClientService {
    @Autowired
    ClientRepository cr;
    
    public Optional<Client> getClientById(Long id) {
	return cr.findById(id);
    }
    
    public List<Client> getAllClients() {
	return Lists.newArrayList(cr.findAll());
    }
    
    public Client addClient(Client client) {
	return cr.save(client);
    }
}
