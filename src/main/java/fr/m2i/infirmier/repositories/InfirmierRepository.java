package fr.m2i.infirmier.repositories;

import fr.m2i.infirmier.models.Infirmier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InfirmierRepository extends JpaRepository<Infirmier, Long> {

}
