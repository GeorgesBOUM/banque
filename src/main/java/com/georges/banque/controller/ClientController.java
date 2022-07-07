package com.georges.banque.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.georges.banque.service.ClientService;

@RestController
public class ClientController {
    @Autowired
    ClientService cs;
}
