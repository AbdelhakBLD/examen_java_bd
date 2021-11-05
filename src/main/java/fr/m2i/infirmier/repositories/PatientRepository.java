package fr.m2i.infirmier.repositories;

import fr.m2i.infirmier.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {
}
