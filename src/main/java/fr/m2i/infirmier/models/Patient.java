package fr.m2i.infirmier.models;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.sql.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String sexe;
    private BigInteger numeroDeSecuriteSociale;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "adresse_patient",referencedColumnName = "id")
    private Adresse adressePatient;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "infirmier_patient",referencedColumnName = "id")
    private Infirmier infirmierPatient;
}
