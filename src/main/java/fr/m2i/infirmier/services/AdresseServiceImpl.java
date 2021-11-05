package fr.m2i.infirmier.services;

import fr.m2i.infirmier.models.Adresse;
import fr.m2i.infirmier.models.Infirmier;
import fr.m2i.infirmier.repositories.AdresseRepository;
import fr.m2i.infirmier.repositories.InfirmierRepository;

import java.util.List;
import java.util.Optional;

public class AdresseServiceImpl implements AdresseService {
    private AdresseRepository adresseRepository;

    public AdresseServiceImpl(AdresseRepository adresseRepository) {
        this.adresseRepository = adresseRepository;
    }

    public List<Adresse> findAll() {
        return this.adresseRepository.findAll();
    }

    public Optional<Adresse> findById(Long id_adresse) {
        return this.adresseRepository.findById(id_adresse);
    }

    public Adresse create(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }

    public Adresse update(Adresse adresse) {
        return this.adresseRepository.save(adresse);
    }
}
