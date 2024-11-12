package com.example.foyerprojectspring.Services;


import com.example.foyerprojectspring.Entities.Foyer;
import com.example.foyerprojectspring.Entities.Universite;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite(Universite universite);

    Universite getUniversiteById(long idUniversite);

    Universite updateUniversite(Universite universite);

    void deleteUniversite(Universite universite);

    List<Universite> getAllUniversite();

    Universite affecterFoyerExistsToUniversite(long id, Foyer foyer);

}