package com.georges.banque.repository;

import org.springframework.data.repository.CrudRepository;

import com.georges.banque.model.Client;

public interface ClientRepository extends CrudRepository<Client, Long> {

}
