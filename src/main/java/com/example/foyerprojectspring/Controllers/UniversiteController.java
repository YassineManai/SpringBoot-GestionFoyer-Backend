package com.example.foyerprojectspring.Controllers;

import com.example.foyerprojectspring.Entities.Foyer;
import com.example.foyerprojectspring.Entities.Universite;
import com.example.foyerprojectspring.Services.IUniversiteService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@RequestMapping("api/universites")
@Tag(name = "Gestion Université", description = "API for managing Universités")
public class UniversiteController {


    IUniversiteService universiteService;

    @PostMapping()
    @Operation(summary = "Add a new Université", description = "Creates a new Université and returns the created object.")
    public Universite ajoutUniversite(@RequestBody Universite universite) {
        return universiteService.addUniversite(universite);
    }

    @GetMapping("{idUniversite}")
    @Operation(summary = "Get Université by ID", description = "Retrieves a Université by its ID.")
    public Universite getUniversite(@PathVariable("idUniversite") long idUniversite) {
        return universiteService.getUniversiteById(idUniversite);
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Université", description = "Deletes a Université based on the provided Université object.")
    public void deleteUniversite(@RequestBody Universite universite) {
        universiteService.deleteUniversite(universite);
    }

    @PutMapping()
    @Operation(summary = "Update a Université", description = "Updates an existing Université and returns the updated object.")
    public Universite modifierUniversite(@RequestBody Universite universite) {
        return universiteService.updateUniversite(universite);
    }

    @GetMapping()
    @Operation(summary = "Get all Universités", description = "Retrieves a list of all Universités.")
    public List<Universite> getAllUniversite() {
        return universiteService.getAllUniversite();
    }

    @PostMapping("/addFoyerToUniv/{idUniversite}")
    @Operation(summary = "affecterFoyerExistsToUniversite", description = "affecterFoyerExistsToUniversite.")
    public Universite affecterFoyerExistsToUniversite(@RequestBody Foyer foyer, @PathVariable("idUniversite") long idUniversite) {
        return universiteService.affecterFoyerExistsToUniversite(idUniversite,foyer);

    }
}
