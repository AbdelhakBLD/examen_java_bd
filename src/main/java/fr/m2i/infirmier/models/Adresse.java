package fr.m2i.infirmier.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
public class Adresse {
    @Id@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String numero;
    private String rue;
    private Integer codePostale;
    private String ville;
}
