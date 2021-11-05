package fr.m2i.infirmier.controllers;

import fr.m2i.infirmier.models.Infirmier;
import fr.m2i.infirmier.services.InfirmierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping()
public class InfirmierController {
    private InfirmierService infirmierService;

    public InfirmierController(InfirmierService infirmierService) {
        this.infirmierService = infirmierService;
    }

    @GetMapping("/infirmiers")
    public List<Infirmier> findAll() {
        return this.infirmierService.findAll();
    }

    @GetMapping("/infirmiers/{id}")
    public Optional<Infirmier> findById(@PathVariable Long id) {
        return this.infirmierService.findById(id);
    }

    @PostMapping("/infirmiers")
    @ResponseBody
    public Infirmier send(@RequestBody Infirmier infirmier) {
        return this.infirmierService.create(infirmier);
    }

    @DeleteMapping("/infirmiers/{id}")
    public void delete(@PathVariable Long id) {
        this.infirmierService.delete(id);
    }
}
