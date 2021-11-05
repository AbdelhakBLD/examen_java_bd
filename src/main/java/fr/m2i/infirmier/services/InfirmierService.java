package fr.m2i.infirmier.services;

import fr.m2i.infirmier.models.Infirmier;

import java.util.List;
import java.util.Optional;

public interface InfirmierService {
    public List<Infirmier> findAll();
    public Optional<Infirmier> findById(Long id_infirmier);
    public Infirmier create(Infirmier infirmier);
    public Infirmier update(Infirmier infirmier);
    public void delete(Long id_infirmier);
}
