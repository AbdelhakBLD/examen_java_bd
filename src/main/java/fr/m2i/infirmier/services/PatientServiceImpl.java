package fr.m2i.infirmier.services;

import fr.m2i.infirmier.models.Infirmier;
import fr.m2i.infirmier.models.Patient;
import fr.m2i.infirmier.repositories.InfirmierRepository;
import fr.m2i.infirmier.repositories.PatientRepository;

import java.util.List;
import java.util.Optional;

public class PatientServiceImpl implements PatientService {
    private PatientRepository patientRepository;

    public PatientServiceImpl(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<Patient> findAll() {
        return this.patientRepository.findAll();
    }

    public Optional<Patient> findById(Long id_patient) {
        return this.patientRepository.findById(id_patient);
    }

    public Optional<List<Patient>> findPatientByNomAndByPrenom(String nom, String prenom) {
        return this.patientRepository.findPatientByNomAndByPrenom(nom, prenom);
    }

    public Patient create(Patient patient) {
        return this.patientRepository.save(patient);
    }

    public Patient update(Patient patient) {
        return this.patientRepository.save(patient);
    }

    public void delete(Long id_patient) {
        this.patientRepository.deleteById(id_patient);
    }
}
