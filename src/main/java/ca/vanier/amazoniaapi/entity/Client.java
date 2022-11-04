package ca.vanier.amazoniaapi.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

@Entity(name = "CLIENT")
@Table(name = "CLIENT")

public class Client {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int clientID;
    private String firstName;
    private String lastName;
    private String email;

    

}