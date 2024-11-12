package com.example.foyerprojectspring.Controllers;


import com.example.foyerprojectspring.Entities.Chambre;
import com.example.foyerprojectspring.Services.IChambreService;
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
@RequestMapping("api/chambres")
@Tag(name = "Gestion Chambre", description = "API for managing Chambres")
public class ChambreController {

    IChambreService chambreService;

    @PostMapping()
    @Operation(summary = "Add a new Chambre", description = "Creates a new Chambre and returns the created object.")
    public Chambre ajoutChambre(@RequestBody Chambre chambre) {
        return chambreService.addChambre(chambre);
    }

    @GetMapping("{idChambre}")
    @Operation(summary = "Get Chambre by ID", description = "Retrieves a Chambre by its ID.")
    public Chambre getChambre(@PathVariable("idChambre") long idChambre) {
        return chambreService.getChambreById(idChambre);
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Chambre", description = "Deletes a Chambre based on the provided Chambre object.")
    public void deleteChambre(@RequestBody Chambre chambre) {
        chambreService.deleteChambre(chambre);
    }

    @PutMapping()
    @Operation(summary = "Update a Chambre", description = "Updates an existing Chambre and returns the updated object.")
    public Chambre modifierChambre(@RequestBody Chambre chambre) {
        return chambreService.updateChambre(chambre);
    }

    @GetMapping()
    @Operation(summary = "Get all Chambres", description = "Retrieves a list of all Chambres.")
    public List<Chambre> getAllChambre() {
        return chambreService.getAllChambre();
    }
}
