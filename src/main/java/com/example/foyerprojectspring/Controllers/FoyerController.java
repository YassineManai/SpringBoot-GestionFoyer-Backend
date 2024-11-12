package com.example.foyerprojectspring.Controllers;


import com.example.foyerprojectspring.Entities.Foyer;
import com.example.foyerprojectspring.Services.IFoyerService;
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
@RequestMapping("api/foyers")
@Tag(name = "Gestion Foyer", description = "API for managing Foyers")
public class FoyerController {

    IFoyerService foyerService;

    @PostMapping()
    @Operation(summary = "Add a new Foyer", description = "Creates a new Foyer and returns the created object.")
    public Foyer ajoutFoyer(@RequestBody Foyer foyer) {
        return foyerService.addFoyer(foyer);
    }

    @GetMapping("{idFoyer}")
    @Operation(summary = "Get Foyer by ID", description = "Retrieves a Foyer by its ID.")
    public Foyer getFoyer(@PathVariable("idFoyer") long idFoyer) {
        return foyerService.getFoyerById(idFoyer);
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Foyer", description = "Deletes a Foyer based on the provided Foyer object.")
    public void deleteFoyer(@RequestBody Foyer foyer) {
        foyerService.deleteFoyer(foyer);
    }

    @PutMapping()
    @Operation(summary = "Update a Foyer", description = "Updates an existing Foyer and returns the updated object.")
    public Foyer modifierFoyer(@RequestBody Foyer foyer) {
        return foyerService.updateFoyer(foyer);
    }

    @GetMapping()
    @Operation(summary = "Get all Foyers", description = "Retrieves a list of all Foyers.")
    public List<Foyer> getAllFoyer() {
        return foyerService.getAllFoyer();
    }

    @PutMapping("/blocToFoyer/{idbloc}/{idfoyer}")
    @Operation(summary = "assign Bloc To Foyer", description = "assign Bloc To Foyer.")
    public void assignBlocToFoyer(@PathVariable("idbloc") long idbloc, @PathVariable("idfoyer") long idfoyer) {
        foyerService.assignBlocToFoyer(idbloc, idfoyer);
    }
}
