package fr.m2i.infirmier;

import fr.m2i.infirmier.repositories.AdresseRepository;
import fr.m2i.infirmier.repositories.InfirmierRepository;
import fr.m2i.infirmier.repositories.PatientRepository;
import fr.m2i.infirmier.services.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InfirmierConfiguration {

    @Bean
    public InfirmierService infirmierService(InfirmierRepository infirmierRepository){
        return new InfirmierServiceImpl(infirmierRepository);
    }

    @Bean
    public PatientService patientService(PatientRepository patientRepository){
        return new PatientServiceImpl(patientRepository);
    }

    @Bean
    public AdresseService adresseService(AdresseRepository adresseRepository){
        return new AdresseServiceImpl(adresseRepository);
    }

}
