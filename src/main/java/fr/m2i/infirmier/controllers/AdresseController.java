package fr.m2i.infirmier.controllers;

import fr.m2i.infirmier.models.Adresse;
import fr.m2i.infirmier.services.AdresseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

public class AdresseController {
    private AdresseService adresseService;

    public AdresseController(AdresseService adresseService) {
        this.adresseService = adresseService;
    }

    @GetMapping("/adresses")
    public List<Adresse> findAll() {
        return this.adresseService.findAll();
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

    @GetMapping("/adresses?ville={ville}")
    public List<Adresse> findbyTermName(@PathVariable String ville) {
        return this.adresseService.findbyTermName(ville);
    }
}
