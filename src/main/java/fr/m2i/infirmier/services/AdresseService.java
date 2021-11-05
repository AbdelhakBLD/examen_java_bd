package fr.m2i.infirmier.services;

import fr.m2i.infirmier.models.Adresse;

import java.util.List;
import java.util.Optional;

public interface AdresseService {
    public List<Adresse> findAll();
    public Optional<Adresse> findById(Long id_adresse);
    public Adresse create(Adresse adresse);
    public Adresse update(Adresse adresse);
}
