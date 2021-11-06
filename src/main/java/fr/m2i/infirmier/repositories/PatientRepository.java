package fr.m2i.infirmier.repositories;

import fr.m2i.infirmier.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    @Query("SELECT pa FROM Patient pa WHERE pa.nom = :nom AND pa.prenom = :prenom")
    public Optional<List<Patient>> findPatientByNomAndByPrenom(@Param("nom") String nom, @Param("prenom")String prenom);

}
