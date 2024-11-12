package com.example.foyerprojectspring.Controllers;

import com.example.foyerprojectspring.Entities.Bloc;
import com.example.foyerprojectspring.Services.BlocServiceImp;
import com.example.foyerprojectspring.Services.IBlocService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("api/blocs")
@Tag(name = "Gestion Bloc", description = "API for managing Blocs")
public class BlocController {



    BlocServiceImp blocService;

    @PostMapping()
    @Operation(summary = "Add a new Bloc", description = "Creates a new Bloc and returns the created object.")
    public Bloc ajoutBloc(@RequestBody Bloc bloc) {
        return blocService.addBloc(bloc);
    }

    @GetMapping("{idBloc}")
    @Operation(summary = "Get Bloc by ID", description = "Retrieves a Bloc by its ID.")
    public Bloc getBloc(@PathVariable("idBloc") long idBloc) {
        return blocService.getBlocById(idBloc);
    }

    @DeleteMapping()
    @Operation(summary = "Delete a Bloc", description = "Deletes a Bloc based on the provided Bloc object.")
    public void deleteBloc(@RequestBody Bloc bloc) {
        blocService.deleteBloc(bloc);
    }

    @PutMapping()
    @Operation(summary = "Update a Bloc", description = "Updates an existing Bloc and returns the updated object.")
    public Bloc modifierBloc(@RequestBody Bloc bloc) {
        return blocService.updateBloc(bloc);
    }

    @GetMapping()
    @Operation(summary = "Get all Blocs", description = "Retrieves a list of all Blocs.")
    public List<Bloc> getAllBloc() {
        return blocService.getAllBloc();
    }

    @PostMapping("/addBlocChambre")
    @Operation(summary = "ajouter Bloc Et Chambres Associe", description = "ajouter Bloc Et Chambres Associe.")
    public Bloc addBlocChambre(@RequestBody Bloc bloc) {
        return blocService.ajouterBlocEtChambresAssocie(bloc);
    }


}