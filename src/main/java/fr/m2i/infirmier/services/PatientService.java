package fr.m2i.infirmier.services;

import fr.m2i.infirmier.models.Infirmier;
import fr.m2i.infirmier.models.Patient;

import java.util.List;
import java.util.Optional;

public interface PatientService {
    public List<Patient> findAll();
    public Optional<Patient> findById(Long id_patient);
    public Patient create(Patient patient);
    public Patient update(Patient patient);
    public void delete(Long id_patient);
}
