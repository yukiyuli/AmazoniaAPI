package ca.vanier.amazoniaapi.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import ca.vanier.amazoniaapi.entity.Client;
import ca.vanier.amazoniaapi.repository.ClientRepository;



@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ClientRepository clientRepository;

        // Save operation
        @Override
        public Client saveClient(Client client) {
            return clientRepository.save(client);
        }
    
        // Read operation
        @Override
        public List<Client> fetchClientList() {
            return (List<Client>) clientRepository.findAll();
        }
    
        // Update operation
        @Override
        public Client updateClient(Client client,
                Integer clientID) {
            Client depDB = clientRepository.findById(clientID)
                    .get();
            if (Objects.nonNull(client.getFirstName())
                    && !"".equalsIgnoreCase(
                            client.getFirstName())) {
                depDB.setFirstName(
                        client.getFirstName());
            }
            if (Objects.nonNull(
                    client.getLastName())
                    && !"".equalsIgnoreCase(
                            client.getLastName())) {
                depDB.setLastName(
                        client.getLastName());
            }
            if (Objects.nonNull(client.getEmail())
                    && !"".equalsIgnoreCase(
                            client.getEmail())) {
                depDB.setEmail(
                        client.getEmail());
            }
            return clientRepository.save(depDB);
        }
    
        // Delete operation
        @Override
        public void deleteClientById(Integer clientID) {
            clientRepository.deleteById(clientID);
        }

}
