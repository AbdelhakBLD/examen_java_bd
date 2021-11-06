package fr.m2i.infirmier.repositories;

import fr.m2i.infirmier.models.Adresse;
import fr.m2i.infirmier.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    @Query("SELECT ad FROM Adresse ad WHERE ad.ville = :ville")
    public Optional<List<Adresse>> findByVille(@Param("ville") String ville);
}
