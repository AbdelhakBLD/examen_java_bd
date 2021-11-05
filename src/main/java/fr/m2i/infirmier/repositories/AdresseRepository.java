package fr.m2i.infirmier.repositories;

import fr.m2i.infirmier.models.Adresse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface AdresseRepository extends JpaRepository<Adresse, Long> {
    @Query("SELECT ad FROM Adresse ad WHERE ad.ville = '%searchTerm%'") // HQL
    public List<Adresse> findbyNameContainTerm(@Param("searchTerm") String mot);
}
