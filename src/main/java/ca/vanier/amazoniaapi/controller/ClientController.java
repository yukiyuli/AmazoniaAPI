package ca.vanier.amazoniaapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import ca.vanier.amazoniaapi.entity.Client;
import ca.vanier.amazoniaapi.service.ClientService;

@RestController

public class ClientController {
    
@Autowired
 private ClientService clientService;

 // Save operation
 @PostMapping("/clients")
 public Client saveClient(
          @RequestBody Client client) {
     return clientService.saveClient(client);
 }

 // Read operation
 @GetMapping("/clients")
 public List<Client> fetchClientList() {
     return clientService.fetchClientList();
 }

 // Update operation
 @PutMapping("/clients/{id}")
 public Client updateClient(@RequestBody Client client,
         @PathVariable("id") Integer clientID) {
     return clientService.updateClient(
             client, clientID);
 }

 // Delete operation
 @DeleteMapping("/clients/{id}")
 public String deleteClientById(@PathVariable("id") Integer clientID) {
     clientService.deleteClientById(
             clientID);
     return "Deleted Successfully";
 }
}
