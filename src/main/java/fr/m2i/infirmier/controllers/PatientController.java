package fr.m2i.infirmier.controllers;

import fr.m2i.infirmier.models.Patient;
import fr.m2i.infirmier.services.PatientService;
import org.springframework.context.annotation.Primary;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class PatientController {

    private PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }

    @GetMapping("/patients/all")
    public List<Patient> findAll() {
        return this.patientService.findAll();
    }

    @GetMapping("/patients/{id}")
    public Optional<Patient> findById(@PathVariable Long id) {
        return this.patientService.findById(id);
    }

    @GetMapping("/patients")
    public Optional<List<Patient>> findByNomAndPrenom(@RequestParam("nom") String nom, @RequestParam("prenom")  String prenom) {
        return this.patientService.findPatientByNomAndByPrenom(nom, prenom);
    }

    @PostMapping("/patients")
    @ResponseBody
    public Patient send(@RequestBody Patient patient) {
        return this.patientService.create(patient);
    }

    @DeleteMapping("/patients/{id}")
    public void delete(@PathVariable Long id) {
        this.patientService.delete(id);
    }


}
