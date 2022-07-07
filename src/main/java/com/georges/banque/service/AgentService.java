package com.georges.banque.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.georges.banque.model.Agent;
import com.georges.banque.repository.AgentRepository;
import com.google.common.collect.Lists;

@Service
public class AgentService {
    @Autowired
    AgentRepository ar;
    
    public Optional<Agent> getAgentById(Long id) {
	return ar.findById(id);
    }
    
    public List<Agent> getAllAgents() {
	return Lists.newArrayList(ar.findAll());
    }
    
    public Agent addAgent(Agent agent) {
	return ar.save(agent);
    }
    
    public void deleteAgent(Agent agent) {
	ar.delete(agent);
    }
}
