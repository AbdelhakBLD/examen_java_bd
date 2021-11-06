package fr.m2i.infirmier.controllers;

import fr.m2i.infirmier.models.Adresse;
import fr.m2i.infirmier.models.Patient;
import fr.m2i.infirmier.services.AdresseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class AdresseController {
    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping("/adresses/all")
    public List<Adresse> findAll() {
        return this.adresseService.findAll();
    }

    @GetMapping("/adresses")
    public Optional<List<Adresse>> findByVille(@RequestParam("ville") String ville) {
        return this.adresseService.findByVille(ville);
    }

    @GetMapping("/adresses/{id}")
    public Optional<Adresse> findById(@PathVariable Long id) {
        return this.adresseService.findById(id);
    }

    @PostMapping("/adresses")
    @ResponseBody
    public Adresse send(@RequestBody Adresse adresse) {
        return this.adresseService.create(adresse);
    }

}
