package com.georges.banque.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.georges.banque.model.Agent;
import com.georges.banque.service.AgentService;

@RestController
public class AgentController {
    @Autowired
    AgentService as;
    
    @GetMapping("/agents/{agentId}")
    public Optional<Agent> getAgentById(@PathVariable Long id){
	return as.getAgentById(id);
    }
    
    @GetMapping("/agents")
    public List<Agent> getAllAgents(){
	return as.getAllAgents();
    }
    
}
