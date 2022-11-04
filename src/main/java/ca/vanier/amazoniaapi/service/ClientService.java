package ca.vanier.amazoniaapi.service;

import java.util.List;
import ca.vanier.amazoniaapi.entity.Client;

public interface ClientService {

        // Save operation
        Client saveClient(Client client);

        // Read operation
        List<Client> fetchClientList();
    
        // Update operation
        Client updateClient(Client client, Integer clientID);
    
        // Delete operation
        void deleteClientById(Integer clientID);
    
}
