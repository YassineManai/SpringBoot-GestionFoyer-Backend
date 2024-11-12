package com.example.foyerprojectspring.Services;

import com.example.foyerprojectspring.Entities.Chambre;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IChambreService {
    Chambre addChambre(Chambre chambre);

    Chambre getChambreById(long idChambre);

    Chambre updateChambre(Chambre chambre);

    void deleteChambre(Chambre chambre);

    List<Chambre> getAllChambre();

    void deleteChambreById(long idChambre);
}
