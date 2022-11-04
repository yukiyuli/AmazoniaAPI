package ca.vanier.amazoniaapi.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import ca.vanier.amazoniaapi.entity.Client;

// Annotation
@Repository

// Interface extending CrudRepository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    
}
