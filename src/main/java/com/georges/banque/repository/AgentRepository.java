package com.georges.banque.repository;

import org.springframework.data.repository.CrudRepository;

import com.georges.banque.model.Agent;

public interface AgentRepository extends CrudRepository<Agent, Long> {

}
