package com.georges.banque.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.georges.banque.model.Agent;
import com.georges.banque.model.Client;
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
    
    @GetMapping("/Agents/{agentName}") 
    public Optional<Agent> getAgentByName(@PathVariable String name){
	List<Agent> listeDesAgents = this.getAllAgents();
	Optional<Agent> agentTrouve =  listeDesAgents.stream()
		      				     .filter(agent -> agent.getNom().equals(name))
		      				     .findFirst();
	return agentTrouve;
    }
    
    @PostMapping("/Agent")
    public Agent addAgent(Agent agent) {
	return as.addAgent(agent);
    }
    
    @PutMapping("/Agent/{agent}/{client}")
    public void addClientToAgent(@PathVariable Agent agent, @PathVariable Client client) {
	agent.getListeDeClients().add(client);
    }
    
    @DeleteMapping("/Agent/{agent}")
    public void deleteAgent(@PathVariable Agent agent) {
	as.deleteAgent(agent);
    }
    
    @DeleteMapping("/Agent/{agent}/{client}")
    public boolean deleteClient(@PathVariable Agent agent, @PathVariable Client client) {
	return agent.getListeDeClients().remove(client);
    }
}
